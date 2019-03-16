package org.rub.nds.sso.provider;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.proc.BadJOSEException;
import com.nimbusds.jose.proc.SecurityContext;
import com.nimbusds.jose.proc.SimpleSecurityContext;
import com.nimbusds.jose.util.DefaultResourceRetriever;
import com.nimbusds.jwt.SignedJWT;
import com.nimbusds.oauth2.sdk.auth.Secret;
import com.nimbusds.oauth2.sdk.id.ClientID;
import com.nimbusds.oauth2.sdk.id.Issuer;
import com.nimbusds.openid.connect.sdk.Nonce;
import com.nimbusds.openid.connect.sdk.op.OIDCProviderMetadata;
import com.nimbusds.openid.connect.sdk.validators.IDTokenClaimsVerifier;
import com.nimbusds.openid.connect.sdk.validators.IDTokenValidator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.futuretrust.validationservice.sso.library.ConfigDatabase;
import org.rub.nds.futuretrust.validationservice.sso.library.VerificationException;
import org.rub.nds.sso.api.AuthenticatedUserType;
import org.rub.nds.sso.api.OidcType;
import org.rub.nds.sso.api.OidcVerificationChecksType;
import org.rub.nds.sso.api.OidcVerificationParametersType;
import org.rub.nds.sso.api.SsoType;
import org.rub.nds.sso.api.VerificationLogType;
import org.rub.nds.sso.api.VerificationProfileType;
import org.rub.nds.sso.api.VerificationResponseType;

/**
 *
 * @author vladi
 */
public class OidcEidProvider extends EidProvider {

    private static final double VERSION = 1.0;

    private static final String INFO = "OIDC eID provider v" + VERSION;

    private static final String NAME = "OIDC eID";

    private static final String TYPE = "OIDC";

    public OidcEidProvider() {
        super(NAME, INFO, VERSION, TYPE);
    }

    public OidcEidProvider(String name, String info, double version, String type) {
        super(name, info, version, type);
    }

    @Override
    public VerificationResponseType verify(SsoType ssoType) {
        VerificationResponseType result = new VerificationResponseType();
        try {
            /*
             * - fetch verification profile if specified - merge verification
             * parameters - use either incomming verification checks or
             * specificed in the profile - verify - return result
             */

            OidcType oidcType = (OidcType) ssoType;

            VerificationProfileType profile = getVerificationProfile(oidcType);
            mergeVerificationParameters(oidcType, profile);
            mergeVerificationChechs(oidcType, profile);
            verify(oidcType);

            result.setResult(true);
            AuthenticatedUserType user = new AuthenticatedUserType();
            SignedJWT jwt = SignedJWT.parse(oidcType.getOidcResponse());
            user.setUserID(jwt.getJWTClaimsSet().getIssuer() + "#" + jwt.getJWTClaimsSet().getSubject());
            result.setAuthenticatedUser(user);
            result.setOidcVerifiedChecks(oidcType.getOidcVerificiationChecks());

            return result;
        } catch (VerificationException | URISyntaxException | ParseException | JOSEException ex) {
            VerificationLogType log = new VerificationLogType();
            log.setVerificationLog(ex.getMessage());
            result.setResult(false);
            result.setVerificationLog(log);
            return result;
        }
    }

    private void verify(OidcType oidcType) throws ParseException, URISyntaxException, JOSEException,
            VerificationException {
        try {
            /*
             * fetch KeyMaterial prepare arguments for verification verify
             */

            OidcVerificationChecksType checks = oidcType.getOidcVerificiationChecks();

            SignedJWT jwt = SignedJWT.parse(oidcType.getOidcResponse());
            OIDCProviderMetadata providerMetadata;

            providerMetadata = getMetadata(oidcType, jwt);
            Issuer issuer = getIssuer(oidcType, jwt, providerMetadata);
            ClientID clientid = getClientID(oidcType, jwt, providerMetadata);
            Nonce nonce = getNonce(oidcType, jwt, providerMetadata);
            IDTokenValidator validator;

            if (oidcType.getOidcVerificiationChecks().isVerifySignature()) {
                if (jwt.getHeader().getAlgorithm().toJSONString().contains("HS")) {
                    Secret secret = new Secret(oidcType.getOidcVerificationParameters().getClientSecret());
                    validator = new IDTokenValidator(issuer, clientid, jwt.getHeader().getAlgorithm(), secret);
                } else if (providerMetadata != null) {
                    validator = new IDTokenValidator(issuer, clientid, jwt.getHeader().getAlgorithm(), providerMetadata
                            .getJWKSetURI().toURL(), new DefaultResourceRetriever());
                } else {
                    Secret secret = new Secret(oidcType.getOidcVerificationParameters().getClientSecret());
                    validator = new IDTokenValidator(issuer, clientid, jwt.getHeader().getAlgorithm(), secret);
                }
                validator.validate(jwt, nonce);
            } else {
                IDTokenClaimsVerifier verifier = new IDTokenClaimsVerifier(issuer, clientid, nonce, 30 * 60);
                SecurityContext ctx = new SimpleSecurityContext();
                verifier.verify(jwt.getJWTClaimsSet(), ctx);
            }

        } catch (BadJOSEException | MalformedURLException | VerificationException ex) {
            throw new VerificationException(ex.getMessage());
        }

    }

    private Nonce getNonce(OidcType oidcType, SignedJWT jwt, OIDCProviderMetadata metadata)
            throws VerificationException {
        try {
            if (oidcType.getOidcVerificiationChecks().isVerifyNonce()) {
                return new Nonce(oidcType.getOidcVerificationParameters().getSubClaims());
            } else {
                return new Nonce(jwt.getJWTClaimsSet().getStringClaim("nonce"));
            }
        } catch (NullPointerException ex) {
            throw new VerificationException("Nonce in the config is empty");
        } catch (ParseException ex) {
            throw new VerificationException("Cannot parse Nonce from JWT!");
        }
    }

    private ClientID getClientID(OidcType oidcType, SignedJWT jwt, OIDCProviderMetadata metadata)
            throws VerificationException {
        try {
            if (oidcType.getOidcVerificiationChecks().isVerifyAudience()) {
                return new ClientID(oidcType.getOidcVerificationParameters().getAudience());
            } else {
                return new ClientID(jwt.getJWTClaimsSet().getAudience().get(0));
            }
        } catch (NullPointerException ex) {
            throw new VerificationException("Audience in the config is empty");
        } catch (ParseException ex) {
            throw new VerificationException("Cannot parse ClientID from JWT!");
        }
    }

    private Issuer getIssuer(OidcType oidcType, SignedJWT jwt, OIDCProviderMetadata metadata)
            throws VerificationException {
        try {
            if (oidcType.getOidcVerificiationChecks().isVerifyIssuer()) {
                return metadata.getIssuer();
            } else {
                return new Issuer(jwt.getJWTClaimsSet().getIssuer());
            }
        } catch (NullPointerException ex) {
            throw new VerificationException("Issuer from Metadata needed but metadata is null!");
        } catch (ParseException ex) {
            throw new VerificationException("Cannot parse Issuer from JWT!");
        }
    }

    private OIDCProviderMetadata getMetadata(OidcType oidcType, SignedJWT jwt) {
        try {
            // IF a MetadataURL is specified, it will be resolved and stored
            if (oidcType.getOidcVerificationParameters().getOidcMetadataUrl() != null
                    && !oidcType.getOidcVerificationParameters().getOidcMetadataUrl().isEmpty()) {
                return OIDCProviderMetadata.parse(new DefaultResourceRetriever().retrieveResource(
                        new URL(oidcType.getOidcVerificationParameters().getOidcMetadataUrl())).getContent());
            } // If a metadata is provided, use it
            else if (oidcType.getOidcVerificationParameters().getOidcMetadata() != null
                    && !oidcType.getOidcVerificationParameters().getOidcMetadata().isEmpty()) {
                return OIDCProviderMetadata.parse(oidcType.getOidcVerificationParameters().getOidcMetadata());
            } else {
                return OIDCProviderMetadata.parse(jwt.getJWTClaimsSet().getIssuer());
            }
        } catch (IOException | com.nimbusds.oauth2.sdk.ParseException | ParseException | NullPointerException ex) {
            return null;
        }
    }

    private static JWKSet loadKeys(URI uri) throws JOSEException {
        String in = "";
        try {
            in = callURI(uri.toURL());
            JWKSet publicKeys = JWKSet.parse(in);

            return publicKeys;
        } catch (IOException | ParseException ex) {
            throw new JOSEException("Cannot load or convert JWKSet deployed on: " + uri.toASCIIString()
                    + ". Cannot parse: " + in);
        }
    }

    private static String callURI(URL url) throws IOException {
        InputStream in = null;
        try {
            URLConnection con = url.openConnection();
            String readStream = inputStream2String(con.getInputStream());
            return readStream;
        } catch (IOException e) {
            throw new IOException("Cannot read from URL:" + url.toString() + ". Exception:" + e.getMessage());
        }

    }

    private static String inputStream2String(InputStream in) {
        if (in == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private void mergeVerificationChechs(OidcType oidcType, VerificationProfileType profile) {
        if (oidcType.getOidcVerificiationChecks() == null) {
            oidcType.setOidcVerificiationChecks(profile.getOidcVerificationChecks());
        }
    }

    private void mergeVerificationParameters(OidcType oidcType, VerificationProfileType profile) {
        /*
         * - getParameters from specified verification profile - merge these
         * with the specified parameters within the verification request -
         * return the new parameters
         */

        OidcVerificationParametersType stored_parameters = profile.getOidcVerificationParameters();
        OidcVerificationParametersType incomming_parameters = oidcType.getOidcVerificationParameters();

        if (incomming_parameters == null) {
            oidcType.setOidcVerificationParameters(stored_parameters);
        } else if (stored_parameters == null) {
            return;
        } else {
            if (incomming_parameters.getAccessToken() == null) {
                incomming_parameters.setAccessToken(stored_parameters.getAccessToken());
            }
            if (incomming_parameters.getAudience() == null) {
                incomming_parameters.setAudience(stored_parameters.getAudience());
            }
            if (incomming_parameters.getClientSecret() == null) {
                incomming_parameters.setClientSecret(stored_parameters.getClientSecret());
            }
            if (incomming_parameters.getCode() == null) {
                incomming_parameters.setCode(stored_parameters.getCode());
            }
            if (incomming_parameters.getOidcMetadata() == null) {
                incomming_parameters.setOidcMetadata(stored_parameters.getOidcMetadata());
            }
            if (incomming_parameters.getOidcMetadataUrl() == null) {
                incomming_parameters.setOidcMetadataUrl(stored_parameters.getOidcMetadataUrl());
            }
            if (incomming_parameters.getSubClaims() == null) {
                incomming_parameters.setSubClaims(stored_parameters.getSubClaims());
            }
            if (incomming_parameters.getTimeLimitation() == null) {
                incomming_parameters.setTimeLimitation(stored_parameters.getTimeLimitation());
            }
            if (incomming_parameters.getCnf() == null) {
                incomming_parameters.setCnf(stored_parameters.getCnf());
            }
            if (incomming_parameters.getX509Certificate() == null) {
                incomming_parameters.setX509Certificate(stored_parameters.getX509Certificate());
            }
        }
    }

    private VerificationProfileType getVerificationProfile(OidcType oidcType) {
        for (EntityType entity : ConfigDatabase.getConfig().getRegisteredEntity()) {
            for (VerificationProfileType profile : entity.getVerificationProfile()) {
                if (profile.getID().equalsIgnoreCase(oidcType.getOidcVerificationProfile())) {
                    return profile;
                }
            }
        }
        return null;
    }
}
