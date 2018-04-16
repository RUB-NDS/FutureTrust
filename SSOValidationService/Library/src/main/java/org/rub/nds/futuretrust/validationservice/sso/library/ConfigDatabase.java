package org.rub.nds.futuretrust.validationservice.sso.library;

import org.rub.nds.futuretrust.cvs.sso.api.ConfigurationType;
import org.rub.nds.futuretrust.cvs.sso.api.DatabaseType;
import org.rub.nds.sso.api.VerificationProfileType;

/**
 *
 * @author vladi
 */

public class ConfigDatabase {
    private static DatabaseType config;

    private ConfigDatabase() {
    }

    public static ConfigDatabase getInstance() {
        return ConfigDatabaseHolder.INSTANCE;
    }

    private static class ConfigDatabaseHolder {

        private static final ConfigDatabase INSTANCE = new ConfigDatabase();
    }

    public static DatabaseType getConfig() {
        return config;
    }

    public static void setConfig(DatabaseType config) {
        ConfigDatabase.config = config;
    }

}
