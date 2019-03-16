//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse für configurationRequestType complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="configurationRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="add"/>
 *               &lt;enumeration value="delete"/>
 *               &lt;enumeration value="modify"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="authentication" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}authentication_Type"/>
 *         &lt;element name="configuration" type="{http://www.api.sso.cvs.futuretrust.nds.rub.org}ConfigurationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationRequestType", propOrder = { "mode", "authentication", "configuration" })
public class ConfigurationRequestType {

    @XmlElement(required = true)
    protected String mode;
    @XmlElement(required = true)
    protected AuthenticationType authentication;
    @XmlElement(required = true)
    protected List<ConfigurationType> configuration;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der authentication-Eigenschaft ab.
     * 
     * @return possible object is {@link AuthenticationType }
     * 
     */
    public AuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Legt den Wert der authentication-Eigenschaft fest.
     * 
     * @param value
     *            allowed object is {@link AuthenticationType }
     * 
     */
    public void setAuthentication(AuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the configuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigurationType }
     * 
     * 
     */
    public List<ConfigurationType> getConfiguration() {
        if (configuration == null) {
            configuration = new ArrayList<ConfigurationType>();
        }
        return this.configuration;
    }

}
