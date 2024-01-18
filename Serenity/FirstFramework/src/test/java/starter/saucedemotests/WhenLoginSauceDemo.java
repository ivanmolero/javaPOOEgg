package starter.saucedemotests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.login.Inventory;
import starter.actions.login.LoginForm;
import starter.actions.login.WriteLoginData;
import starter.actions.navigation.NavigateTo;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoginSauceDemo {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("debe poder llevar a cabo el login")
    public void loginTest() {
        actor.attemptsTo(
                NavigateTo.theSauceDemoHomePage(),
                WriteLoginData.writeUsername("standard_user"),
                WriteLoginData.writePassword("secret_sauce"),
                Ensure.that(Inventory.TITLE).hasText("Swag Labs")
        );
    }

}
