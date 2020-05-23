package com.oktaliem.hkopendata.utilities;

import net.thucydides.core.guice.ThucydidesModule;
import net.thucydides.core.util.EnvironmentVariables;

public class SerenityUtil {
    private static EnvironmentVariables evs;

    public static String getEnv(String key) {
        if (evs == null) {
            evs = (new ThucydidesModule()).provideEnvironmentVariables();
        }
        return evs.getProperty(key) == null ? "" : evs.getProperty(key);
    }
}
