package com.oktaliem.hkopendata.testsuites;

import com.oktaliem.hkopendata.steps.RestApiSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static com.oktaliem.hkopendata.constants.Query.*;

/**
 * @Author : Okta Liem
 * How to run this Test suit
 * mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuites.WeatherInfoApi -Dskip-test=true
 */
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WeatherInfoApi {
    @Steps
    RestApiSteps user;

    @Test()
    @Title("Get Weather Information for 'Local Forecast' and 'English' language")
    public void testcase_01() {
        String response = user.getWeatherInfo(FLW, EN);
        user.verifyWeatherInfoIsCorrect(response, FLW);
    }

    @Test()
    @Title("Get Weather Information for 'Local Forecast' and 'Traditional Chinese' language")
    public void testcase_02() {
        String response = user.getWeatherInfo(FLW, TC);
        user.verifyWeatherInfoIsCorrect(response, FLW);
    }

    @Test()
    @Title("Get Weather Information for 'Local Forecast' and 'Simplified Chinese' language")
    public void testcase_03() {
        String response = user.getWeatherInfo(FLW, SC);
        user.verifyWeatherInfoIsCorrect(response, FLW);
    }

    @Test()
    @Title("Get Weather Information for '9-day Weather Forecast' and 'English' language")
    public void testcase_04() {
        String response = user.getWeatherInfo(FND, EN);
        user.verifyWeatherInfoIsCorrect(response, FND);
    }

    @Test()
    @Title("Get Weather Information for '9-day Weather Forecast' and 'Traditional Chinese' language")
    public void testcase_05() {
        String response = user.getWeatherInfo(FND, TC);
        user.verifyWeatherInfoIsCorrect(response, FND);
    }

    @Test()
    @Title("Get Weather Information for '9-day Weather Forecast' and 'Simplified Chinese' language")
    public void testcase_06() {
        String response = user.getWeatherInfo(FND, SC);
        user.verifyWeatherInfoIsCorrect(response, FND);
    }

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'English' language")
    public void testcase_07() {
        String response = user.getWeatherInfo(RHR, EN);
        user.verifyWeatherInfoIsCorrect(response, RHR);
    }

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'Traditional Chinese' language")
    public void testcase_08() {
        String response = user.getWeatherInfo(RHR, TC);
        user.verifyWeatherInfoIsCorrect(response, RHR);
    }

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'Simplified Chinese' language")
    public void testcase_09() {
        String response = user.getWeatherInfo(RHR, SC);
        user.verifyWeatherInfoIsCorrect(response, RHR);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Summary' and 'English' language")
    public void testcase_10() {
        String response = user.getWeatherInfo(WWS, EN);
        user.verifyWeatherInfoIsCorrect(response, WWS);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Summary' and 'Traditional Chinese' language")
    public void testcase_11() {
        String response = user.getWeatherInfo(WWS, TC);
        user.verifyWeatherInfoIsCorrect(response, WWS);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Summary' and 'Simplified Chinese' language")
    public void testcase_12() {
        String response = user.getWeatherInfo(WWS, SC);
        user.verifyWeatherInfoIsCorrect(response, WWS);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Information' and 'English' language")
    public void testcase_13() {
        String response = user.getWeatherInfo(WNI, EN);
        user.verifyWeatherInfoIsCorrect(response, WNI);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Information' and 'Traditional Chinese' language")
    public void testcase_14() {
        String response = user.getWeatherInfo(WNI, TC);
        user.verifyWeatherInfoIsCorrect(response, WNI);
    }

    @Test()
    @Title("Get Weather Information for 'Weather Warning Information' and 'Simplified Chinese' language")
    public void testcase_15() {
        String response = user.getWeatherInfo(WNI, SC);
        user.verifyWeatherInfoIsCorrect(response, WNI);
    }

    @Test()
    @Title("Get Weather Information for 'Special Weather Tips' and 'English' language")
    public void testcase_16() {
        String response = user.getWeatherInfo(SWT, EN);
        user.verifyWeatherInfoIsCorrect(response, SWT);
    }

    @Test()
    @Title("Get Weather Information for 'Special Weather Tips' and 'Traditional Chinese' language")
    public void testcase_17() {
        String response = user.getWeatherInfo(SWT, TC);
        user.verifyWeatherInfoIsCorrect(response, SWT);
    }

    @Test()
    @Title("Get Weather Information for 'Special Weather Tips' and 'Simplified Chinese' language")
    public void testcase_18() {
        String response = user.getWeatherInfo(SWT, SC);
        user.verifyWeatherInfoIsCorrect(response, SWT);
    }
}
