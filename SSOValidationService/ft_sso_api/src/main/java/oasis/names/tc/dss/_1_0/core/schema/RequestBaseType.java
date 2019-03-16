//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

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
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}OptionalInputs" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}InputDocuments" minOccurs="0"/>
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
@XmlSeeAlso({ VerifyRequest.class, SignRequest.class })
public class RequestBaseType {

    @XmlElement(name = "OptionalInputs")
    protected AnyType optionalInputs;
    @XmlElement(name = "InputDocuments")
    protected InputDocuments inputDocuments;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile")
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Ruft den Wert der optionalInputs-Eigenschaft ab.
     * 
     * @return possible object is {@link AnyType }
     * 
     */
    public AnyType getOptionalInputs() {
        return optionalInputs;
    }

    /**
     * Legt den Wert der optionalInputs-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AnyType }
     * 
     */
    public void setOptionalInputs(AnyType value) {
        this.optionalInputs = value;
    }

    /**
     * Ruft den Wert der inputDocuments-Eigenschaft ab.
     * 
     * @return possible object is {@link InputDocuments }
     * 
     */
    public InputDocuments getInputDocuments() {
        return inputDocuments;
    }

    /**
     * Legt den Wert der inputDocuments-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link InputDocuments }
     * 
     */
    public void setInputDocuments(InputDocuments value) {
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

}
