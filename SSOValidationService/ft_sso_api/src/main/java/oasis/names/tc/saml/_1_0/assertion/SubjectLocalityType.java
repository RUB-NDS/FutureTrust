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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für SubjectLocalityType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubjectLocalityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DNSAddress" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectLocalityType")
public class SubjectLocalityType {

    @XmlAttribute(name = "IPAddress")
    protected String ipAddress;
    @XmlAttribute(name = "DNSAddress")
    protected String dnsAddress;

    /**
     * Ruft den Wert der ipAddress-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Legt den Wert der ipAddress-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Ruft den Wert der dnsAddress-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getDNSAddress() {
        return dnsAddress;
    }

    /**
     * Legt den Wert der dnsAddress-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setDNSAddress(String value) {
        this.dnsAddress = value;
    }

}
