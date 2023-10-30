package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class MainScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    private WebElement loginButton;

    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    public LoginScreen clickLoginButton() {
        this.clickOnElement(this.loginButton);
        return new LoginScreen(this.driver);
    }
}
