package org.rub.nds.sso.provider;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.lang.StringEscapeUtils;
import org.opensaml.common.SAMLObject;
import org.opensaml.saml2.core.AuthnRequest;
import org.opensaml.saml2.core.Response;
import org.opensaml.saml2.metadata.provider.AbstractMetadataProvider;
import org.opensaml.saml2.metadata.provider.DOMMetadataProvider;
import org.opensaml.saml2.metadata.provider.FilesystemMetadataProvider;
import org.opensaml.saml2.metadata.provider.HTTPMetadataProvider;
import org.opensaml.saml2.metadata.provider.MetadataProviderException;
import org.opensaml.saml2.metadata.provider.ResourceBackedMetadataProvider;
import org.opensaml.xml.parse.BasicParserPool;
import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.futuretrust.validationservice.sso.library.ConfigDatabase;
import org.rub.nds.futuretrust.validationservice.sso.library.SAMLVerificationAdapter;
import org.rub.nds.saml.samllib.exceptions.SAMLVerifyException;
import org.rub.nds.saml.samllib.utils.SAMLUtils;
import org.rub.nds.saml.samllib.verifier.SAMLVerifierImpl;
import org.rub.nds.sso.api.AuthenticatedUserType;
import org.rub.nds.sso.api.SamlType;
import org.rub.nds.sso.api.SamlVerificationParametersType;
import org.rub.nds.sso.api.SsoType;
import org.rub.nds.sso.api.VerificationLogType;
import org.rub.nds.sso.api.VerificationProfileType;
import org.rub.nds.sso.api.VerificationResponseType;
import org.rub.nds.sso.exceptions.WrongInputException;
import org.rub.nds.sso.provider.EidProvider;
import org.rub.nds.sso.utils.DecoderUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class SamlEidProvider extends EidProvider {

    private static final double VERSION = 1.0;

    private static final String INFO = "SAML eID provider v" + VERSION;

    private static final String NAME = "SAML eID";

    private static final String TYPE = "SAML";

    public SamlEidProvider() {
        super(NAME, INFO, VERSION, TYPE);
    }

    @Override
    public VerificationResponseType verify(SsoType samlType) {
        VerificationResponseType result = new VerificationResponseType();
        try {
            // SamlType samlType = (SamlType) this.getSecurityObject();
            VerificationProfileType verificationProfile = (VerificationProfileType) this.getVerificationProfile();
            if (samlType != null) {
                Response samlResponse;
                AuthnRequest authRequest;

                samlResponse = (Response) decodeSAMLObject(((SamlType) samlType).getSamlResponse());
                authRequest = (AuthnRequest) decodeSAMLObject(((SamlType) samlType).getSamlRequest());

                if (samlResponse == null) {
                    throw new SAMLVerifyException("Verification without Resonse is useless");
                }

                verificationProfile = new VerificationProfileType();
                for (EntityType entry : ConfigDatabase.getConfig().getRegisteredEntity()) {
                    for (VerificationProfileType profileType : entry.getVerificationProfile()) {
                        if (((SamlType) samlType).getSamlVerificationProfile().equalsIgnoreCase(profileType.getID())) {
                            verificationProfile = profileType;
                        }
                    }
                }
                verificationProfile.setSamlTokenVerificationParameters(setVerificationParams(samlType));

                verificationProfile.setSamlTokenVerificationChecks(SAMLVerificationAdapter.mergeSamlVerificationChecks(
                        verificationProfile.getSamlTokenVerificationChecks(),
                        ((SamlType) samlType).getSamlTokenVerificationChecks()));

                AbstractMetadataProvider provider = getMetadataProvider(verificationProfile);

                SAMLVerifierImpl verifier = new SAMLVerifierImpl(authRequest, provider);
                verifier.verify(samlResponse, verificationProfile);

                result.setResult(true);
                AuthenticatedUserType user = new AuthenticatedUserType();
                user.setUserID(SAMLUtils.getAuthenticatedUser(samlResponse));
                result.setAuthenticatedUser(user);

                result.setSamlTokenVerifiedChecks(((SamlType) samlType).getSamlTokenVerificationChecks());
            }
            return result;
        } catch (Exception e) {
            VerificationLogType log = new VerificationLogType();
            log.setVerificationLog(e.getMessage());
            result.setResult(false);
            result.setVerificationLog(log);
            return result;
        }
    }

    private AbstractMetadataProvider getMetadataProvider(VerificationProfileType verificationProfile)
            throws ParserConfigurationException, MetadataProviderException, IOException, SAXException {
        AbstractMetadataProvider provider;
        if (verificationProfile.getSamlTokenVerificationParameters().getSamlMetadata() != null) {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new InputSource(new StringReader(verificationProfile
                    .getSamlTokenVerificationParameters().getSamlMetadata())));
            provider = new DOMMetadataProvider(doc.getDocumentElement());
            provider.setRequireValidMetadata(true); // Enable validation
            BasicParserPool ppMgr = new BasicParserPool();
            ppMgr.setNamespaceAware(true);
            provider.setParserPool(ppMgr);
            provider.initialize();
        } else if (verificationProfile.getSamlTokenVerificationParameters().getSamlMetadataUrl() != null) {
            provider = new HTTPMetadataProvider(verificationProfile.getSamlTokenVerificationParameters()
                    .getSamlMetadataUrl(), 10000);
            provider.setRequireValidMetadata(true); // Enable validation
            provider.setParserPool(new BasicParserPool());
            provider.initialize();
        } else {
            provider = null;
        }
        return provider;
    }

    private SamlVerificationParametersType setVerificationParams(SsoType ssoType) {
        SamlType samlType = (SamlType) ssoType;
        String profile = samlType.getSamlVerificationProfile();

        // Check if locally stored profile is referenced, if not - no merging
        // required
        if (profile == null || profile.isEmpty()) {
            return samlType.getSamlVerificationParameters();
        } else {
            SamlVerificationParametersType incomming_request = samlType.getSamlVerificationParameters();
            for (EntityType entry : ConfigDatabase.getConfig().getRegisteredEntity()) {
                for (VerificationProfileType profileType : entry.getVerificationProfile()) {
                    if (profile.equalsIgnoreCase(profileType.getID())) {
                        return mergeProfiles(incomming_request, profileType);
                    }
                }
            }
        }
        return samlType.getSamlVerificationParameters();
    }

    private SamlVerificationParametersType mergeProfiles(SamlVerificationParametersType incomming_request,
            VerificationProfileType profileType) {

        if (incomming_request == null) {
            return profileType.getSamlTokenVerificationParameters();
        }

        if (incomming_request.getDestination() == null) {
            incomming_request.setDestination(profileType.getSamlTokenVerificationParameters().getDestination());
        }

        if (incomming_request.getHokX509Certificate() == null) {
            incomming_request.setHokX509Certificate(profileType.getSamlTokenVerificationParameters()
                    .getHokX509Certificate());
        }

        if (incomming_request.getSamlMetadata() == null) {
            incomming_request.setSamlMetadata(profileType.getSamlTokenVerificationParameters().getSamlMetadata());
        }

        if (incomming_request.getSamlMetadataUrl() == null) {
            incomming_request.setSamlMetadataUrl(profileType.getSamlTokenVerificationParameters().getSamlMetadataUrl());
        }

        if (incomming_request.getTimeLimitation() == null) {
            incomming_request.setTimeLimitation(profileType.getSamlTokenVerificationParameters().getTimeLimitation());
        }

        return incomming_request;
    }

    private SAMLObject decodeSAMLObject(String samlObj) throws WrongInputException, UnsupportedEncodingException {
        try {
            return SAMLUtils.buildObjectfromString(DecoderUtils.decodeBase64Mime(samlObj));
        } catch (WrongInputException | NullPointerException ex) {
            throw new WrongInputException("Cannot parse SAML Response");
        }
    }
}
