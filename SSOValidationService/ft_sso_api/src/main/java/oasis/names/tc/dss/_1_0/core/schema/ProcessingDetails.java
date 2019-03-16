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
 *         &lt;element name="ValidDetail" type="{urn:oasis:names:tc:dss:1.0:core:schema}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndeterminateDetail" type="{urn:oasis:names:tc:dss:1.0:core:schema}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InvalidDetail" type="{urn:oasis:names:tc:dss:1.0:core:schema}DetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "validDetail", "indeterminateDetail", "invalidDetail" })
@XmlRootElement(name = "ProcessingDetails")
public class ProcessingDetails {

    @XmlElement(name = "ValidDetail")
    protected List<DetailType> validDetail;
    @XmlElement(name = "IndeterminateDetail")
    protected List<DetailType> indeterminateDetail;
    @XmlElement(name = "InvalidDetail")
    protected List<DetailType> invalidDetail;

    /**
     * Gets the value of the validDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the validDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getValidDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getValidDetail() {
        if (validDetail == null) {
            validDetail = new ArrayList<DetailType>();
        }
        return this.validDetail;
    }

    /**
     * Gets the value of the indeterminateDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the indeterminateDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIndeterminateDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getIndeterminateDetail() {
        if (indeterminateDetail == null) {
            indeterminateDetail = new ArrayList<DetailType>();
        }
        return this.indeterminateDetail;
    }

    /**
     * Gets the value of the invalidDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the invalidDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInvalidDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailType }
     * 
     * 
     */
    public List<DetailType> getInvalidDetail() {
        if (invalidDetail == null) {
            invalidDetail = new ArrayList<DetailType>();
        }
        return this.invalidDetail;
    }

}
