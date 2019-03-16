//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.SignatureType;

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
 *         &lt;choice>
 *           &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Timestamp"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Signature"/>
 *           &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignaturePtr"/>
 *           &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="SchemaRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signature", "timestamp", "base64Signature", "signaturePtr", "other" })
@XmlRootElement(name = "SignatureObject")
public class SignatureObject {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElement(name = "Timestamp")
    protected Timestamp timestamp;
    @XmlElement(name = "Base64Signature")
    protected Base64Signature base64Signature;
    @XmlElement(name = "SignaturePtr")
    protected SignaturePtr signaturePtr;
    @XmlElement(name = "Other")
    protected AnyType other;
    @XmlAttribute(name = "SchemaRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> schemaRefs;

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return possible object is {@link SignatureType }
     * 
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SignatureType }
     * 
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     * 
     * @return possible object is {@link Timestamp }
     * 
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Legt den Wert der timestamp-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Timestamp }
     * 
     */
    public void setTimestamp(Timestamp value) {
        this.timestamp = value;
    }

    /**
     * Ruft den Wert der base64Signature-Eigenschaft ab.
     * 
     * @return possible object is {@link Base64Signature }
     * 
     */
    public Base64Signature getBase64Signature() {
        return base64Signature;
    }

    /**
     * Legt den Wert der base64Signature-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Base64Signature }
     * 
     */
    public void setBase64Signature(Base64Signature value) {
        this.base64Signature = value;
    }

    /**
     * Ruft den Wert der signaturePtr-Eigenschaft ab.
     * 
     * @return possible object is {@link SignaturePtr }
     * 
     */
    public SignaturePtr getSignaturePtr() {
        return signaturePtr;
    }

    /**
     * Legt den Wert der signaturePtr-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SignaturePtr }
     * 
     */
    public void setSignaturePtr(SignaturePtr value) {
        this.signaturePtr = value;
    }

    /**
     * Ruft den Wert der other-Eigenschaft ab.
     * 
     * @return possible object is {@link AnyType }
     * 
     */
    public AnyType getOther() {
        return other;
    }

    /**
     * Legt den Wert der other-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AnyType }
     * 
     */
    public void setOther(AnyType value) {
        this.other = value;
    }

    /**
     * Gets the value of the schemaRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the schemaRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSchemaRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Object }
     * 
     * 
     */
    public List<Object> getSchemaRefs() {
        if (schemaRefs == null) {
            schemaRefs = new ArrayList<Object>();
        }
        return this.schemaRefs;
    }

}
