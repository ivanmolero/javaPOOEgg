package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.baseScreen.BaseScreen;

public class MainScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Login\"]")
    private WebElement loginElement;

    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    public LoginScreen clickLoginElement() {
        this.clickOnElement(this.loginElement);
        return new LoginScreen(this.driver);
    }
}
