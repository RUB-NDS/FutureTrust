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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse für InlineXMLType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InlineXMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax'/>
 *       &lt;/sequence>
 *       &lt;attribute name="ignorePIs" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ignoreComments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InlineXMLType", propOrder = { "any" })
public class InlineXMLType {

    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "ignorePIs")
    protected Boolean ignorePIs;
    @XmlAttribute(name = "ignoreComments")
    protected Boolean ignoreComments;

    /**
     * Ruft den Wert der any-Eigenschaft ab.
     * 
     * @return possible object is {@link Element } {@link Object }
     * 
     */
    public Object getAny() {
        return any;
    }

    /**
     * Legt den Wert der any-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Element } {@link Object }
     * 
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * Ruft den Wert der ignorePIs-Eigenschaft ab.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isIgnorePIs() {
        if (ignorePIs == null) {
            return true;
        } else {
            return ignorePIs;
        }
    }

    /**
     * Legt den Wert der ignorePIs-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIgnorePIs(Boolean value) {
        this.ignorePIs = value;
    }

    /**
     * Ruft den Wert der ignoreComments-Eigenschaft ab.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isIgnoreComments() {
        if (ignoreComments == null) {
            return true;
        } else {
            return ignoreComments;
        }
    }

    /**
     * Legt den Wert der ignoreComments-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setIgnoreComments(Boolean value) {
        this.ignoreComments = value;
    }

}
