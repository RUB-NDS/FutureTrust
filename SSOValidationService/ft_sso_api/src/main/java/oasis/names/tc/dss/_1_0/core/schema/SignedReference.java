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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.TransformsType;

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
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="RefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="RefId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transforms" })
@XmlRootElement(name = "SignedReference")
public class SignedReference {

    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlAttribute(name = "WhichDocument", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichDocument;
    @XmlAttribute(name = "RefURI")
    @XmlSchemaType(name = "anyURI")
    protected String refURI;
    @XmlAttribute(name = "RefId")
    protected String refId;

    /**
     * Ruft den Wert der transforms-Eigenschaft ab.
     * 
     * @return possible object is {@link TransformsType }
     * 
     */
    public TransformsType getTransforms() {
        return transforms;
    }

    /**
     * Legt den Wert der transforms-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link TransformsType }
     * 
     */
    public void setTransforms(TransformsType value) {
        this.transforms = value;
    }

    /**
     * Ruft den Wert der whichDocument-Eigenschaft ab.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getWhichDocument() {
        return whichDocument;
    }

    /**
     * Legt den Wert der whichDocument-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWhichDocument(Object value) {
        this.whichDocument = value;
    }

    /**
     * Ruft den Wert der refURI-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRefURI() {
        return refURI;
    }

    /**
     * Legt den Wert der refURI-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRefURI(String value) {
        this.refURI = value;
    }

    /**
     * Ruft den Wert der refId-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Legt den Wert der refId-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
