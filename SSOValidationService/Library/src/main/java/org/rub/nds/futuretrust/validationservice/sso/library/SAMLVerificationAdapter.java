package org.rub.nds.futuretrust.validationservice.sso.library;

import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
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

    private static VerificationProfileType getProfile(EntityType provider, SamlType saml) throws SAMLVerifyException {
        for (VerificationProfileType verification : provider.getVerificationProfile()) {
            if (saml.getSamlVerificationProfile().equals(verification.getID())) {
                return verification;
            }
        }
        throw new SAMLVerifyException("Profile " + saml.getSamlVerificationProfile() + "not found in the database");
    }
}
