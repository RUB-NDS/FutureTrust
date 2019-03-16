//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oasis.names.tc.dss._1_0.core.schema.Result;

/**
 * <p>
 * Java-Klasse für ResponseBaseType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResponseBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:dss:1.0:core:schema}Result"/>
 *         &lt;element name="OptionalOutputs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cvs_verification_response" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}verificationResponse_Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Profile" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseBaseType", propOrder = { "result", "optionalOutputs" })
public class ResponseBaseType {

    @XmlElement(name = "Result", namespace = "urn:oasis:names:tc:dss:1.0:core:schema", required = true)
    protected Result result;
    @XmlElement(name = "OptionalOutputs")
    protected ResponseBaseType.OptionalOutputs optionalOutputs;
    @XmlAttribute(name = "RequestID")
    protected String requestID;
    @XmlAttribute(name = "Profile", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String profile;

    /**
     * Ruft den Wert der result-Eigenschaft ab.
     * 
     * @return possible object is {@link Result }
     * 
     */
    public Result getResult() {
        return result;
    }

    /**
     * Legt den Wert der result-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link Result }
     * 
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Ruft den Wert der optionalOutputs-Eigenschaft ab.
     * 
     * @return possible object is {@link ResponseBaseType.OptionalOutputs }
     * 
     */
    public ResponseBaseType.OptionalOutputs getOptionalOutputs() {
        return optionalOutputs;
    }

    /**
     * Legt den Wert der optionalOutputs-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link ResponseBaseType.OptionalOutputs }
     * 
     */
    public void setOptionalOutputs(ResponseBaseType.OptionalOutputs value) {
        this.optionalOutputs = value;
    }

    /**
     * Ruft den Wert der requestID-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getRequestID() {
        return requestID;
    }

    /**
     * Legt den Wert der requestID-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setRequestID(String value) {
        this.requestID = value;
    }

    /**
     * Ruft den Wert der profile-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Legt den Wert der profile-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setProfile(String value) {
        this.profile = value;
    }

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
     *         &lt;element name="cvs_verification_response" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}verificationResponse_Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "cvsVerificationResponse" })
    public static class OptionalOutputs {

        @XmlElement(name = "cvs_verification_response", required = true)
        protected VerificationResponseType cvsVerificationResponse;

        /**
         * Ruft den Wert der cvsVerificationResponse-Eigenschaft ab.
         * 
         * @return possible object is {@link VerificationResponseType }
         * 
         */
        public VerificationResponseType getCvsVerificationResponse() {
            return cvsVerificationResponse;
        }

        /**
         * Legt den Wert der cvsVerificationResponse-Eigenschaft fest.
         * 
         * @param value
         *            allowed object is {@link VerificationResponseType }
         * 
         */
        public void setCvsVerificationResponse(VerificationResponseType value) {
            this.cvsVerificationResponse = value;
        }

    }

}
