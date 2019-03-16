//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java-Klasse für VerificationTimeInfoType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VerificationTimeInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VerificationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}AdditionalTimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationTimeInfoType", propOrder = { "verificationTime", "additionalTimeInfo" })
public class VerificationTimeInfoType {

    @XmlElement(name = "VerificationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verificationTime;
    @XmlElement(name = "AdditionalTimeInfo")
    protected List<AdditionalTimeInfoType> additionalTimeInfo;

    /**
     * Ruft den Wert der verificationTime-Eigenschaft ab.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getVerificationTime() {
        return verificationTime;
    }

    /**
     * Legt den Wert der verificationTime-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setVerificationTime(XMLGregorianCalendar value) {
        this.verificationTime = value;
    }

    /**
     * Gets the value of the additionalTimeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the additionalTimeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAdditionalTimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalTimeInfoType }
     * 
     * 
     */
    public List<AdditionalTimeInfoType> getAdditionalTimeInfo() {
        if (additionalTimeInfo == null) {
            additionalTimeInfo = new ArrayList<AdditionalTimeInfoType>();
        }
        return this.additionalTimeInfo;
    }

}
