//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *         &lt;element name="RFC3161TimeStampToken" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="Other" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signature", "rfc3161TimeStampToken", "other" })
@XmlRootElement(name = "Timestamp")
public class Timestamp {

    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlElement(name = "RFC3161TimeStampToken")
    protected byte[] rfc3161TimeStampToken;
    @XmlElement(name = "Other")
    protected AnyType other;

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
     * Ruft den Wert der rfc3161TimeStampToken-Eigenschaft ab.
     * 
     * @return possible object is byte[]
     */
    public byte[] getRFC3161TimeStampToken() {
        return rfc3161TimeStampToken;
    }

    /**
     * Legt den Wert der rfc3161TimeStampToken-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setRFC3161TimeStampToken(byte[] value) {
        this.rfc3161TimeStampToken = value;
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

}
