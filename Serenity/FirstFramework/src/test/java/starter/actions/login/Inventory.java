package starter.actions.login;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inventory {

    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#login-button");
    public static Target LATERAL_MENU_BUTTON = Target.the("lateral menu button").locatedBy("#react-burger-menu-btn");
    public static Target LOGOUT_BUTTON = Target.the("logout button").locatedBy("#logout_sidebar_link");
    public static Target REMOVE_BUTTON = Target.the("remove cart item").locatedBy(".cart_button");
    public static Target TAG_PAYMENT = Target.the("tag payment").locatedBy(".summary_info_label");

    public static Target TITLE = Target.the("title").locatedBy(".app_logo");

    public static Target ADD_BUTTONS = Target.the("add buttons").locatedBy(".btn_primary");

    public static Target SHOPPING_CART_BUTTON = Target.the("shopping cart button").locatedBy(".shopping_cart_link");

    public static Target CHECKOUT_BUTTON = Target.the("checkout button").locatedBy(".checkout_button");

    public static Target FIRST_NAME_FIELD = Target.the("first name field").locatedBy("#first-name");

    public static Target FIRST_LAST_FIELD = Target.the("last name field").locatedBy("#last-name");

    public static Target POSTAL_CODE_FIELD = Target.the("postal code field").locatedBy("#postal-code");

    public static Target CONTINUE_BUTTON = Target.the("continue button").locatedBy("#continue");

    public static Target FINISH_BUTTON = Target.the("finish button").locatedBy("#finish");

    public static Target COMPLETE_HEADER = Target.the("complete header").locatedBy(".complete-header");

}
