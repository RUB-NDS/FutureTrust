package org.rub.nds.sso.webservice;

import com.fasterxml.jackson.core.JsonFactory;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Provides custom configuration for jackson.
 */
@Provider
public class JacksonConfigurator implements ContextResolver<ObjectMapper> {

    private final ObjectMapper mapper;

    public JacksonConfigurator() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return mapper;
    }

}