package com.oktaliem.hkopendata.utilities;

/**
 * @author Okta Liem
 */
public class StepsUtil {
    public static String getWeatherUrl() {
        return SerenityUtil.getEnv("data.weather.gov.hk");
    }
}
