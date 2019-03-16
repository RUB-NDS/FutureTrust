//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für authentication_Type complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="authentication_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="username/pw"/>
 *               &lt;enumeration value="pop"/>
 *               &lt;enumeration value="mutual_tls"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="client_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client_secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pop_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="client_cert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication_Type", propOrder = { "method", "clientId", "clientSecret", "popToken", "clientCert" })
public class AuthenticationType {

    protected String method;
    @XmlElement(name = "client_id")
    protected String clientId;
    @XmlElement(name = "client_secret")
    protected String clientSecret;
    @XmlElement(name = "pop_token")
    protected String popToken;
    @XmlElement(name = "client_cert")
    protected String clientCert;

    /**
     * Ruft den Wert der method-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMethod() {
        return method;
    }

    /**
     * Legt den Wert der method-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Ruft den Wert der clientId-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Legt den Wert der clientId-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Ruft den Wert der clientSecret-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Legt den Wert der clientSecret-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setClientSecret(String value) {
        this.clientSecret = value;
    }

    /**
     * Ruft den Wert der popToken-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getPopToken() {
        return popToken;
    }

    /**
     * Legt den Wert der popToken-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setPopToken(String value) {
        this.popToken = value;
    }

    /**
     * Ruft den Wert der clientCert-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClientCert() {
        return clientCert;
    }

    /**
     * Legt den Wert der clientCert-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setClientCert(String value) {
        this.clientCert = value;
    }

}
