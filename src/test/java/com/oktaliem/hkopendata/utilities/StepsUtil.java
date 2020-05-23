package com.oktaliem.hkopendata.utilities;

public class StepsUtil {
    public static String getWeatherUrl() {
        return SerenityUtil.getEnv("data.weather.gov.hk");
    }
}
