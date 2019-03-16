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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java-Klasse für DocumentBaseType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="RefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="RefType" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="SchemaRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentBaseType")
@XmlSeeAlso({ DocumentType.class, DocumentHash.class, TransformedData.class })
public abstract class DocumentBaseType {

    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "RefURI")
    @XmlSchemaType(name = "anyURI")
    protected String refURI;
    @XmlAttribute(name = "RefType")
    @XmlSchemaType(name = "anyURI")
    protected String refType;
    @XmlAttribute(name = "SchemaRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> schemaRefs;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getID() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der refURI-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRefURI() {
        return refURI;
    }

    /**
     * Legt den Wert der refURI-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRefURI(String value) {
        this.refURI = value;
    }

    /**
     * Ruft den Wert der refType-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Legt den Wert der refType-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRefType(String value) {
        this.refType = value;
    }

    /**
     * Gets the value of the schemaRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the schemaRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSchemaRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Object }
     * 
     * 
     */
    public List<Object> getSchemaRefs() {
        if (schemaRefs == null) {
            schemaRefs = new ArrayList<Object>();
        }
        return this.schemaRefs;
    }

}
