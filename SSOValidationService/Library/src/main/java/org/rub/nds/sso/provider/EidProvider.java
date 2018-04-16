package org.rub.nds.sso.provider;

import org.rub.nds.sso.api.SsoType;
import org.rub.nds.sso.api.VerificationProfileType;
import org.rub.nds.sso.api.VerificationResponseType;

/**
 *
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public abstract class EidProvider {

    private final String name;

    private final String info;

    private final double version;

    private final String type;

    private VerificationProfileType verificationProfileType;

    private Object securityObject;

    public EidProvider(String name, String info, double version, String type) {
        this.name = name;
        this.info = info;
        this.version = version;
        this.type = type;
    }

    public abstract VerificationResponseType verify(SsoType ssoType);

    public void setSecurityObject(Object type) {
        this.securityObject = type;
    }

    public Object getSecurityObject() {
        return securityObject;
    }

    public void setVerificationProfile(VerificationProfileType verificationProfile) {
        this.verificationProfileType = verificationProfile;
    }

    public VerificationProfileType getVerificationProfile() {
        return verificationProfileType;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public double getVersion() {
        return version;
    }

    public String getType() {
        return type;
    }
}
