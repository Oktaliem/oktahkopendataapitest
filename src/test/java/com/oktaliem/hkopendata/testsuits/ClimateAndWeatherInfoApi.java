package com.oktaliem.hkopendata.testsuits;

import com.oktaliem.hkopendata.model.ClimateAndWeatherModel;
import com.oktaliem.hkopendata.steps.RestApiSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.io.IOException;

import static com.oktaliem.hkopendata.constants.Query.CSV;
import static com.oktaliem.hkopendata.constants.Query.JSON;

/**
 * @Author : Okta Liem
 * mvn clean verify -Dit.test=com.oktaliem.hkopendata.testsuits.ClimateAndWeatherInfoApi -Dskip-test=true
 */
@RunWith(SerenityRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClimateAndWeatherInfoApi {

    @Rule
    public TestName testName = new TestName();

    @Steps
    RestApiSteps user;

    public ClimateAndWeatherModel requestBody = new ClimateAndWeatherModel();

    @Test()
    @Title("Get Climate and Weather Information with Parameters: HHOT, csv, CCH and 2020")
    public void testcase_01() throws IOException {
        requestBody.setDataTpe("HHOT")
                .setRformat(CSV)
                .setStation("CCH")
                .setYear("2020")
                .setMonth("2")
                .setDay("1");
        user.getClimateAndWeatherInfo(requestBody, testName.getMethodName(),CSV);
        user.verifyDownloadedFileIsCorrect(testName.getMethodName(), requestBody.getRformat());
    }

    @Test()
    @Title("Get Climate and Weather Information with Parameters: HHOT, json, CCH and 2020")
    public void testcase_02() throws IOException {
        requestBody.setDataTpe("HHOT")
                .setRformat(JSON)
                .setStation("CCH")
                .setYear("2020")
                .setMonth("2")
                .setDay("1");
        String response = user.getClimateAndWeatherInfo(requestBody, testName.getMethodName(), JSON);
        user.verifyClimateAndWeatherInfoAreCorrect(response);
    }
}
