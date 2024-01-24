package myStore.actions;

import myStore.ui.MainPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToSection implements Task {

    private Target targetSection;
    private static String chosenSection;

    public GoToSection(Target section){
        this.targetSection = section;
    }

    public static Performable myAccount(){
        chosenSection = "MyAccountSection";
        return Instrumented.instanceOf(GoToSection.class).withProperties(MainPage.SECTION_LOGIN);
    }
    public static Performable products(){
        chosenSection = "MyAccountSection";
        return Instrumented.instanceOf(GoToSection.class).withProperties(MainPage.SECTION_PRODUCTS);
    }

    @Step("{0} decide navigate to section: #chosenSection")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(this.targetSection));
    }
}
