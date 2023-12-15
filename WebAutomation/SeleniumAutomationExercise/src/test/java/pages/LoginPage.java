package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy(css = ".signup-form h2")
    private WebElement titleSignUp;

    @FindBy(css = "[data-qa=\"signup-name\"]")
    private WebElement inputName;

    @FindBy(css = "[data-qa=\"signup-email\"]")
    private WebElement inputEmail;

    @FindBy(css = "[data-qa=\"signup-button\"]")
    private WebElement buttonSignUp;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void visibleTitleSignUp() {
        this.softAssert.assertTrue(this.titleSignUp.isDisplayed());
    }

    public void fillInputName(String text) {
        this.textToElement(this.inputName, text);
    }

    public void fillInputEmail(String text) {
        this.textToElement(this.inputEmail, text);
    }

    public SignUpPage clickSignUpButton() {
        this.clickElement(this.buttonSignUp);
        return new SignUpPage(this.driver);
    }


}
