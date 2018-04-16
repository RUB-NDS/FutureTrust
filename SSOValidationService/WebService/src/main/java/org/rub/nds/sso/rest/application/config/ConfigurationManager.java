/*
 * Copyright (C) 2017 vmladenov.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package org.rub.nds.sso.rest.application.config;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import org.opensaml.DefaultBootstrap;
import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
import org.rub.nds.futuretrust.validationservice.sso.library.ConfigDatabase;
import org.rub.nds.saml.samllib.verifier.SAMLIDCache;
import org.rub.nds.sso.exceptions.ConfigurationException;

/**
 *
 * @author vmladenov
 */
public class ConfigurationManager implements ServletContextListener {

    private static final String configFile = "configDB.xml";
    private static String classPath;
    private static ConfigurationManager cfgManager;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            cfgManager = this;
            ServletContext ctx = sce.getServletContext();
            classPath = ctx.getRealPath("/WEB-INF/classes") + "/";
            intialize();
        } catch (ConfigurationException ex) {
            Logger.getLogger(ConfigurationManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        cfgManager = null;
    }

    public static ConfigurationManager getInstance() {
        return cfgManager;
    }

    private void intialize() throws ConfigurationException {
        try {
            DefaultBootstrap.bootstrap();
            initDB(classPath + configFile);
            SAMLIDCache.initialize();
            SAMLIDCache.setCacheDuration(30);
        } catch (org.opensaml.xml.ConfigurationException | JAXBException ex) {
            throw new ConfigurationException("Cannot initialize Application. Configuration is error prone!");
        }
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
