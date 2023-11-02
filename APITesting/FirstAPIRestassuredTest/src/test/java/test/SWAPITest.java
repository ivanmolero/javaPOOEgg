package test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SWAPITest {

    @Test
    public void filmsTest() {
        Response response;
        response = RestAssured.given().get("https://swapi.dev/api/films/");
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void peopleTest() {
        SoftAssert softAssert = new SoftAssert();
        Response response;
        response = RestAssured.given().get("https://swapi.dev/api/people/2");
        JsonPath jsonPath = response.jsonPath();
        List<String> films = jsonPath.getList("films");
        softAssert.assertEquals(films.size(), 6);
        softAssert.assertEquals(jsonPath.getString("skin_color"), "gold");

        response = RestAssured.given().get(films.get(1));
        jsonPath = response.jsonPath();
        softAssert.assertEquals(jsonPath.get("release_date"), "1980-05-17");
        softAssert.assertTrue(jsonPath.getList("characters").size() > 1, "la lista de personajes no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("planets").size() > 1, "la lista de planetas no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("vehicles").size() > 1, "la lista de vehiculos no tiene más de un elemento");
        softAssert.assertTrue(jsonPath.getList("species").size() > 1, "la lista de especies no tiene más de un elemento");

        String urlPlanet = (String) jsonPath.getList("planets").get(0);
        response = RestAssured.given().get(urlPlanet);
        jsonPath = response.jsonPath();
        softAssert.assertEquals(jsonPath.get("gravity"), "1.1 standard");
        softAssert.assertEquals(jsonPath.get("terrain"), "tundra, ice caves, mountain ranges");

    }
}
