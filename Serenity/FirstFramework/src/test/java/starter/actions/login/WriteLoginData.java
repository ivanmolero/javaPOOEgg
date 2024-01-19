package starter.actions.login;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WriteLoginData {


    public static Performable writeUsername(String username) {
        return Task.where("{0} write the username: " + username,
                Enter.theValue(username)
                        .into(LoginForm.USERNAME_FIELD)
        );
    }
    public static Performable writePassword(String password) {
        return Task.where("{0} write the password: " + password,
                Enter.theValue(password)
                        .into(LoginForm.PASSWORD_FIELD)
                        .thenHit(Keys.ENTER)
        );
    }
}
