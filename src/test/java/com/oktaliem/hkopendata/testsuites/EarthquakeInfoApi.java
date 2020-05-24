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
 * mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuites.EarthquakeInfoApi -Dskip-test=true
 */
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EarthquakeInfoApi {

    @Steps
    RestApiSteps user;

    @Test()
    @Title("TC01 - Get Earthquake Information for 'Quick Earthquake Messages' and 'English' language")
    public void testcase_01() {
        String response = user.getEarthquakeInfo(QEM, EN);
        user.verifyEarthquakeInfoIsCorrect(response, QEM, EN);
    }

    @Test()
    @Title("TC02 - Get Earthquake Information for 'Quick Earthquake Messages' and 'Traditional Chinese' language")
    public void testcase_02() {
        String response = user.getEarthquakeInfo(QEM, TC);
        user.verifyEarthquakeInfoIsCorrect(response, QEM, TC);
    }

    @Test()
    @Title("TC03 - Get Earthquake Information for 'Quick Earthquake Messages' and 'Simplified Chinese' language")
    public void testcase_03() {
        String response = user.getEarthquakeInfo(QEM, SC);
        user.verifyEarthquakeInfoIsCorrect(response, QEM, SC);
    }

    @Test()
    @Title("TC04 - Get Earthquake Information for 'Locally Felt Earth Tremor Report' and 'English' language")
    public void testcase_04() {
        String response = user.getEarthquakeInfo(FEQ, EN);
        user.verifyEarthquakeInfoIsCorrect(response, FEQ, EN);
    }

    @Test()
    @Title("TC05 - Get Earthquake Information for 'Locally Felt Earth Tremor Report' and 'Traditional Chinese' language")
    public void testcase_05() {
        String response = user.getEarthquakeInfo(FEQ, TC);
        user.verifyEarthquakeInfoIsCorrect(response, FEQ, TC);
    }

    @Test()
    @Title("TC06 - Get Earthquake Information for 'Locally Felt Earth Tremor Report' and ' Simplified Chinese' language")
    public void testcase_06() {
        String response = user.getEarthquakeInfo(FEQ, SC);
        user.verifyEarthquakeInfoIsCorrect(response, FEQ, SC);
    }

}
