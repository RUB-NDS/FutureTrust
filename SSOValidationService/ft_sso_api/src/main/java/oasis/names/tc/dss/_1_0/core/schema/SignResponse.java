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
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}ResponseBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}SignatureObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "signatureObject" })
@XmlRootElement(name = "SignResponse")
public class SignResponse extends ResponseBaseType {

    @XmlElement(name = "SignatureObject")
    protected SignatureObject signatureObject;

    /**
     * Ruft den Wert der signatureObject-Eigenschaft ab.
     * 
     * @return possible object is {@link SignatureObject }
     * 
     */
    public SignatureObject getSignatureObject() {
        return signatureObject;
    }

    /**
     * Legt den Wert der signatureObject-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SignatureObject }
     * 
     */
    public void setSignatureObject(SignatureObject value) {
        this.signatureObject = value;
    }

}
