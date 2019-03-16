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

/**
 *
 * @author vladi
 */
public class NameGenerator implements org.eclipse.persistence.oxm.XMLNameTransformer {

    // Use the unqualified class name as our root element name.
    public String transformRootElementName(String name) {
        return "verificationRequest_Type";
    }

    // The same algorithm as root element name plus "Type" appended to the end.
    public String transformTypeName(String name) {
        return "verificationRequest_Type";
    }

    // The name will be lower case with word breaks represented by '-'.
    // Note: A capital letter in the original name represents the start of a new
    // word.
    public String transformElementName(String name) {
        return "verificationRequest_Type";
    }

    // The original name converted to upper case.
    public String transformAttributeName(String name) {
        return "verificationRequest_Type";
    }

}
