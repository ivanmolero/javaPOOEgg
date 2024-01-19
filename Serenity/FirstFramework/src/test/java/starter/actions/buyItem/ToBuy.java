package starter.actions.buyItem;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import starter.actions.login.Inventory;

import java.util.Random;

public class ToBuy {

    public static Performable addRandomItem() {
        int random = new Random().nextInt(0, 5);
        return Task.where("{0} select a random item, position " + random,
                Click.on(Inventory.ADD_BUTTONS)
        );
    }

    public static Performable goToShoppinCart() {
        return Task.where("{0} going to the cart shopping" ,
                Click.on(Inventory.SHOPPING_CART_BUTTON)
        );
    }

    public static Performable goToCheckout() {
        return Task.where("{0} going to the checkout",
                Click.on(Inventory.CHECKOUT_BUTTON)
        );
    }

    public static Performable writeFirstName(String firstName) {
        return Task.where("{0} write his first name",
                Enter.theValue(firstName)
                        .into(Inventory.FIRST_NAME_FIELD)
        );
    }

    public static Performable writeLastName(String lastName) {
        return Task.where("{0} write his first name",
                Enter.theValue(lastName)
                        .into(Inventory.FIRST_LAST_FIELD)
        );
    }

    public static Performable writePostalCode(String postalCode) {
        return Task.where("{0} write his first name",
                Enter.theValue(postalCode)
                        .into(Inventory.POSTAL_CODE_FIELD)
        );
    }

    public static Performable pressContinueButton() {
        return Task.where("{0} continue to validate data",
                Click.on(Inventory.CONTINUE_BUTTON)
        );
    }

    public static Performable pressFinishButton() {
        return Task.where("{0} going to the finish",
                Click.on(Inventory.FINISH_BUTTON)
        );
    }
}
