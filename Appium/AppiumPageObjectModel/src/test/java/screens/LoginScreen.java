package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement titleTextView;

    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"LOGIN\")")
    private WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OK\")")
    private WebElement okButton;

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getTextTitle() {
        return this.getTextFromElement(this.titleTextView);
    }

    public void sendKeysInputEmail(String keys) {
        this.sendKeysOnElement(this.inputEmail, keys);
    }

    public void sendKeysInputPassword(String keys) {
        this.sendKeysOnElement(this.inputPassword, keys);
    }

    public void clickLoginButton() {
        this.clickOnElement(this.loginButton);
    }

    public void clickOkButton() {
        this.clickOnElement(this.okButton);
    }
}
