//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java-Klasse für UseVerificationTimeType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UseVerificationTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CurrentTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="SpecificTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;any namespace='##other'/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UseVerificationTimeType", propOrder = { "currentTime", "specificTime", "any" })
public class UseVerificationTimeType {

    @XmlElement(name = "CurrentTime")
    protected Object currentTime;
    @XmlElement(name = "SpecificTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specificTime;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Ruft den Wert der currentTime-Eigenschaft ab.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getCurrentTime() {
        return currentTime;
    }

    /**
     * Legt den Wert der currentTime-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setCurrentTime(Object value) {
        this.currentTime = value;
    }

    /**
     * Ruft den Wert der specificTime-Eigenschaft ab.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSpecificTime() {
        return specificTime;
    }

    /**
     * Legt den Wert der specificTime-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setSpecificTime(XMLGregorianCalendar value) {
        this.specificTime = value;
    }

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
