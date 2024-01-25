package starter.stepDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.abilities.NavigateTo;

public class StepDefinitions {
    @Given("{actor} opens the home page")
    public void openSite(Actor actor) {
        actor.wasAbleTo(NavigateTo.demoblazeHomePage());
    }
}
