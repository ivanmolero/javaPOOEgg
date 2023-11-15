package test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SWAPITest extends BaseTest {

    @Test
    public void filmsTest() {
        response = RestAssured.given().get(url + "/films/");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void planetTest() {
        response = RestAssured.given().get(url + "/people/2");
        jsonPath = response.jsonPath();
        List<String> films = jsonPath.getList("films");
        response = RestAssured.given().get(films.get(1));
        jsonPath = response.jsonPath();

        String urlPlanet = (String) jsonPath.getList("planets").get(0);
        response = RestAssured.given().get(urlPlanet);
        jsonPath = response.jsonPath();
        softAssert.assertEquals(jsonPath.get("gravity"), "1.1 standard");
        softAssert.assertEquals(jsonPath.get("terrain"), "tundra, ice caves, mountain ranges");
        softAssert.assertEquals(RestAssured.given().log().uri(), urlPlanet, "la URL consultada no coincide con la url registrada en restassure");
    }

    @Test
    public void filmTest() {
        response = RestAssured.given().get(url + "/people/2");
        jsonPath = response.jsonPath();
        List<String> films = jsonPath.getList("films");

        response = RestAssured.given().get(films.get(1));
        jsonPath = response.jsonPath();
        softAssert.assertEquals(jsonPath.get("release_date"), "1980-05-17");
        softAssert.assertTrue(jsonPath.getList("characters").size() > 1, "la lista de personajes no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("starships").size() > 1, "la lista de starships no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("planets").size() > 1, "la lista de planetas no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("vehicles").size() > 1, "la lista de vehiculos no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("species").size() > 1, "la lista de especies no tiene más de un elemento");
    }
    @Test
    public void peopleTest() {
        response = RestAssured.given().get(url + "/people/2");
        softAssert.assertEquals(response.getStatusCode(), 200);

        JsonPath jsonPath = response.jsonPath();
        List<String> films = jsonPath.getList("films");
        softAssert.assertEquals(films.size(), 6);
        softAssert.assertEquals(jsonPath.getString("skin_color"), "gold");
    }

    @Test
    public void film404Test() {
        response = RestAssured.given().get(url + "/films/7");
        softAssert.assertEquals(response.getStatusCode(), 404, "el recurso no existe por lo que se debe responder 404");
    }
}
