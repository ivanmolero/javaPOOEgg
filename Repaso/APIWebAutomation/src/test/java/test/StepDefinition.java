package test;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.asserts.SoftAssert;
import pages.EditWikipediaPage;
import pages.HistoryWikipediaPage;
import pages.SearchResultWikipediaPage;
import pages.WikipediaPage;
import utils.TestDriver;

import java.util.logging.Logger;

public class StepDefinition {

    private final String URLSWAPI = "https://swapi.dev/api";
    SoftAssert softAssert = new SoftAssert();
    private String value;
    private Response response;
    private WikipediaPage wikipediaPage;
    private SearchResultWikipediaPage searchResultWikipediaPage;
    private EditWikipediaPage editWikipediaPage;
    private HistoryWikipediaPage historyWikipediaPage;

    @Given("retrive data from swapi {string}")
    public void retriveDataSWAPI(String idCharacter) {
        this.response = RestAssured.given().get( this.URLSWAPI + "/people/" + idCharacter);
    }

    @When("get the name of the character")
    public void getCharacterName() {
        this.value = this.response.jsonPath().getString("name");
    }

    @When("search for the value on wikipedia web page")
    public void searchWikipediaPage() {
        this.wikipediaPage = new WikipediaPage(new TestDriver().getDriver());
        this.wikipediaPage.sendKeysSearchInput(this.value);
        this.searchResultWikipediaPage = this.wikipediaPage.clickSearchButton();
    }
    @When("search for the value on wikipedia web page in english")
    public void searchWikipediaPageEnglish() {
        this.wikipediaPage = new WikipediaPage(new TestDriver().getDriver());
        this.wikipediaPage.changeLanguageToEnglish();
        this.wikipediaPage.sendKeysSearchInput(this.value);
        this.searchResultWikipediaPage = this.wikipediaPage.clickSearchButton();
    }

    @Then("the character name is equals to name from swapi")
    public void characterNameEqualsSWAPI() {
        String nameWikiPage = this.searchResultWikipediaPage.getTitlePageText();
        if (this.value.equals(nameWikiPage)) {
            System.out.println("Test pass - names are equals");
        } else {
            System.out.println("Test fail - names aren't equals");
        }
        if (this.searchResultWikipediaPage.isVisibleVectorTOC()) {
            System.out.println("Test pass - lateral nav is visible");
        } else {
            System.out.println("Test fail - lateral nav is not visible");
        }

        softAssert.assertTrue(this.searchResultWikipediaPage.isVisibleVectorTOC(), "no se muestra la barra lateral de navegacion");

//        this.searchResultWikipediaPage.close();
    }

    @Given("a request for random movie from swapi")
    public void requestRandomMovieSWAPI() {
        this.response = RestAssured.given().get(this.URLSWAPI + "/films");
        int limit = this.response.jsonPath().getInt("count");
        int randomFilm = (int)(Math.random() * limit + 1);
        this.response = RestAssured.given().get(this.URLSWAPI + "/films/" + randomFilm);
//        softAssert.assertTrue(randomFilm > 0, "el valor aleatorio es menor o igual a cero");
//        softAssert.assertTrue(randomFilm < 7, "el valor aleatorio es mayor o igual a 7");
//        softAssert.assertTrue(this.response.jsonPath().getString("title").isEmpty(), "el titulo no esta vacio");
    }

    @When("get the name of the movie")
    public void getMoviesName() {
        this.value = this.response.jsonPath().getString("title");
    }

    @When("click on edit link")
    public void clickOnEditWikipedia() {
        this.editWikipediaPage = this.searchResultWikipediaPage.clickEditButton();
    }

    @Then("the edit movie page is displayed correctly")
    public void validateEditMoviePage() {
        String title = this.editWikipediaPage.getTitleEdit().toLowerCase();
//        Logger.getLogger("A1").warning("el titulo es: " + title);
        if (title.contains("edit") && title.contains(this.value.toLowerCase())) {
            System.out.println("Test pass - title value contains movie name and 'edit' text");
        } else {
            System.out.println("Test fail - title value doesn't contains movie name or 'edit' text");
        }
    }

    @When("click on history link")
    public void clickOnHistoryWikipedia() {
        this.historyWikipediaPage = this.searchResultWikipediaPage.clickHistoryButton();
    }

    @Then("the history movie page is displayed correctly")
    public void validateHistoryMoviePage() {
        String title = this.historyWikipediaPage.getTitleHistory().toLowerCase();
//        Logger.getLogger("A1").warning("el titulo es: " + title);
        if (title.contains("history") && title.contains(this.value.toLowerCase())) {
            System.out.println("Test pass - title value contains movie name and 'history' text");
        } else {
            System.out.println("Test fail - title value doesn't contains movie name or 'history' text");
        }
    }

    @After
    public void close() {
        this.wikipediaPage.close();
    }
}
