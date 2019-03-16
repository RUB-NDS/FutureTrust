//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.rub.nds.sso.api.OidcType;
import org.rub.nds.sso.api.SamlType;

/**
 * <p>
 * Java-Klasse für verificationRequest_Type complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="verificationRequest_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sso_protocol" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}ssoProtocol_Type"/>
 *         &lt;element name="authentication" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}authentication_Type"/>
 *         &lt;element name="saml" type="{http://www.api.sso.nds.rub.org}samlType" minOccurs="0"/>
 *         &lt;element name="oidc" type="{http://www.api.sso.nds.rub.org}oidcType" minOccurs="0"/>
 *         &lt;element name="logLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="debug"/>
 *               &lt;enumeration value="warn"/>
 *               &lt;enumeration value="error"/>
 *               &lt;enumeration value="info"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "verificationRequest_Type", namespace = "org:rub:nds:futuretrust:cvs.sso:api")
@XmlType(name = "verificationRequest_Type", propOrder = { "ssoProtocol", "authentication", "saml", "oidc", "logLevel" })
public class VerificationRequestType {

    @XmlElement(name = "sso_protocol", required = true)
    @XmlSchemaType(name = "string")
    protected SsoProtocolType ssoProtocol;
    @XmlElement(required = true)
    protected AuthenticationType authentication;
    protected SamlType saml;
    protected OidcType oidc;
    protected String logLevel;

    /**
     * Ruft den Wert der ssoProtocol-Eigenschaft ab.
     * 
     * @return possible object is {@link SsoProtocolType }
     * 
     */
    public SsoProtocolType getSsoProtocol() {
        return ssoProtocol;
    }

    /**
     * Legt den Wert der ssoProtocol-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SsoProtocolType }
     * 
     */
    public void setSsoProtocol(SsoProtocolType value) {
        this.ssoProtocol = value;
    }

    /**
     * Ruft den Wert der authentication-Eigenschaft ab.
     * 
     * @return possible object is {@link AuthenticationType }
     * 
     */
    public AuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Legt den Wert der authentication-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AuthenticationType }
     * 
     */
    public void setAuthentication(AuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Ruft den Wert der saml-Eigenschaft ab.
     * 
     * @return possible object is {@link SamlType }
     * 
     */
    public SamlType getSaml() {
        return saml;
    }

    /**
     * Legt den Wert der saml-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SamlType }
     * 
     */
    public void setSaml(SamlType value) {
        this.saml = value;
    }

    /**
     * Ruft den Wert der oidc-Eigenschaft ab.
     * 
     * @return possible object is {@link OidcType }
     * 
     */
    public OidcType getOidc() {
        return oidc;
    }

    /**
     * Legt den Wert der oidc-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link OidcType }
     * 
     */
    public void setOidc(OidcType value) {
        this.oidc = value;
    }

    /**
     * Ruft den Wert der logLevel-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLogLevel() {
        return logLevel;
    }

    /**
     * Legt den Wert der logLevel-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLogLevel(String value) {
        this.logLevel = value;
    }

}
