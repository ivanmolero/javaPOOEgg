package test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected String url = "https://swapi.dev/api";
    protected Response response;
    protected SoftAssert softAssert;
    protected JsonPath jsonPath;

    @BeforeTest
    public void preTest() {
        this.softAssert = new SoftAssert();
    }
}
