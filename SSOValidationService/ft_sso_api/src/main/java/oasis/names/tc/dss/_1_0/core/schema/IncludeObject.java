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
import javax.xml.bind.annotation.XmlIDREF;
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
 *       &lt;attribute name="WhichDocument" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="hasObjectTagsAndAttributesSet" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ObjId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createReference" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IncludeObject")
public class IncludeObject {

    @XmlAttribute(name = "WhichDocument")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object whichDocument;
    @XmlAttribute(name = "hasObjectTagsAndAttributesSet")
    protected Boolean hasObjectTagsAndAttributesSet;
    @XmlAttribute(name = "ObjId")
    protected String objId;
    @XmlAttribute(name = "createReference")
    protected Boolean createReference;

    /**
     * Ruft den Wert der whichDocument-Eigenschaft ab.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getWhichDocument() {
        return whichDocument;
    }

    /**
     * Legt den Wert der whichDocument-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWhichDocument(Object value) {
        this.whichDocument = value;
    }

    /**
     * Ruft den Wert der hasObjectTagsAndAttributesSet-Eigenschaft ab.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isHasObjectTagsAndAttributesSet() {
        if (hasObjectTagsAndAttributesSet == null) {
            return false;
        } else {
            return hasObjectTagsAndAttributesSet;
        }
    }

    /**
     * Legt den Wert der hasObjectTagsAndAttributesSet-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setHasObjectTagsAndAttributesSet(Boolean value) {
        this.hasObjectTagsAndAttributesSet = value;
    }

    /**
     * Ruft den Wert der objId-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getObjId() {
        return objId;
    }

    /**
     * Legt den Wert der objId-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setObjId(String value) {
        this.objId = value;
    }

    /**
     * Ruft den Wert der createReference-Eigenschaft ab.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public boolean isCreateReference() {
        if (createReference == null) {
            return true;
        } else {
            return createReference;
        }
    }

    /**
     * Legt den Wert der createReference-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Boolean }
     * 
     */
    public void setCreateReference(Boolean value) {
        this.createReference = value;
    }

}
