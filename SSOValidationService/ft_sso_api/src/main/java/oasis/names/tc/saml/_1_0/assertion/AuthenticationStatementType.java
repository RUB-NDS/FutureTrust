//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java-Klasse für AuthenticationStatementType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationStatementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectStatementAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectLocality" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AuthorityBinding" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthenticationMethod" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="AuthenticationInstant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationStatementType", propOrder = { "subjectLocality", "authorityBinding" })
public class AuthenticationStatementType extends SubjectStatementAbstractType {

    @XmlElement(name = "SubjectLocality")
    protected SubjectLocalityType subjectLocality;
    @XmlElement(name = "AuthorityBinding")
    protected List<AuthorityBindingType> authorityBinding;
    @XmlAttribute(name = "AuthenticationMethod", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String authenticationMethod;
    @XmlAttribute(name = "AuthenticationInstant", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authenticationInstant;

    /**
     * Ruft den Wert der subjectLocality-Eigenschaft ab.
     * 
     * @return possible object is {@link SubjectLocalityType }
     * 
     */
    public SubjectLocalityType getSubjectLocality() {
        return subjectLocality;
    }

    /**
     * Legt den Wert der subjectLocality-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SubjectLocalityType }
     * 
     */
    public void setSubjectLocality(SubjectLocalityType value) {
        this.subjectLocality = value;
    }

    /**
     * Gets the value of the authorityBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the authorityBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAuthorityBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityBindingType }
     * 
     * 
     */
    public List<AuthorityBindingType> getAuthorityBinding() {
        if (authorityBinding == null) {
            authorityBinding = new ArrayList<AuthorityBindingType>();
        }
        return this.authorityBinding;
    }

    /**
     * Ruft den Wert der authenticationMethod-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Legt den Wert der authenticationMethod-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAuthenticationMethod(String value) {
        this.authenticationMethod = value;
    }

    /**
     * Ruft den Wert der authenticationInstant-Eigenschaft ab.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getAuthenticationInstant() {
        return authenticationInstant;
    }

    /**
     * Legt den Wert der authenticationInstant-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setAuthenticationInstant(XMLGregorianCalendar value) {
        this.authenticationInstant = value;
    }

}
