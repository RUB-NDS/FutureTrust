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
import oasis.names.tc.saml._1_0.assertion.NameIdentifierType;

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
 *         &lt;element name="Name" type="{urn:oasis:names:tc:SAML:1.0:assertion}NameIdentifierType"/>
 *         &lt;element name="SupportingInfo" type="{urn:oasis:names:tc:dss:1.0:core:schema}AnyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "supportingInfo" })
@XmlRootElement(name = "RequesterIdentity")
public class RequesterIdentity {

    @XmlElement(name = "Name", required = true)
    protected NameIdentifierType name;
    @XmlElement(name = "SupportingInfo")
    protected AnyType supportingInfo;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return possible object is {@link NameIdentifierType }
     * 
     */
    public NameIdentifierType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link NameIdentifierType }
     * 
     */
    public void setName(NameIdentifierType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der supportingInfo-Eigenschaft ab.
     * 
     * @return possible object is {@link AnyType }
     * 
     */
    public AnyType getSupportingInfo() {
        return supportingInfo;
    }

    /**
     * Legt den Wert der supportingInfo-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AnyType }
     * 
     */
    public void setSupportingInfo(AnyType value) {
        this.supportingInfo = value;
    }

}
