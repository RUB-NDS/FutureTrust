//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.saml._1_0.assertion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für AuthorizationDecisionStatementType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationDecisionStatementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectStatementAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Action" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Evidence" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Resource" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="Decision" use="required" type="{urn:oasis:names:tc:SAML:1.0:assertion}DecisionType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationDecisionStatementType", propOrder = { "action", "evidence" })
public class AuthorizationDecisionStatementType extends SubjectStatementAbstractType {

    @XmlElement(name = "Action", required = true)
    protected List<ActionType> action;
    @XmlElement(name = "Evidence")
    protected EvidenceType evidence;
    @XmlAttribute(name = "Resource", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String resource;
    @XmlAttribute(name = "Decision", required = true)
    protected DecisionType decision;

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionType }
     * 
     * 
     */
    public List<ActionType> getAction() {
        if (action == null) {
            action = new ArrayList<ActionType>();
        }
        return this.action;
    }

    /**
     * Ruft den Wert der evidence-Eigenschaft ab.
     * 
     * @return possible object is {@link EvidenceType }
     * 
     */
    public EvidenceType getEvidence() {
        return evidence;
    }

    /**
     * Legt den Wert der evidence-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link EvidenceType }
     * 
     */
    public void setEvidence(EvidenceType value) {
        this.evidence = value;
    }

    /**
     * Ruft den Wert der resource-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getResource() {
        return resource;
    }

    /**
     * Legt den Wert der resource-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setResource(String value) {
        this.resource = value;
    }

    /**
     * Ruft den Wert der decision-Eigenschaft ab.
     * 
     * @return possible object is {@link DecisionType }
     * 
     */
    public DecisionType getDecision() {
        return decision;
    }

    /**
     * Legt den Wert der decision-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link DecisionType }
     * 
     */
    public void setDecision(DecisionType value) {
        this.decision = value;
    }

}
