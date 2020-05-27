package com.oktaliem.hkopendata.steps;

import com.oktaliem.hkopendata.constants.Endpoints;
import com.oktaliem.hkopendata.model.ClimateAndWeatherModel;
import com.oktaliem.hkopendata.testsuites.WeatherInfoApi;
import com.oktaliem.hkopendata.utilities.StepsUtil;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Assert;

import java.io.*;

import static com.oktaliem.hkopendata.constants.Query.*;
import static com.oktaliem.hkopendata.utilities.DateTimeUtil.*;
import static io.restassured.path.json.JsonPath.from;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertThat;

/**
 * @author Okta Liem
 */
public class RestApiSteps {

    RequestSpecification weatherRequestSpec = new RequestSpecBuilder()
            .setBaseUri(StepsUtil.getWeatherUrl())
            .build();

    @Step
    public String getWeatherInfo(String dataType, String lang) {
        return SerenityRest.rest().spec(weatherRequestSpec)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .get(getWeatherUrl(dataType,lang))
                .then()
                .log().all()
                .extract().asString();
    }

    private String getWeatherUrl(String dataType, String lang) {
        String url = "";
        switch (dataType) {
            case "":
                switch (lang) {
                    case "":
                        url = Endpoints.GET_WEATHER;
                        break;
                    case EN:
                    case TC:
                    case SC:
                        url = Endpoints.GET_WEATHER + "?" + "lang=" + lang;
                        break;
                    default:
                        System.out.println("Invalid Language");
                        break;
                }
                break;
            case FLW:
            case FND:
            case RHR:
            case WNI:
            case WWS:
            case SWT:
                switch (lang) {
                    case "":
                        url = Endpoints.GET_WEATHER + "?" + "dataType=" + dataType;
                        break;
                    case EN:
                    case TC:
                    case SC:
                        url = Endpoints.GET_WEATHER + "?" + "dataType=" + dataType + "&lang=" + lang;
                        break;
                    default:
                        System.out.println("Invalid Language");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Data Type");
                break;
        }
        return url;
    }

    @Step
    public void verifyWeatherInfoIsCorrect(String response, String dataType) {
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        if (!(from(response).get("lightning") == null)) {
            System.out.println("Lightning data is detected");
            assertThat(from(response).get("lightning.data[0].place"), not(isEmptyOrNullString()));
            assertThat(from(response).get("lightning.data[0].occur"), equalTo(TRUE));
            assertThat(from(response).get("lightning.startTime"), not(isEmptyOrNullString()));
            assertThat(from(response).get("lightning.endTime"), not(isEmptyOrNullString()));
        } else { System.out.println("No Lightning data available"); }

        assertThat(from(response).get("rainfall.data[0].unit"), equalTo("mm"));
        assertThat(from(response).get("rainfall.data[0].place"), not(isEmptyOrNullString()));
        assertThat(from(response).get("rainfall.data[0].max"), is(instanceOf(Integer.class)));
        if (!(from(response).get("rainfall.data[0].min") == null)) {
            assertThat(from(response).get("rainfall.data[0].min"), is(instanceOf(Float.class)));
        } else { System.out.println("No Minimum rainfall record data available"); }

        assertThat(from(response).get("rainfall.data[0].main"), equalTo("FALSE"));
        assertThat(from(response).get("rainfall.startTime"), not(isEmptyOrNullString()));
        assertThat(from(response).get("rainfall.endTime"), not(isEmptyOrNullString()));

        assertThat(from(response).get("icon[0]"), is(instanceOf(Integer.class)));
        assertThat(from(response).get("iconUpdateTime"), containsString(getCurrentDate()));

        if (getCurrentHours() >= 6 && getCurrentHours() <= 18) {
        assertThat(from(response).get("uvindex.data[0].place"), not(isEmptyOrNullString()));
        assertThat(from(response).get("uvindex.data[0].value"), is(instanceOf(Float.class)));
        assertThat(from(response).get("uvindex.data[0].desc"), not(isEmptyOrNullString()));
        if (!(from(response).get("uvindex.data[0].message") == null)) {
            assertThat(from(response).get("uvindex.data[0].message"), not(isEmptyOrNullString()));
        } else { System.out.println("No Message for UV index data available"); }
        assertThat(from(response).get("uvindex.recordDesc"), not(isEmptyOrNullString()));
        }

        assertThat(from(response).get("updateTime"), containsString(getCurrentDate()));
        assertThat(from(response).get("warningMessage"), equalTo(""));

        if (!(from(response).get("rainstormReminder") == null)) {
            assertThat(from(response).get("rainstormReminder"), not(isEmptyOrNullString()));
        } else { System.out.println("No Rainstorm Reminder data available"); }

        if (!(from(response).get("specialWxTips") == null)) {
            assertThat(from(response).get("specialWxTips"), not(isEmptyOrNullString()));
        } else { System.out.println("No Special Weather Tips Reminder data available"); }

        if (!(from(response).get("tcmessage") == null)) {
            assertThat(from(response).get("tcmessage"), equalTo(""));
        } else {
            System.out.println("No Message of tropical cyclone position data available");
        }

        if (!(from(response).get("mintempFrom00To09") == null)) {
        } else {
            System.out.println("No Minimum temperature from midnight to 9 am data available");
        }

        if (!(from(response).get("rainfallFrom00To12") == null)) {
            assertThat(from(response).get("rainfallFrom00To12"), equalTo(""));
        } else { System.out.println("No Accumulated rainfall at HKO from midnight to noon data available"); }

        if (!(from(response).get("rainfallLastMonth") == null)) {
            assertThat(from(response).get("rainfallLastMonth"), equalTo(""));
        } else { System.out.println("No Rainfall in last month data available"); }

        if (!(from(response).get("rainfallJanuaryToLastMonth") == null)) {
            assertThat(from(response).get("rainfallJanuaryToLastMonth"), equalTo(""));
        } else { System.out.println("No Accumulated rainfall from January to last month data available"); }

        assertThat(from(response).get("temperature.data[0].place"), not(isEmptyOrNullString()));
        assertThat(from(response).get("temperature.data[0].unit"), equalTo("C"));
        assertThat(from(response).get("temperature.recordTime"), containsString(getCurrentDate()));

        assertThat(from(response).get("humidity.data[0].value"), is(instanceOf(Integer.class)));
        assertThat(from(response).get("humidity.data[0].unit"),  not(isEmptyOrNullString()));
        assertThat(from(response).get("humidity.data[0].place"), not(isEmptyOrNullString()));
        assertThat(from(response).get("humidity.recordTime"), containsString(getCurrentDate()));

//         Or you can assert with Json Scheme instead
        if (!response.equals("{}")) { validateJsonSchema(response, dataType);
        } else { System.out.println("Get API is successful but return no data, Test Passed");}
    }

    private void validateJsonSchema(String response, String jsonSchema) {
        JSONObject rawSchema = new JSONObject(new JSONTokener(WeatherInfoApi.class.getResourceAsStream(
                "/" + jsonSchema + ".json")));
        JSONObject jsonResult = new JSONObject(new JSONTokener(response));
        Schema schema = SchemaLoader.load(rawSchema);
        schema.validate(jsonResult);
    }

    @Step
    public void verifyEarthquakeInfoIsCorrect(String response, String dataType, String lang) {
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        if (!response.equals("{}")) { validateJsonSchema(response, dataType);
        } else { System.out.println("Get API is successful but return no data, Test Passed"); }
    }

    @Step
    public String getEarthquakeInfo(String dataType, String lang) {
        return SerenityRest.rest().spec(weatherRequestSpec)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .get(Endpoints.GET_EARTHQUAKE + "?" + "dataType=" + dataType + "&lang=" + lang)
                .then()
                .log().all()
                .extract().asString();
    }

    @Step
    public String getClimateAndWeatherInfo(ClimateAndWeatherModel requestBody, String methodName, String fileType) throws IOException {
        String baseEndpoint = Endpoints.GET_OPENDATA + "?" + "dataType=" + requestBody.getDataTpe() + "&rformat="
                + requestBody.getRformat() + "&station=" + requestBody.getStation() +
                "&year=" + requestBody.getYear();
        if (!requestBody.getMonth().equals("")) {
            baseEndpoint = baseEndpoint + "&month=" + requestBody.getMonth();
        }
        if (!requestBody.getDay().equals("")) {
            baseEndpoint = baseEndpoint + "&month=" + requestBody.getMonth() + "&day=" + requestBody.getDay();
        }
        if (!requestBody.getHour().equals("")) {
            baseEndpoint = baseEndpoint + "&month=" + requestBody.getMonth() + "&day=" + requestBody.getDay()
                    + "&hour=" + requestBody.getHour();
        }
        String response = SerenityRest.rest().spec(weatherRequestSpec)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .get(baseEndpoint)
                .then()
                .log().all()
                .extract().asString();
        if (requestBody.getRformat().equals(fileType)) {
            writeFileTo(response, methodName, fileType);
        }
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        return response;
    }

    private void deleteFileIfExist(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("Old csv file deleted successfully");
        } else {
            System.out.println("No old csv file to delete");
        }
    }

    private void writeFileTo(String response, String methodName, String fileType) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/" + methodName + "_result." + fileType;
        deleteFileIfExist(filePath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") +
                "/src/test/resources/" + methodName + "_result." + fileType, true));
        writer.append(response);
        writer.close();
        System.out.println("New " + fileType + " file is downloaded successfully");
    }

    @Step
    public void verifyDownloadedFileIsCorrect(String fileName, String fileType) throws IOException {
        fileCompare(fileName, fileType);
    }

    private void fileCompare(String fileName, String fileType) throws IOException {
        System.out.println("Comparing " + fileType + " file result with base file");
        BufferedReader fileBase = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + "/src/test/resources/" + fileName + "." + fileType));
        BufferedReader fileActual = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + "/src/test/resources/" + fileName + "_result." + fileType));
        String lineBase = fileBase.readLine();
        String lineActual = fileActual.readLine();
        boolean areEqual = true;
        int lineNum = 1;
        while (lineBase != null || lineActual != null) {
            if (lineBase == null || lineActual == null) {
                areEqual = false;
                break;
            } else if (!lineBase.equalsIgnoreCase(lineActual)) {
                areEqual = false;
                break;
            }
            lineBase = fileBase.readLine();
            lineActual = fileActual.readLine();
            lineNum++;
        }
        if (areEqual) {
            System.out.println("Two files have same content.");
        } else {
            Assert.fail("Two files has Different Content. They different at line " + lineNum
                    + ". base file has: " + lineBase + " but actual has: " + lineActual + " at line " + lineNum);
        }
        fileBase.close();
        fileActual.close();
    }

    @Step
    public void verifyClimateAndWeatherInfoAreCorrect(String response) {
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        //in-progress
    }

    @Step
    public void unableToSeeWeatherInfo(String response, String dataType) {
        assertThat(404, equalTo(SerenityRest.then().extract().statusCode()));
        assertThat(response, equalTo("Page not found."));
    }
}
