package org.rub.nds.futuretrust.validationservice.sso.library;

import java.io.File;
import java.util.UUID;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rub.nds.futuretrust.cvs.sso.api.AuthenticationType;
import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.sso.api.OidcVerificationChecksType;
import org.rub.nds.sso.api.OidcVerificationParametersType;
import org.rub.nds.sso.api.SamlTokenVerificationChecksType;
import org.rub.nds.sso.api.SamlVerificationParametersType;
import org.rub.nds.sso.api.VerificationProfileType;

/**
 *
 * @author vladi
 */
public class ConfigurationManagerTest {

    public ConfigurationManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }


    @Test
    public void testSomeMethod() throws PropertyException, JAXBException {
        DatabaseType db = new DatabaseType();
        EntityType entity = new EntityType();
        entity.getVerificationProfile().add(generateSAMLProfile());
        entity.getAuthentication().add(generateIDSecret());
        db.getRegisteredEntity().add(entity);

        entity = new EntityType();
        entity.getVerificationProfile().add(generateOIDCProfile());
        entity.getAuthentication().add(generateIDSecret());
        db.getRegisteredEntity().add(entity);

        storeDB(db);
    }

    private VerificationProfileType generateOIDCProfile() {
        VerificationProfileType profile2 = new VerificationProfileType();
        OidcVerificationChecksType oidcChecks = generateOidcChecks();
        OidcVerificationParametersType oidcParams = gnerateOidcParams();
        profile2.setOidcVerificationParameters(oidcParams);
        profile2.setOidcVerificationChecks(oidcChecks);
        return profile2;
    }

    private OidcVerificationParametersType gnerateOidcParams() {
        OidcVerificationParametersType oidcParams = new OidcVerificationParametersType();
        oidcParams.setAudience("http://test2.com");
        oidcParams.setClientSecret("test123456");
        oidcParams
                .setOidcMetadata("{\"keys\":[{\"kty\":\"RSA\",\"e\":\"AQAB\",\"use\":\"sig\",\"kid\":\"rsa-test\",\"alg\":\"RS256\",\"n\":\"mTkVHAyJoWD0SN9HYji3z44oQwnhHzHnKd-rrUtm0uJJALrs0Hxp0UehU40vanKKB-Zu54RUcnbZ4wJxyS8AAPACV4BIETO0crCKDfyXXH4r4VSrqfGxxmEohBnFCM2RQE6OU3vdGzr46fCUmmhH9b-GloQpMjPJPPKWinNkWchpDwbvJFFAjardXdi_WLiCGcX6zgXBD8U76gEj-NDEObNy8Q5ilWTO_kH-NVuexpVFqU5ibh3geBe32jZ4kNClKpQZIrqv3nnWQQ3-NpPb_hGzPU2ZkxiKgVPNH8V7gVVMlufGAR7vXOqCpI0oWXVOseUH3D0p4thVMHv_vQtUiQ\"}]}");
        return oidcParams;
    }

    private OidcVerificationChecksType generateOidcChecks() {
        OidcVerificationChecksType oidcChecks = new OidcVerificationChecksType();
        oidcChecks.setVerifyAudience(true);
        oidcChecks.setVerifyExpired(true);
        oidcChecks.setVerifyIssuedAt(true);
        oidcChecks.setVerifyNonce(true);
        oidcChecks.setVerifyIssuer(true);
        return oidcChecks;
    }

    private VerificationProfileType generateSAMLProfile() {
        VerificationProfileType profile1 = new VerificationProfileType();
        SamlTokenVerificationChecksType samlChecks = samlChecks();
        SamlVerificationParametersType verifyParams = samlParams();
        profile1.setSamlTokenVerificationChecks(samlChecks);
        profile1.setSamlTokenVerificationParameters(verifyParams);
        return profile1;
    }

    private void storeDB(DatabaseType db) throws PropertyException, JAXBException {
        File file = new File(
                "/home/vladi/NetBeansProjects/FutureTrust/SSOValidationService/Library/src/test/resources/configDB.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DatabaseType.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        QName qName = new QName("org.rub.nds.futuretrust.cvs.sso.api", "DataBaseType");
        JAXBElement<DatabaseType> root = new JAXBElement<>(qName, DatabaseType.class, db);
        jaxbMarshaller.marshal(root, file);
    }

    private SamlTokenVerificationChecksType samlChecks() {
        SamlTokenVerificationChecksType samlChecks = new SamlTokenVerificationChecksType();
        samlChecks.setVerifySAMLAssertionSignatureTrusted(true);
        samlChecks.setVerifySAMLAssertionID(true);
        samlChecks.setVerifySAMLAssertionInResponseTo(true);
        samlChecks.setVerifyXSW(true);
        samlChecks.setVerifySchema(true);
        samlChecks.setVerifySAMLAssertionSbjConfirmationDestination(true);
        samlChecks.setVerifySAMLAssertionSbjConfirmationTimestamps(true);
        samlChecks.setVerifySAMLAssertionSbjInResponseTo(true);
        samlChecks.setVerifySAMLAssertionConditionsAudience(true);
        return samlChecks;
    }

    private SamlVerificationParametersType samlParams() {
        SamlVerificationParametersType verifyParams = new SamlVerificationParametersType();
        verifyParams.setDestination("https://test.com");
        verifyParams
                .setSamlMetadata("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
                        + "<md:EntitiesDescriptor Name=\"Group1\" validUntil=\"2030-06-09T09:00:00\" xmlns:md=\"urn:oasis:names:tc:SAML:2.0:metadata\" xmlns:saml=\"urn:oasis:names:tc:SAML:2.0:assertion\" xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">\n"
                        + "    <md:EntityDescriptor entityID=\"eLearning SAML SSO IdP\">\n"
                        + "        <md:IDPSSODescriptor protocolSupportEnumeration=\"urn:oasis:names:tc:SAML:2.0:protocol\">\n"
                        + "            <md:KeyDescriptor use=\"signing\">\n"
                        + "                <ds:KeyInfo xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\">\n"
                        + "                    <ds:X509Data>\n"
                        + "                        <ds:X509Certificate>MIIDiTCCAnGgAwIBAgIELzcgDTANBgkqhkiG9w0BAQsFADB1MQswCQYDVQQGEwJERTEQMA4GA1UECBMHVW5rbm93bjEQMA4GA1UEBxMHVW5rbm93bjEQMA4GA1UEChMHVW5rbm93bjETMBEGA1UECxMKc2tpZGVudGl0eTEbMBkGA1UEAxMSd3d3LnNraWRlbnRpdHkuY29tMB4XDTEzMDYxMDE1MTcyMloXDTE2MDYwOTE1MTcyMlowdTELMAkGA1UEBhMCREUxEDAOBgNVBAgTB1Vua25vd24xEDAOBgNVBAcTB1Vua25vd24xEDAOBgNVBAoTB1Vua25vd24xEzARBgNVBAsTCnNraWRlbnRpdHkxGzAZBgNVBAMTEnd3dy5za2lkZW50aXR5LmNvbTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIpvJa68Ib9nERP9+jL17w3bwyGXJ4ZoW10zJPtUA9N2QLTD8yI2kG3P4fv69Koid93ouFg/bTbfOTs7BBtdQWJ1xCtE80aHGAWto3Eo/9iryI0yZwhwkNEWr4dK3PTpb7JfyNLBWNCZFgtxQDEAX6PWKu4qsf7PLVp4tfl5JhKvoJCKqDDB3qQkhIGIV9YvDd/zidlCWghdr5D1F1XZqDpkDBEDf+MctC4M4Q6PSNsbU+4z42LDHWJ4d9OKRe86t8mzl/qrBvyKA1LLaZWFvw3J1NX/WHivI3Wn2/aGGsTr0IToiYW7SWKbp/f0kcPVUoVxMOfFuxZXmj2A0dHInZcCAwEAAaMhMB8wHQYDVR0OBBYEFKJzJ2C1jiSyrvSX1wp4qFsNqfUnMA0GCSqGSIb3DQEBCwUAA4IBAQAj47UXFntw/V4WRZSUoeIHLBfD2r2MyDYX1C3ocigh6gihTlzz/cTFn3FXjokpYIXDUUVo9Mjl+2X9Iwnn4uVhhF49OD0fd11YU4sN/Cn7UoG6J10OYqiei3KCu6jYSxGtv0vzpH+2u5iUKH3AzQFUlAAvmNS7uL5wRv7iPBgtHdYpxzRneBG8GmaGNzk8DuU6sjHcPxf+RtYsR55LV2pOMm5xInqFL8GDWk03XUmSsnlU3B5Ja0grWyokilw99bn6s1p5QpWkrngs3P819abeTOfxJG7Ttvl8bGHG0BN+1eZkK5VMn+xNQ8bIomtttwyel0GjMqOFczdwRpUyjqDC</ds:X509Certificate>\n"
                        + "                    </ds:X509Data>\n"
                        + "                </ds:KeyInfo>\n"
                        + "            </md:KeyDescriptor>\n"
                        + "            <md:SingleSignOnService Binding=\"urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect\" Location=\"http://carbon.cloud.nds.rub.de:8080/idp/saml\"/>\n"
                        + "            <md:NameIDFormat>urn:oasis:names:tc:SAML:2.0:nameid-format:transient</md:NameIDFormat>\n"
                        + "        </md:IDPSSODescriptor>\n" + "    </md:EntityDescriptor>\n"
                        + "</md:EntitiesDescriptor> ");

        return verifyParams;
    }

    private AuthenticationType generateIDSecret() {
        AuthenticationType authType = new AuthenticationType();
        authType.setClientId(UUID.randomUUID().toString());
        authType.setClientSecret(UUID.randomUUID().toString());
        return authType;
    }

}
