package starter.saucedemotests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.buyItem.ToBuy;
import starter.actions.login.Inventory;
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

    @Test
    @DisplayName("debe agregar items aleatorios al carrito y comprarlos")
    public void randomBuy() {
        actor.attemptsTo(
                NavigateTo.theSauceDemoHomePage(),
                WriteLoginData.writeUsername("standard_user"),
                WriteLoginData.writePassword("secret_sauce"),
                ToBuy.addRandomItem(),
                ToBuy.goToShoppinCart(),
                ToBuy.goToCheckout(),
                ToBuy.writeFirstName("Juan"),
                ToBuy.writeLastName("Garcia"),
                ToBuy.writePostalCode("08006"),
                ToBuy.pressContinueButton(),
                Ensure.that(Inventory.TAG_PAYMENT).hasText("Payment Information"),
                ToBuy.pressFinishButton(),
                Ensure.that(Inventory.COMPLETE_HEADER).hasText("Thank you for your order!")
        );
    }



}
