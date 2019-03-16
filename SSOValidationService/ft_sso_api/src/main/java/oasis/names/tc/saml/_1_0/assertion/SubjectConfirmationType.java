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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._2000._09.xmldsig_.KeyInfoType;

/**
 * <p>
 * Java-Klasse für SubjectConfirmationType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubjectConfirmationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}ConfirmationMethod" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectConfirmationData" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}KeyInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectConfirmationType", propOrder = { "confirmationMethod", "subjectConfirmationData", "keyInfo" })
public class SubjectConfirmationType {

    @XmlElement(name = "ConfirmationMethod", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> confirmationMethod;
    @XmlElement(name = "SubjectConfirmationData")
    protected Object subjectConfirmationData;
    @XmlElement(name = "KeyInfo", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected KeyInfoType keyInfo;

    /**
     * Gets the value of the confirmationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the confirmationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConfirmationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getConfirmationMethod() {
        if (confirmationMethod == null) {
            confirmationMethod = new ArrayList<String>();
        }
        return this.confirmationMethod;
    }

    /**
     * Ruft den Wert der subjectConfirmationData-Eigenschaft ab.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getSubjectConfirmationData() {
        return subjectConfirmationData;
    }

    /**
     * Legt den Wert der subjectConfirmationData-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setSubjectConfirmationData(Object value) {
        this.subjectConfirmationData = value;
    }

    /**
     * Ruft den Wert der keyInfo-Eigenschaft ab.
     * 
     * @return possible object is {@link KeyInfoType }
     * 
     */
    public KeyInfoType getKeyInfo() {
        return keyInfo;
    }

    /**
     * Legt den Wert der keyInfo-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link KeyInfoType }
     * 
     */
    public void setKeyInfo(KeyInfoType value) {
        this.keyInfo = value;
    }

}
