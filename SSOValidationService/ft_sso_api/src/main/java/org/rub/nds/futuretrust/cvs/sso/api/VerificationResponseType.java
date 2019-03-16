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
import javax.xml.bind.annotation.XmlType;
import org.rub.nds.sso.api.AuthenticatedUserType;
import org.rub.nds.sso.api.OidcVerificationChecksType;
import org.rub.nds.sso.api.SamlAuthnRequestVerificationChecksType;
import org.rub.nds.sso.api.SamlTokenVerificationChecksType;
import org.rub.nds.sso.api.VerificationLogType;

/**
 * <p>
 * Java-Klasse für verificationResponse_Type complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="verificationResponse_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticatedUser" type="{http://www.api.sso.nds.rub.org}authenticatedUserType"/>
 *         &lt;choice>
 *           &lt;element name="samlAuthnRequestVerifiedChecks" type="{http://www.api.sso.nds.rub.org}samlAuthnRequestVerificationChecksType" minOccurs="0"/>
 *           &lt;element name="samlTokenVerifiedChecks" type="{http://www.api.sso.nds.rub.org}samlTokenVerificationChecksType" minOccurs="0"/>
 *           &lt;element name="oidcVerifiedChecks" type="{http://www.api.sso.nds.rub.org}oidcVerificationChecksType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="verificationLog" type="{http://www.api.sso.nds.rub.org}verificationLogType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificationResponse_Type", propOrder = { "authenticatedUser", "samlAuthnRequestVerifiedChecks",
        "samlTokenVerifiedChecks", "oidcVerifiedChecks", "verificationLog" })
public class VerificationResponseType {

    @XmlElement(required = true)
    protected AuthenticatedUserType authenticatedUser;
    protected SamlAuthnRequestVerificationChecksType samlAuthnRequestVerifiedChecks;
    protected SamlTokenVerificationChecksType samlTokenVerifiedChecks;
    protected OidcVerificationChecksType oidcVerifiedChecks;
    @XmlElement(required = true)
    protected VerificationLogType verificationLog;

    /**
     * Ruft den Wert der authenticatedUser-Eigenschaft ab.
     * 
     * @return possible object is {@link AuthenticatedUserType }
     * 
     */
    public AuthenticatedUserType getAuthenticatedUser() {
        return authenticatedUser;
    }

    /**
     * Legt den Wert der authenticatedUser-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AuthenticatedUserType }
     * 
     */
    public void setAuthenticatedUser(AuthenticatedUserType value) {
        this.authenticatedUser = value;
    }

    /**
     * Ruft den Wert der samlAuthnRequestVerifiedChecks-Eigenschaft ab.
     * 
     * @return possible object is {@link SamlAuthnRequestVerificationChecksType }
     * 
     */
    public SamlAuthnRequestVerificationChecksType getSamlAuthnRequestVerifiedChecks() {
        return samlAuthnRequestVerifiedChecks;
    }

    /**
     * Legt den Wert der samlAuthnRequestVerifiedChecks-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is
     *            {@link SamlAuthnRequestVerificationChecksType }
     * 
     */
    public void setSamlAuthnRequestVerifiedChecks(SamlAuthnRequestVerificationChecksType value) {
        this.samlAuthnRequestVerifiedChecks = value;
    }

    /**
     * Ruft den Wert der samlTokenVerifiedChecks-Eigenschaft ab.
     * 
     * @return possible object is {@link SamlTokenVerificationChecksType }
     * 
     */
    public SamlTokenVerificationChecksType getSamlTokenVerifiedChecks() {
        return samlTokenVerifiedChecks;
    }

    /**
     * Legt den Wert der samlTokenVerifiedChecks-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SamlTokenVerificationChecksType }
     * 
     */
    public void setSamlTokenVerifiedChecks(SamlTokenVerificationChecksType value) {
        this.samlTokenVerifiedChecks = value;
    }

    /**
     * Ruft den Wert der oidcVerifiedChecks-Eigenschaft ab.
     * 
     * @return possible object is {@link OidcVerificationChecksType }
     * 
     */
    public OidcVerificationChecksType getOidcVerifiedChecks() {
        return oidcVerifiedChecks;
    }

    /**
     * Legt den Wert der oidcVerifiedChecks-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link OidcVerificationChecksType }
     * 
     */
    public void setOidcVerifiedChecks(OidcVerificationChecksType value) {
        this.oidcVerifiedChecks = value;
    }

    /**
     * Ruft den Wert der verificationLog-Eigenschaft ab.
     * 
     * @return possible object is {@link VerificationLogType }
     * 
     */
    public VerificationLogType getVerificationLog() {
        return verificationLog;
    }

    /**
     * Legt den Wert der verificationLog-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link VerificationLogType }
     * 
     */
    public void setVerificationLog(VerificationLogType value) {
        this.verificationLog = value;
    }

}
