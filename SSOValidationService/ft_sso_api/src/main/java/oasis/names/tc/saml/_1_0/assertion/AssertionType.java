//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package oasis.names.tc.saml._1_0.assertion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;

/**
 * <p>
 * Java-Klasse für AssertionType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssertionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Conditions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Advice" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}Statement"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}SubjectStatement"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AuthenticationStatement"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AuthorizationDecisionStatement"/>
 *           &lt;element ref="{urn:oasis:names:tc:SAML:1.0:assertion}AttributeStatement"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MajorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MinorVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AssertionID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="Issuer" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IssueInstant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssertionType", propOrder = { "conditions", "advice",
        "statementOrSubjectStatementOrAuthenticationStatement", "signature" })
public class AssertionType {

    @XmlElement(name = "Conditions")
    protected ConditionsType conditions;
    @XmlElement(name = "Advice")
    protected AdviceType advice;
    @XmlElements({ @XmlElement(name = "Statement"),
            @XmlElement(name = "SubjectStatement", type = SubjectStatementAbstractType.class),
            @XmlElement(name = "AuthenticationStatement", type = AuthenticationStatementType.class),
            @XmlElement(name = "AuthorizationDecisionStatement", type = AuthorizationDecisionStatementType.class),
            @XmlElement(name = "AttributeStatement", type = AttributeStatementType.class) })
    protected List<StatementAbstractType> statementOrSubjectStatementOrAuthenticationStatement;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "MajorVersion", required = true)
    protected BigInteger majorVersion;
    @XmlAttribute(name = "MinorVersion", required = true)
    protected BigInteger minorVersion;
    @XmlAttribute(name = "AssertionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String assertionID;
    @XmlAttribute(name = "Issuer", required = true)
    protected String issuer;
    @XmlAttribute(name = "IssueInstant", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueInstant;

    /**
     * Ruft den Wert der conditions-Eigenschaft ab.
     * 
     * @return possible object is {@link ConditionsType }
     * 
     */
    public ConditionsType getConditions() {
        return conditions;
    }

    /**
     * Legt den Wert der conditions-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link ConditionsType }
     * 
     */
    public void setConditions(ConditionsType value) {
        this.conditions = value;
    }

    /**
     * Ruft den Wert der advice-Eigenschaft ab.
     * 
     * @return possible object is {@link AdviceType }
     * 
     */
    public AdviceType getAdvice() {
        return advice;
    }

    /**
     * Legt den Wert der advice-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AdviceType }
     * 
     */
    public void setAdvice(AdviceType value) {
        this.advice = value;
    }

    /**
     * Gets the value of the
     * statementOrSubjectStatementOrAuthenticationStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the
     * statementOrSubjectStatementOrAuthenticationStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getStatementOrSubjectStatementOrAuthenticationStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementAbstractType } {@link SubjectStatementAbstractType }
     * {@link AuthenticationStatementType }
     * {@link AuthorizationDecisionStatementType } {@link AttributeStatementType }
     * 
     * 
     */
    public List<StatementAbstractType> getStatementOrSubjectStatementOrAuthenticationStatement() {
        if (statementOrSubjectStatementOrAuthenticationStatement == null) {
            statementOrSubjectStatementOrAuthenticationStatement = new ArrayList<StatementAbstractType>();
        }
        return this.statementOrSubjectStatementOrAuthenticationStatement;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return possible object is {@link SignatureType }
     * 
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link SignatureType }
     * 
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Ruft den Wert der majorVersion-Eigenschaft ab.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMajorVersion() {
        return majorVersion;
    }

    /**
     * Legt den Wert der majorVersion-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMajorVersion(BigInteger value) {
        this.majorVersion = value;
    }

    /**
     * Ruft den Wert der minorVersion-Eigenschaft ab.
     * 
     * @return possible object is {@link BigInteger }
     * 
     */
    public BigInteger getMinorVersion() {
        return minorVersion;
    }

    /**
     * Legt den Wert der minorVersion-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link BigInteger }
     * 
     */
    public void setMinorVersion(BigInteger value) {
        this.minorVersion = value;
    }

    /**
     * Ruft den Wert der assertionID-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getAssertionID() {
        return assertionID;
    }

    /**
     * Legt den Wert der assertionID-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setAssertionID(String value) {
        this.assertionID = value;
    }

    /**
     * Ruft den Wert der issuer-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * Legt den Wert der issuer-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setIssuer(String value) {
        this.issuer = value;
    }

    /**
     * Ruft den Wert der issueInstant-Eigenschaft ab.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getIssueInstant() {
        return issueInstant;
    }

    /**
     * Legt den Wert der issueInstant-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setIssueInstant(XMLGregorianCalendar value) {
        this.issueInstant = value;
    }

}
