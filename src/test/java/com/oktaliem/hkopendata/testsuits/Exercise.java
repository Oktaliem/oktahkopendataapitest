package com.oktaliem.hkopendata.testsuits;

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
 * mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuits.Exercise -Dskip-test=true
 */
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Exercise {
    @Steps
    RestApiSteps user;

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'English' language")
    public void testcase_01() {
        String response = user.getWeatherInfo(RHR, EN);
        user.verifyWeatherInfoIsCorrect(response, RHR, EN);
    }

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'Traditional Chinese' language")
    public void testcase_02() {
        String response = user.getWeatherInfo(RHR, TC);
        user.verifyWeatherInfoIsCorrect(response, RHR, TC);
    }

    @Test()
    @Title("Get Weather Information for 'Current Weather Report' and 'Simplified Chinese' language")
    public void testcase_03() {
        String response = user.getWeatherInfo(RHR, SC);
        user.verifyWeatherInfoIsCorrect(response, RHR, SC);
    }
}
