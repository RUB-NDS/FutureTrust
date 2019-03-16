//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}DocumentBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Transforms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Base64Data"/>
 *       &lt;/sequence>
 *       &lt;attribute name="WhichReference" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "transforms", "base64Data" })
@XmlRootElement(name = "TransformedData")
public class TransformedData extends DocumentBaseType {

    @XmlElement(name = "Transforms", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected TransformsType transforms;
    @XmlElement(name = "Base64Data", required = true)
    protected Base64Data base64Data;
    @XmlAttribute(name = "WhichReference")
    protected BigInteger whichReference;

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
     * Ruft den Wert der whichReference-Eigenschaft ab.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getWhichReference() {
        return whichReference;
    }

    /**
     * Legt den Wert der whichReference-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setWhichReference(BigInteger value) {
        this.whichReference = value;
    }

}
