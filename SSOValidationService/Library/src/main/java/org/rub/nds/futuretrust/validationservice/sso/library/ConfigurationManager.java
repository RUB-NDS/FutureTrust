package org.rub.nds.futuretrust.validationservice.sso.library;

import java.io.File;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
import org.rub.nds.saml.samllib.verifier.SAMLIDCache;

/**
 *
 * @author Vladislav Mladenov <vladislav.mladenov@rub.de>
 */
public class ConfigurationManager {

    private static final String configFile = "config.xml";

    public ConfigurationManager() throws JAXBException {
        init("configFile");
    }

    public ConfigurationManager(String filepath) throws JAXBException {
        init(filepath);
    }

    private void init(String filepath) throws JAXBException {
        initDB(filepath);
        SAMLIDCache.initialize();
        SAMLIDCache.setCacheDuration(30);
    }

    private void initDB(String filepath) throws JAXBException {
        File file = new File(filepath);
        JAXBContext jaxbContext = JAXBContext.newInstance(DatabaseType.class);
        Source source = new StreamSource(file);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        JAXBElement<DatabaseType> el = jaxbUnmarshaller.unmarshal(source, DatabaseType.class);
        ConfigDatabase.setConfig(el.getValue());
    }
}
