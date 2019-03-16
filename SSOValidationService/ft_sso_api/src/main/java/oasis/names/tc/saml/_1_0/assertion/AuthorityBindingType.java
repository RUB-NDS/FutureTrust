//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.saml._1_0.assertion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse für AuthorityBindingType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthorityBindingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AuthorityKind" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="Location" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Binding" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityBindingType")
public class AuthorityBindingType {

    @XmlAttribute(name = "AuthorityKind", required = true)
    protected QName authorityKind;
    @XmlAttribute(name = "Location", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String location;
    @XmlAttribute(name = "Binding", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String binding;

    /**
     * Ruft den Wert der authorityKind-Eigenschaft ab.
     * 
     * @return possible object is {@link QName }
     * 
     */
    public QName getAuthorityKind() {
        return authorityKind;
    }

    /**
     * Legt den Wert der authorityKind-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link QName }
     * 
     */
    public void setAuthorityKind(QName value) {
        this.authorityKind = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der binding-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getBinding() {
        return binding;
    }

    /**
     * Legt den Wert der binding-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setBinding(String value) {
        this.binding = value;
    }

}
