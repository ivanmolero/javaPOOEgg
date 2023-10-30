package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screens.baseScreen.BaseScreen;

public class LoginScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\").index(0)")
    private WebElement loginSelector;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Sign up\")")
    private WebElement signUpSelector;

//    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;

//    @AndroidFindBy(accessibility = "input-password")
    private WebElement inputPassword;

    private WebElement inputConfirmPassword;

    private WebElement buttonSignUp;

    private WebElement buttonOkSignUp;


    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }

    public void selectLogin() {
        this.clickOnElement(this.loginSelector);
    }

    public void selectSignUp() {
        this.clickOnElement(this.signUpSelector);
    }

    public void writeEmail(String email) {
        this.inputEmail = this.driver.findElement(AppiumBy.accessibilityId("input-email"));
        this.sendKeysOnElement(this.inputEmail, email);
    }

    public void writePassword(String password) {
        this.inputPassword = this.driver.findElement(AppiumBy.accessibilityId("input-password"));
        this.sendKeysOnElement(this.inputPassword, password);
    }

    public void writeConfirmPassword(String password) {
        this.inputConfirmPassword = this.driver.findElement(AppiumBy.accessibilityId("input-repeat-password"));
        this.sendKeysOnElement(this.inputConfirmPassword, password);
    }

    public void clickSignUp() {
        this.buttonSignUp = this.driver.findElement(
                AppiumBy.androidUIAutomator("new UiSelector().text(\"SIGN UP\")")
        );
        this.clickOnElement(this.buttonSignUp);
    }

    public void clickOKSignUp() {
        this.buttonOkSignUp = this.wait.until(
                ExpectedConditions.visibilityOf(
                        this.driver.findElement(
                                AppiumBy.id("android:id/button1")
                        )
                )
        );
        this.clickOnElement(this.buttonOkSignUp);
    }
}
