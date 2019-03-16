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
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.DigestMethodType;

/**
 * <p>
 * Java-Klasse für AttachmentReferenceType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttachmentReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestMethod"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}DigestValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AttRefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="MimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachmentReferenceType", propOrder = { "digestMethod", "digestValue" })
public class AttachmentReferenceType {

    @XmlElement(name = "DigestMethod", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected DigestMethodType digestMethod;
    @XmlElement(name = "DigestValue", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected byte[] digestValue;
    @XmlAttribute(name = "AttRefURI")
    @XmlSchemaType(name = "anyURI")
    protected String attRefURI;
    @XmlAttribute(name = "MimeType")
    protected String mimeType;

    /**
     * Ruft den Wert der digestMethod-Eigenschaft ab.
     * 
     * @return possible object is {@link DigestMethodType }
     * 
     */
    public DigestMethodType getDigestMethod() {
        return digestMethod;
    }

    /**
     * Legt den Wert der digestMethod-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link DigestMethodType }
     * 
     */
    public void setDigestMethod(DigestMethodType value) {
        this.digestMethod = value;
    }

    /**
     * Ruft den Wert der digestValue-Eigenschaft ab.
     * 
     * @return possible object is byte[]
     */
    public byte[] getDigestValue() {
        return digestValue;
    }

    /**
     * Legt den Wert der digestValue-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setDigestValue(byte[] value) {
        this.digestValue = value;
    }

    /**
     * Ruft den Wert der attRefURI-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAttRefURI() {
        return attRefURI;
    }

    /**
     * Legt den Wert der attRefURI-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAttRefURI(String value) {
        this.attRefURI = value;
    }

    /**
     * Ruft den Wert der mimeType-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Legt den Wert der mimeType-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

}
