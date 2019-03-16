//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.rub.nds.sso.api.VerificationProfileType;

/**
 * <p>
 * Java-Klasse für EntityType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}authentication_Type" maxOccurs="unbounded"/>
 *         &lt;element name="verificationProfile" type="{http://www.api.sso.nds.rub.org}verificationProfileType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = { "authentication", "verificationProfile" })
public class EntityType {

    @XmlElement(required = true)
    protected List<AuthenticationType> authentication;
    @XmlElement(required = true)
    protected List<VerificationProfileType> verificationProfile;

    /**
     * Gets the value of the authentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the authentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthenticationType }
     * 
     * 
     */
    public List<AuthenticationType> getAuthentication() {
        if (authentication == null) {
            authentication = new ArrayList<AuthenticationType>();
        }
        return this.authentication;
    }

    /**
     * Gets the value of the verificationProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the verificationProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getVerificationProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationProfileType }
     * 
     * 
     */
    public List<VerificationProfileType> getVerificationProfile() {
        if (verificationProfile == null) {
            verificationProfile = new ArrayList<VerificationProfileType>();
        }
        return this.verificationProfile;
    }

}
