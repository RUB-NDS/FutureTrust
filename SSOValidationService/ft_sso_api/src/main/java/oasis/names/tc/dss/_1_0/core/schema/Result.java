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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="ResultMajor" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="ResultMinor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ResultMessage" type="{urn:oasis:names:tc:dss:1.0:core:schema}InternationalStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultMajor", "resultMinor", "resultMessage" })
@XmlRootElement(name = "Result")
public class Result {

    @XmlElement(name = "ResultMajor", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String resultMajor;
    @XmlElement(name = "ResultMinor")
    @XmlSchemaType(name = "anyURI")
    protected String resultMinor;
    @XmlElement(name = "ResultMessage")
    protected InternationalStringType resultMessage;

    /**
     * Ruft den Wert der resultMajor-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getResultMajor() {
        return resultMajor;
    }

    /**
     * Legt den Wert der resultMajor-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setResultMajor(String value) {
        this.resultMajor = value;
    }

    /**
     * Ruft den Wert der resultMinor-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getResultMinor() {
        return resultMinor;
    }

    /**
     * Legt den Wert der resultMinor-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setResultMinor(String value) {
        this.resultMinor = value;
    }

    /**
     * Ruft den Wert der resultMessage-Eigenschaft ab.
     * 
     * @return possible object is {@link InternationalStringType }
     * 
     */
    public InternationalStringType getResultMessage() {
        return resultMessage;
    }

    /**
     * Legt den Wert der resultMessage-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link InternationalStringType }
     * 
     */
    public void setResultMessage(InternationalStringType value) {
        this.resultMessage = value;
    }

}
