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

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.opensaml.DefaultBootstrap;
import org.rub.nds.sso.exceptions.ConfigurationException;

/**
 *
 * @author vmladenov
 */
public class ConfigurationManager implements ServletContextListener {
    private static ConfigurationManager cfgManager;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            cfgManager = this;
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
        } catch (org.opensaml.xml.ConfigurationException ex) {
            throw new ConfigurationException("Cannot initialize Application. Configuration is error prone!");
        }
    }

}
