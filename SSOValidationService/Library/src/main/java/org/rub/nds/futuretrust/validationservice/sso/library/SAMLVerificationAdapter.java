package org.rub.nds.futuretrust.validationservice.sso.library;

import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.saml.samllib.exceptions.SAMLVerifyException;
import org.rub.nds.sso.api.SamlTokenVerificationChecksType;
import org.rub.nds.sso.api.SamlType;
import org.rub.nds.sso.api.VerificationProfileType;

/**
 *
 * @author vladi
 */
public class SAMLVerificationAdapter {

    public static SamlType getVerificationProfile(EntityType provider, SamlType saml) throws SAMLVerifyException {
        // Check if some verification profile is referenced
        if (saml.getSamlVerificationProfile() == null || saml.getSamlVerificationProfile().isEmpty()) {
            // do nothing and return the same profile
        } else {
            VerificationProfileType profile = getProfile(provider, saml);
            saml.setSamlTokenVerificationChecks(profile.getSamlTokenVerificationChecks());
            saml.setSamlVerificationParameters(profile.getSamlTokenVerificationParameters());
        }

        return saml;
    }

    public static VerificationProfileType getProfile(EntityType provider, SamlType saml) throws SAMLVerifyException {
        for (VerificationProfileType verification : provider.getVerificationProfile()) {
            if (saml.getSamlVerificationProfile().equals(verification.getID())) {
                return verification;
            }
        }
        throw new SAMLVerifyException("Profile " + saml.getSamlVerificationProfile() + "not found in the database");
    }

    public static SamlTokenVerificationChecksType mergeSamlVerificationChecks(
            SamlTokenVerificationChecksType localProfile, SamlTokenVerificationChecksType incomming) {
        if (localProfile == null) {
            return incomming;
        } else if (incomming == null) {
            return localProfile;
        } else {
            return incomming;
            // return mergeChecks(localProfile, incomming);
        }

    }

    private static SamlTokenVerificationChecksType mergeChecks(SamlTokenVerificationChecksType localProfile,
            SamlTokenVerificationChecksType incomming) {
        SamlTokenVerificationChecksType result = new SamlTokenVerificationChecksType();

        result.setVerifyHolderOfKey(localProfile.isVerifyHolderOfKey() | incomming.isVerifyHolderOfKey());
        result.setVerifySAMLAssertionAuthnMethod(localProfile.isVerifySAMLAssertionAuthnMethod()
                | incomming.isVerifySAMLAssertionAuthnMethod());
        result.setVerifySAMLAssertionConditionsAudience(localProfile.isVerifySAMLAssertionConditionsAudience()
                | incomming.isVerifySAMLAssertionConditionsAudience());
        result.setVerifySAMLAssertionConditionsTimestamps(localProfile.isVerifySAMLAssertionConditionsTimestamps()
                | incomming.isVerifySAMLAssertionConditionsTimestamps());
        result.setVerifySAMLAssertionID(localProfile.isVerifySAMLAssertionID() | incomming.isVerifySAMLAssertionID());
        result.setVerifySAMLAssertionInResponseTo(localProfile.isVerifySAMLAssertionInResponseTo()
                | incomming.isVerifySAMLAssertionInResponseTo());
        result.setVerifySAMLAssertionIssueInstant(localProfile.isVerifySAMLAssertionIssueInstant()
                | incomming.isVerifySAMLAssertionIssueInstant());
        result.setVerifySAMLAssertionSbjConfirmationDestination(localProfile
                .isVerifySAMLAssertionSbjConfirmationDestination()
                | incomming.isVerifySAMLAssertionSbjConfirmationDestination());
        result.setVerifySAMLAssertionSbjConfirmationTimestamps(localProfile
                .isVerifySAMLAssertionSbjConfirmationTimestamps()
                | incomming.isVerifySAMLAssertionSbjConfirmationTimestamps());
        result.setVerifySAMLAssertionSbjInResponseTo(localProfile.isVerifySAMLAssertionSbjInResponseTo()
                | incomming.isVerifySAMLAssertionSbjInResponseTo());
        result.setVerifySAMLAssertionSignature(localProfile.isVerifySAMLAssertionSignature()
                | incomming.isVerifySAMLAssertionSignature());
        result.setVerifySAMLAssertionSignatureTrusted(localProfile.isVerifySAMLAssertionSignatureTrusted()
                | incomming.isVerifySAMLAssertionSignatureTrusted());
        result.setVerifySAMLResponseID(localProfile.isVerifySAMLResponseID() | incomming.isVerifySAMLResponseID());
        result.setVerifySAMLResponseInResponseTo(localProfile.isVerifySAMLResponseInResponseTo()
                | incomming.isVerifySAMLResponseInResponseTo());
        result.setVerifySAMLResponseIssueInstant(localProfile.isVerifySAMLResponseIssueInstant()
                | incomming.isVerifySAMLResponseIssueInstant());
        result.setVerifySAMLResponseSignature(localProfile.isVerifySAMLResponseSignature()
                | incomming.isVerifySAMLResponseSignature());
        result.setVerifySAMLResponseSignatureTrusted(localProfile.isVerifySAMLResponseSignatureTrusted()
                | incomming.isVerifySAMLResponseSignatureTrusted());
        result.setVerifySchema(localProfile.isVerifySchema() | incomming.isVerifySchema());
        result.setVerifyXSW(localProfile.isVerifyXSW() | incomming.isVerifyXSW());

        return result;
    }
}
