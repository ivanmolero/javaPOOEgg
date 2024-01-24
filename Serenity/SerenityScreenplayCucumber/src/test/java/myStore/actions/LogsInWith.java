package myStore.actions;

import myStore.ui.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class LogsInWith implements Task {
    private final String user;
    private final String password;

    public LogsInWith(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Performable credentials(String user, String password){
        return Instrumented.instanceOf(LogsInWith.class).withProperties(user, password);
    }

    @Override
    @Step("{0}logs into the application")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(user).into(LoginPage.EMAIL).thenHit(Keys.TAB),
                Enter.theValue(password).into(LoginPage.PASSWORD).thenHit(Keys.TAB),
                Click.on(LoginPage.SIGN_IN_BUTTON)
        );
    }
}
