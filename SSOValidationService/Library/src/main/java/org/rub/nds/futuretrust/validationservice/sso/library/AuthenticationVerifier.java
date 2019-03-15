package org.rub.nds.futuretrust.validationservice.sso.library;

import org.rub.nds.futuretrust.cvs.sso.api.AuthenticationType;
import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.futuretrust.cvs.sso.api.VerificationRequestType;

/**
 *
 * @author vladi
 */
public class AuthenticationVerifier {

    public static EntityType authenticate(DatabaseType db, VerificationRequestType request)
            throws AuthenticationException {
        if (request.getAuthentication() == null) {
            throw new AuthenticationException("No authentication information found.");
        }
        if (request.getAuthentication().getMethod() == null) {
            return verifyClientIDSecret(db, request);
        } else if (request.getAuthentication().getMethod().equalsIgnoreCase("cert")) {
            return verifyCert(db, request);
        } else if (request.getAuthentication().getMethod().equalsIgnoreCase("pop")) {
            throw new AuthenticationException("Not implemented.");
        } else {
            return verifyClientIDSecret(db, request);
        }
    }

    private static EntityType verifyClientIDSecret(DatabaseType db, VerificationRequestType request)
            throws AuthenticationException {
        for (EntityType entity : db.getRegisteredEntity()) {
            for (AuthenticationType auth : entity.getAuthentication()) {
                if (request.getAuthentication().getClientId().equals(auth.getClientId())
                        && request.getAuthentication().getClientSecret().equals(auth.getClientSecret())) {
                    return entity;
                }
            }
        }
        throw new AuthenticationException("Authentication not successful!");
    }

    private static EntityType verifyCert(DatabaseType db, VerificationRequestType request)
            throws AuthenticationException {
        for (EntityType entity : db.getRegisteredEntity()) {
            for (AuthenticationType auth : entity.getAuthentication()) {
                if (request.getAuthentication().getClientCert().equals(auth.getClientCert())) {
                    return entity;
                }
            }
        }
        throw new AuthenticationException("Authentication not successful!");
    }
}
