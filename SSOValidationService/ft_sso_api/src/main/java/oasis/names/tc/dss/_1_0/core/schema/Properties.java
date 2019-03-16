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
 *         &lt;element name="SignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/>
 *         &lt;element name="UnsignedProperties" type="{urn:oasis:names:tc:dss:1.0:core:schema}PropertiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signedProperties", "unsignedProperties" })
@XmlRootElement(name = "Properties")
public class Properties {

    @XmlElement(name = "SignedProperties")
    protected PropertiesType signedProperties;
    @XmlElement(name = "UnsignedProperties")
    protected PropertiesType unsignedProperties;

    /**
     * Ruft den Wert der signedProperties-Eigenschaft ab.
     * 
     * @return possible object is {@link PropertiesType }
     * 
     */
    public PropertiesType getSignedProperties() {
        return signedProperties;
    }

    /**
     * Legt den Wert der signedProperties-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link PropertiesType }
     * 
     */
    public void setSignedProperties(PropertiesType value) {
        this.signedProperties = value;
    }

    /**
     * Ruft den Wert der unsignedProperties-Eigenschaft ab.
     * 
     * @return possible object is {@link PropertiesType }
     * 
     */
    public PropertiesType getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Legt den Wert der unsignedProperties-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link PropertiesType }
     * 
     */
    public void setUnsignedProperties(PropertiesType value) {
        this.unsignedProperties = value;
    }

}
