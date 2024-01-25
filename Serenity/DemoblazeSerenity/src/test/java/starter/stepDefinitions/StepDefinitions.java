package starter.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import starter.abilities.NavigateTo;
import starter.constants.Constants;
import starter.questions.CarouselActiveElement;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class StepDefinitions {
    @Given("{actor} opens the home page")
    public void openSite(Actor actor) {
        actor.wasAbleTo(NavigateTo.demoblazeHomePage());
    }

    @Then("{actor} can see the first element active")
    public void heCanSeeTheFirstElementActive(Actor actor) {
        actor.should(
                eventually(
                        seeThat("First", CarouselActiveElement.carouselFirstActiveElement(), equalTo(Constants.ALT_FIRST_ACTIVE))
                )
                        .waitingForNoLongerThan(10)
                        .seconds()
        );
    }

    @Then("{actor} can see the second element active")
    public void heCanSeeTheSecondElementActive(Actor actor) {
        actor.should(
                eventually(
                        seeThat("Second", CarouselActiveElement.carouselSecondActiveElement(), equalTo(Constants.ALT_SECOND_ACTIVE))
                )
                        .waitingForNoLongerThan(10)
                        .seconds()
        );
    }

    @Then("{actor} can see the third element active")
    public void heCanSeeTheThirdElementActive(Actor actor) {
        actor.should(
                eventually(
                        seeThat("Third", CarouselActiveElement.carouselThirdActiveElement(), equalTo(Constants.ALT_THIRD_ACTIVE))
                )
                        .waitingForNoLongerThan(10)
                        .seconds()
        );
    }
}
