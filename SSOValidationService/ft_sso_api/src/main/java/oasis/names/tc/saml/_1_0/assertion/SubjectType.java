//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für SubjectType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}NameIdentifier"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectConfirmation" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectConfirmation"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectType", propOrder = { "content" })
public class SubjectType {

    @XmlElementRefs({
            @XmlElementRef(name = "SubjectConfirmation", namespace = "urn:oasis:names:tc:SAML:1.0:assertion", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NameIdentifier", namespace = "urn:oasis:names:tc:SAML:1.0:assertion", type = JAXBElement.class, required = false) })
    protected List<JAXBElement<?>> content;

    /**
     * Ruft das restliche Contentmodell ab.
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: Der
     * Feldname "SubjectConfirmation" wird von zwei verschiedenen Teilen eines
     * Schemas verwendet. Siehe: Zeile 101 von
     * file:/media/vmladenov/Plaintext/SVN
     * /repos_projects/2015/FutureTrust/Doku/Arbeitspakete
     * /WP3/Task3_3/APIs/futuretrust_cvs
     * /specs/oasis-sstc-saml-schema-protocol-1.1.xsd Zeile 99 von
     * file:/media/vmladenov
     * /Plaintext/SVN/repos_projects/2015/FutureTrust/Doku/Arbeitspakete
     * /WP3/Task3_3
     * /APIs/futuretrust_cvs/specs/oasis-sstc-saml-schema-protocol-1.1.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung
     * für eine der beiden folgenden Deklarationen an, um deren Namen zu ändern:
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SubjectConfirmationType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameIdentifierType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
