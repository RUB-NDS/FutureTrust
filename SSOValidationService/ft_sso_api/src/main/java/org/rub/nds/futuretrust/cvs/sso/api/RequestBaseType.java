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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.AnyType;

/**
 * <p>
 * Java-Klasse für RequestBaseType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RequestBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OptionalInputs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cvs_verification_request" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}verificationRequest_Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InputDocuments">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice maxOccurs="unbounded">
 *                     &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Profile" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestBaseType", propOrder = { "optionalInputs", "inputDocuments" })
public class RequestBaseType {

    @XmlElement(name = "OptionalInputs", required = true)
    protected RequestBaseType.OptionalInputs optionalInputs;
    @XmlElement(name = "InputDocuments", required = true)
    protected RequestBaseType.InputDocuments inputDocuments;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile")
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Ruft den Wert der optionalInputs-Eigenschaft ab.
     * 
     * @return possible object is {@link RequestBaseType.OptionalInputs }
     * 
     */
    public RequestBaseType.OptionalInputs getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Legt den Wert der optionalInputs-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link RequestBaseType.OptionalInputs }
     * 
     */
    public void setOptionalInputs(RequestBaseType.OptionalInputs value) {
        this.optionalInputs = value;
    }

    /**
     * Ruft den Wert der inputDocuments-Eigenschaft ab.
     * 
     * @return possible object is {@link RequestBaseType.InputDocuments }
     * 
     */
    public RequestBaseType.InputDocuments getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Legt den Wert der inputDocuments-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link RequestBaseType.InputDocuments }
     * 
     */
    public void setInputDocuments(RequestBaseType.InputDocuments value) {
        this.inputDocuments = value;
    }

    /**
     * Ruft den Wert der requestID-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Legt den Wert der requestID-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Ruft den Wert der profile-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Legt den Wert der profile-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setProfile(String value) {
        this.profile = value;
    }

    /**
     * <p>
     * Java-Klasse für anonymous complex type.
     * 
     * <p>
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
     * Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice maxOccurs="unbounded">
     *           &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "other" })
    public static class InputDocuments {

        @XmlElement(name = "Other")
        protected List<AnyType> other;

        /**
         * Gets the value of the other property.
         * 
         * <p>
         * This accessor method returns a reference to the live list, not a
         * snapshot. Therefore any modification you make to the returned list
         * will be present inside the JAXB object. This is why there is not a
         * <CODE>set</CODE> method for the other property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * 
         * <pre>
         * getOther().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnyType }
         * 
         * 
         */
        public List<AnyType> getOther() {
            if (other == null) {
                other = new ArrayList<AnyType>();
            }
            return this.other;
        }

    }

    /**
     * <p>
     * Java-Klasse für anonymous complex type.
     * 
     * <p>
     * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
     * Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cvs_verification_request" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}verificationRequest_Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "cvsVerificationRequest" })
    public static class OptionalInputs {

        @XmlElement(name = "cvs_verification_request", required = true)
        protected VerificationRequestType cvsVerificationRequest;

        /**
         * Ruft den Wert der cvsVerificationRequest-Eigenschaft ab.
         * 
         * @return possible object is {@link VerificationRequestType }
         * 
         */
        public VerificationRequestType getCvsVerificationRequest() {
            return cvsVerificationRequest;
        }

        /**
         * Legt den Wert der cvsVerificationRequest-Eigenschaft fest.
         * 
         * @param value
         *            allowed object is {@link VerificationRequestType }
         * 
         */
        public void setCvsVerificationRequest(VerificationRequestType value) {
            this.cvsVerificationRequest = value;
        }

    }

}
