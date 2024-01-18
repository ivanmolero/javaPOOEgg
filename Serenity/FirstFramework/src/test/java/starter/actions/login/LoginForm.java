package starter.actions.login;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {
    static Target USERNAME_FIELD = Target.the("username field").locatedBy("#user-name");
    static Target PASSWORD_FIELD = Target.the("password field").locatedBy("#password");

}
