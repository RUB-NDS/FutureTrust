package org.rub.nds.futuretrust.validationservice.sso.library;

import java.util.LinkedHashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.rub.nds.sso.provider.EidProvider;
import oasis.names.tc.dss._1_0.core.schema.VerifyRequest;
import org.rub.nds.futuretrust.cvs.sso.api.EntityType;
import org.rub.nds.futuretrust.cvs.sso.api.RequestBaseType;
import org.rub.nds.futuretrust.cvs.sso.api.VerificationRequestType;
import org.rub.nds.saml.samllib.provider.SamlEidProvider;
import org.rub.nds.sso.api.SamlType;
import org.rub.nds.sso.api.VerificationLogType;

/**
 *
 * @author vladi
 */
public class Controller {

    RequestBaseType request;

    public Controller(RequestBaseType request) {
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

            VerificationRequestType rq = (VerificationRequestType) request.getOptionalInputs()
                    .getCvsVerificationRequest();
            EntityType entity = AuthenticationVerifier.authenticate(ConfigDatabase.getConfig(), rq);

            EidProvider provider = new SamlEidProvider();
            result = provider.verify(SAMLVerificationAdapter.getVerificationProfile(entity, rq.getSaml()));

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
