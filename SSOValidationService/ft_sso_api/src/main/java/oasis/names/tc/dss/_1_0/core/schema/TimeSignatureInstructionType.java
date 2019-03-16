//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.dss._1_0.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für TimeSignatureInstructionType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimeSignatureInstructionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:dss:1.0:core:schema}UpdateSignatureInstructionType">
 *       &lt;attribute name="TimeStampTheGivenSignature" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSignatureInstructionType")
public class TimeSignatureInstructionType extends UpdateSignatureInstructionType {

    @XmlAttribute(name = "TimeStampTheGivenSignature")
    protected Boolean timeStampTheGivenSignature;

    /**
     * Ruft den Wert der timeStampTheGivenSignature-Eigenschaft ab.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isTimeStampTheGivenSignature() {
        if (timeStampTheGivenSignature == null) {
            return false;
        } else {
            return timeStampTheGivenSignature;
        }
    }

    /**
     * Legt den Wert der timeStampTheGivenSignature-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setTimeStampTheGivenSignature(Boolean value) {
        this.timeStampTheGivenSignature = value;
    }

}
