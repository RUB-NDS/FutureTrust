/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rub.nds.sso.provider;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Juraj Somorovsky - juraj.somorovsky@rub.de
 */
public class EidSecurity {

    private static List<EidProvider> providers;

    static {
        initialize();
    }

    private static void initialize() {
        providers = new LinkedList<>();
    }

    public static void addEidProvider(EidProvider provider) {
        providers.add(provider);
    }

    public static Set<String> getEidTypes() {
        Set<String> s = new HashSet<>();
        for (EidProvider p : providers) {
            s.add(p.getType());
        }
        return s;
    }

    public static EidProvider getEidProviderInstance(String type) throws NoSuchEidProviderException {
        for (EidProvider p : providers) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        throw new NoSuchEidProviderException();
    }
}
