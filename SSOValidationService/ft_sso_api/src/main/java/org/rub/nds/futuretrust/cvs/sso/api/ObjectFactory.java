//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.01.06 um 12:38:40 PM CET 
//

package org.rub.nds.futuretrust.cvs.sso.api;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the org.rub.nds.futuretrust.cvs.sso.api
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VerifyRequest_QNAME = new QName("http://www.api.sso.cvs.futuretrust.nds.rub.org",
            "VerifyRequest");
    private final static QName _DataBase_QNAME = new QName("http://www.api.sso.cvs.futuretrust.nds.rub.org", "DataBase");
    private final static QName _ConfigurationRequest_QNAME = new QName(
            "http://www.api.sso.cvs.futuretrust.nds.rub.org", "ConfigurationRequest");
    private final static QName _VerifyResponse_QNAME = new QName("http://www.api.sso.cvs.futuretrust.nds.rub.org",
            "VerifyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: org.rub.nds.futuretrust.cvs.sso.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of
     * {@link org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType }
     * 
     */
    public org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType createResponseBaseType() {
        return new org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType();
    }

    /**
     * Create an instance of
     * {@link org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType }
     * 
     */
    public org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType createRequestBaseType() {
        return new org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType();
    }

    /**
     * Create an instance of {@link ConfigurationRequestType }
     * 
     */
    public ConfigurationRequestType createConfigurationRequestType() {
        return new ConfigurationRequestType();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link DatabaseType }
     * 
     */
    public DatabaseType createDatabaseType() {
        return new DatabaseType();
    }

    /**
     * Create an instance of {@link ConfigurationType }
     * 
     */
    public ConfigurationType createConfigurationType() {
        return new ConfigurationType();
    }

    /**
     * Create an instance of {@link EntityType }
     * 
     */
    public EntityType createEntityType() {
        return new EntityType();
    }

    /**
     * Create an instance of {@link VerificationResponseType }
     * 
     */
    public VerificationResponseType createVerificationResponseType() {
        return new VerificationResponseType();
    }

    /**
     * Create an instance of {@link VerificationRequestType }
     * 
     */
    public VerificationRequestType createVerificationRequestType() {
        return new VerificationRequestType();
    }

    /**
     * Create an instance of {@link AuthenticationType }
     * 
     */
    public AuthenticationType createAuthenticationType() {
        return new AuthenticationType();
    }

    /**
     * Create an instance of {@link AnyType }
     * 
     */
    public AnyType createAnyType() {
        return new AnyType();
    }

    /**
     * Create an instance of {@link InternationalStringType }
     * 
     */
    public InternationalStringType createInternationalStringType() {
        return new InternationalStringType();
    }

    /**
     * Create an instance of
     * {@link org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType.OptionalOutputs }
     * 
     */
    public org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType.OptionalOutputs createResponseBaseTypeOptionalOutputs() {
        return new org.rub.nds.futuretrust.cvs.sso.api.ResponseBaseType.OptionalOutputs();
    }

    /**
     * Create an instance of
     * {@link org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.OptionalInputs }
     * 
     */
    public org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.OptionalInputs createRequestBaseTypeOptionalInputs() {
        return new org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.OptionalInputs();
    }

    /**
     * Create an instance of
     * {@link org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.InputDocuments }
     * 
     */
    public org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.InputDocuments createRequestBaseTypeInputDocuments() {
        return new org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType.InputDocuments();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link oasis.names.tc.dss._1_0.core.schema.RequestBaseType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.api.sso.cvs.futuretrust.nds.rub.org", name = "VerifyRequest")
    public JAXBElement<oasis.names.tc.dss._1_0.core.schema.RequestBaseType> createVerifyRequest(
            oasis.names.tc.dss._1_0.core.schema.RequestBaseType value) {
        return new JAXBElement<oasis.names.tc.dss._1_0.core.schema.RequestBaseType>(_VerifyRequest_QNAME,
                oasis.names.tc.dss._1_0.core.schema.RequestBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseType }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.api.sso.cvs.futuretrust.nds.rub.org", name = "DataBase")
    public JAXBElement<DatabaseType> createDataBase(DatabaseType value) {
        return new JAXBElement<DatabaseType>(_DataBase_QNAME, DatabaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link ConfigurationRequestType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.api.sso.cvs.futuretrust.nds.rub.org", name = "ConfigurationRequest")
    public JAXBElement<ConfigurationRequestType> createConfigurationRequest(ConfigurationRequestType value) {
        return new JAXBElement<ConfigurationRequestType>(_ConfigurationRequest_QNAME, ConfigurationRequestType.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link oasis.names.tc.dss._1_0.core.schema.ResponseBaseType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://www.api.sso.cvs.futuretrust.nds.rub.org", name = "VerifyResponse")
    public JAXBElement<oasis.names.tc.dss._1_0.core.schema.ResponseBaseType> createVerifyResponse(
            oasis.names.tc.dss._1_0.core.schema.ResponseBaseType value) {
        return new JAXBElement<oasis.names.tc.dss._1_0.core.schema.ResponseBaseType>(_VerifyResponse_QNAME,
                oasis.names.tc.dss._1_0.core.schema.ResponseBaseType.class, null, value);
    }

}
