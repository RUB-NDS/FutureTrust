//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für ssoProtocol_Type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="ssoProtocol_Type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="saml"/>
 *     &lt;enumeration value="oidc"/>
 *     &lt;enumeration value="oauth"/>
 *     &lt;enumeration value="x509"/>
 *     &lt;enumeration value="config"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ssoProtocol_Type")
@XmlEnum
public enum SsoProtocolType {

    @XmlEnumValue("saml")
    SAML("saml"),
    @XmlEnumValue("oidc")
    OIDC("oidc"),
    @XmlEnumValue("oauth")
    OAUTH("oauth"),
    @XmlEnumValue("x509")
    X_509("x509"),
    @XmlEnumValue("config")
    CONFIG("config");
    private final String value;

    SsoProtocolType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SsoProtocolType fromValue(String v) {
        for (SsoProtocolType c : SsoProtocolType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
