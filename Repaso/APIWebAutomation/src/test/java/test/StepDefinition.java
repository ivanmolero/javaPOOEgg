package test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.CharacterWikipediaPage;
import pages.WikipediaPage;
import utils.TestDriver;

public class StepDefinition {
    private String character;
    private Response response;
    private WikipediaPage wikipediaPage;
    private CharacterWikipediaPage characterWikipediaPage;

    @Given("retrive data from swapi {string}")
    public void retriveDataSWAPI(String idCharacter) {
        this.response = RestAssured.given().get("https://swapi.dev/api" + "/people/" + idCharacter);
    }

    @When("get the name of the character")
    public void getCharacterName() {
        this.character = this.response.jsonPath().getString("name");
    }

    @When("search for him on wikipedia web page")
    public void searchWikipediaPage() {
        this.wikipediaPage = new WikipediaPage(new TestDriver().getDriver());
        this.wikipediaPage.sendKeysSearchInput(this.character);
        this.characterWikipediaPage = this.wikipediaPage.clickSearchButton();
    }

    @Then("the character name is equals to name from swapi")
    public void characterNameEqualsSWAPI() {
        String nameWikiPage = this.characterWikipediaPage.getTitlePageText();
        if (this.character.equals(nameWikiPage)) {
            System.out.println("Test pass - names are equals");
        } else {
            System.out.println("Test fail - names aren't equals");
        }
    }
}
