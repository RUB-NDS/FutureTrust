package org.rub.nds.futuretrust.validationservice.sso.library;

import org.rub.nds.sso.provider.EidProvider;
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest;
import org.rub.nds.futuretrust.cvs.sso.api.VerificationRequestType;
import org.rub.nds.saml.samllib.provider.SamlEidProvider;
import org.rub.nds.sso.api.VerificationLogType;

/**
 *
 * @author vladi
 */



public class Controller {
    VerifyRequest request;

    public Controller(VerifyRequest request) {
        this.request = request;
    }

    public org.rub.nds.sso.api.VerificationResponseType verify() {
        org.rub.nds.sso.api.VerificationResponseType result = new org.rub.nds.sso.api.VerificationResponseType();
        try {
            // JAXBContext context =
            // JAXBContext.newInstance(VerificationRequestType.class);
            // Unmarshaller um = context.createUnmarshaller();
            // VerificationRequestType rq = (VerificationRequestType)
            // um.unmarshal((Node) request.getOptionalInputs()
            // .getAny().get(0));
            VerificationRequestType rq = (VerificationRequestType) request.getOptionalInputs().getAny().get(0);
            EidProvider provider = new SamlEidProvider();
            result = provider.verify(rq.getSaml());

            return result;
        } catch (Exception ex) { // TODO: Only exceptions which are throws by
                                 // our lib
            VerificationLogType log = new VerificationLogType();
            log.setException(ex.getMessage());
            ex.printStackTrace();
            result.setVerificationLog(log);
            return result;
        }
    }
}

