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
import org.rub.nds.sso.api.VerificationProfileType;

/**
 * <p>
 * Java-Klasse für ConfigurationType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="authentication" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}authentication_Type" minOccurs="0"/>
 *         &lt;element name="verificationProfile" type="{http://www.api.sso.nds.rub.org}verificationProfileType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationType", propOrder = { "id", "authentication", "verificationProfile" })
public class ConfigurationType {

    @XmlElement(name = "ID", required = true)
    protected String id;
    protected AuthenticationType authentication;
    @XmlElement(required = true)
    protected VerificationProfileType verificationProfile;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
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
     * Ruft den Wert der verificationProfile-Eigenschaft ab.
     * 
     * @return possible object is {@link VerificationProfileType }
     * 
     */
    public VerificationProfileType getVerificationProfile() {
        return verificationProfile;
    }

    /**
     * Legt den Wert der verificationProfile-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link VerificationProfileType }
     * 
     */
    public void setVerificationProfile(VerificationProfileType value) {
        this.verificationProfile = value;
    }

}
