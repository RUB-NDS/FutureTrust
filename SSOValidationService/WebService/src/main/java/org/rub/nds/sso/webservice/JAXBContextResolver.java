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
package org.rub.nds.sso.webservice;

/**
 *
 * @author vmladenov
 */
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import org.eclipse.persistence.jaxb.JAXBContextFactory;
import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType;
import org.rub.nds.sso.api.VerificationResponseType;

@Provider
public class JAXBContextResolver implements ContextResolver<JAXBContext> {

    private JAXBContext context;

    public JAXBContextResolver() throws Exception {
        // final Map<String, String> namespacePrefixMapper = new HashMap<String,
        // String>();
        // namespacePrefixMapper.put("http://www.w3.org/2001/XMLSchema-instance",
        // "xsi");
        // namespacePrefixMapper.put("http://www.api.sso.cvs.futuretrust.nds.rub.org",
        // "ft");
        // namespacePrefixMapper.put("http://www.api.sso.nds.rub.org", "sso");
        // namespacePrefixMapper.put("urn:oasis:names:tc:dss:1.0:core:schema",
        // "dss");
        //
        // Map<String, Object> jaxbProperties = new HashMap<String, Object>();
        // jaxbProperties.put(JAXBContextProperties.MEDIA_TYPE,
        // "application/json");
        // jaxbProperties.put(JAXBContextProperties.JSON_INCLUDE_ROOT, false);
        // jaxbProperties.put(JAXBContextProperties.JSON_NAMESPACE_SEPARATOR,
        // ':');
        // jaxbProperties.put(JAXBContextProperties.NAMESPACE_PREFIX_MAPPER,
        // namespacePrefixMapper);
        System.setProperty(JAXBContext.class.getName(), "org.eclipse.persistence.jaxb.JAXBContextFactory");
        Map<String, Object> props = new HashMap<String, Object>();
        props.put("eclipselink.media-type", "application/json");
        props.put("eclipselink.json.include-root", false);
        props.put(MarshallerProperties.JSON_VALUE_WRAPPER, "arguments");
        this.context = JAXBContextFactory.createContext(new Class[] { RequestBaseType.class,
                VerificationResponseType.class }, props

        );

    }

    public JAXBContext getContext(Class<?> aClass) {
        return context;
    }
}
