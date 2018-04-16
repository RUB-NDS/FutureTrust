/*
 * Copyright (C) 2016 Juraj Somorovsky - juraj.somorovsky@rub.de.
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

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest;
import org.rub.nds.futuretrust.validationservice.sso.library.Controller;
import org.rub.nds.sso.api.VerificationResponseType;
import org.rub.nds.saml.samllib.exceptions.SAMLBuildException;

/**
 * REST Web Service
 *
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
@Path("validation")
public class ValidationService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ValidationService
     */
    public ValidationService() {
    }

    /**
     * Retrieves representation of an instance of
     * org.rub.nds.sso.rest.application.config.ValidationService
     *
     * @return an instance of org.rub.nds.sso.api.VerificationResponseType
     */
    @GET
    @Produces("application/json")
    @Path("/list")
    public String getJson() {
        return "{methods : verifyrequest}";
    }

    /**
     * POST method for updating or creating an instance of ValidationService
     *
     * @param content
     *            representation for the resource
     * @return
     */
    @POST
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces("application/json")
    @Path("verifyrequest")
    public VerificationResponseType postJson(VerifyRequest content) throws JAXBException, SAMLBuildException {
        return new Controller(content).verify();
    }
}
