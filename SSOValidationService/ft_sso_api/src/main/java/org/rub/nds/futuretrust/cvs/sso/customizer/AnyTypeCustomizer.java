/*
 * Copyright (C) 2017 vladi.
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
package org.rub.nds.futuretrust.cvs.sso.customizer;

import org.eclipse.persistence.config.DescriptorCustomizer;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.descriptors.InheritancePolicy;
import org.eclipse.persistence.oxm.XMLField;
import org.eclipse.persistence.oxm.mappings.XMLObjectReferenceMapping;
import org.rub.nds.futuretrust.cvs.sso.api.VerificationRequestType;

/**
 *
 * @author vladi
 */
public class AnyTypeCustomizer implements DescriptorCustomizer {

    @Override
    public void customize(ClassDescriptor descriptor) throws Exception {

        XMLObjectReferenceMapping contactMapping = new XMLObjectReferenceMapping();
        contactMapping.setReferenceClass(VerificationRequestType.class);
        XMLField x1 = new XMLField();
        XMLField x2 = new XMLField();
        descriptor.setJavaClass(VerificationRequestType.class);
        descriptor.setPrimaryKeyFieldName("verificationRequest_Type");
        // contactMapping.addSourceToTargetKeyFieldAssociation("", "");
        // contactMapping.addSourceToTargetKeyFieldAssociation(new
        // XMLField().setNameForComparisons("any"), new
        // XMLField().setNameForComparisons("verificationRequest_Type"));
        // descriptor.getInheritancePolicy().setClassIndicatorFieldName("@type");
        // descriptor.getInheritancePolicy().setClassExtractorName("VerificationRequest_Type");
        // descriptor.getInheritancePolicy().setClassExtractorName(VerificationRequestType.class.getCanonicalName());
    }
}
