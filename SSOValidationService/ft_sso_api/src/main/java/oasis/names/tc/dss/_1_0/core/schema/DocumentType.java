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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für DocumentType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType">
 *       &lt;choice>
 *         &lt;element name="InlineXML" type="{urn:oasis:names:tc:dss:1.0:core:schema}InlineXMLType"/>
 *         &lt;element name="Base64XML" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="EscapedXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Data"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AttachmentReference"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = { "inlineXML", "base64XML", "escapedXML", "base64Data",
        "attachmentReference" })
public class DocumentType extends DocumentBaseType {

    @XmlElement(name = "InlineXML")
    protected InlineXMLType inlineXML;
    @XmlElement(name = "Base64XML")
    protected byte[] base64XML;
    @XmlElement(name = "EscapedXML")
    protected String escapedXML;
    @XmlElement(name = "Base64Data")
    protected Base64Data base64Data;
    @XmlElement(name = "AttachmentReference")
    protected AttachmentReferenceType attachmentReference;

    /**
     * Ruft den Wert der inlineXML-Eigenschaft ab.
     * 
     * @return possible object is {@link InlineXMLType }
     * 
     */
    public InlineXMLType getInlineXML() {
        return inlineXML;
    }

    /**
     * Legt den Wert der inlineXML-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link InlineXMLType }
     * 
     */
    public void setInlineXML(InlineXMLType value) {
        this.inlineXML = value;
    }

    /**
     * Ruft den Wert der base64XML-Eigenschaft ab.
     * 
     * @return possible object is byte[]
     */
    public byte[] getBase64XML() {
        return base64XML;
    }

    /**
     * Legt den Wert der base64XML-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is byte[]
     */
    public void setBase64XML(byte[] value) {
        this.base64XML = value;
    }

    /**
     * Ruft den Wert der escapedXML-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getEscapedXML() {
        return escapedXML;
    }

    /**
     * Legt den Wert der escapedXML-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setEscapedXML(String value) {
        this.escapedXML = value;
    }

    /**
     * Ruft den Wert der base64Data-Eigenschaft ab.
     * 
     * @return possible object is {@link Base64Data }
     * 
     */
    public Base64Data getBase64Data() {
        return base64Data;
    }

    /**
     * Legt den Wert der base64Data-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Base64Data }
     * 
     */
    public void setBase64Data(Base64Data value) {
        this.base64Data = value;
    }

    /**
     * Ruft den Wert der attachmentReference-Eigenschaft ab.
     * 
     * @return possible object is {@link AttachmentReferenceType }
     * 
     */
    public AttachmentReferenceType getAttachmentReference() {
        return attachmentReference;
    }

    /**
     * Legt den Wert der attachmentReference-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AttachmentReferenceType }
     * 
     */
    public void setAttachmentReference(AttachmentReferenceType value) {
        this.attachmentReference = value;
    }

}
