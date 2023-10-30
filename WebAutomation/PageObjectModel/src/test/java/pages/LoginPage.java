package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name")
    private WebElement inputUserName;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(className = "submit-button")
    private WebElement buttonSubmit;

    @FindBy(className = "login_logo")
    private WebElement title;

    public LoginPage(WebDriver driver, String url) {
        super(driver);
        this.driver.get(url);
    }

    public void setUserName(String text) {
        this.inputUserName.sendKeys(text);
    }

    public void setPassword(String text) {
        this.inputPassword.sendKeys(text);
    }

    public String getTitleText() {
        this.isElementDisplayed(this.title);
        return this.title.getText();
    }

    public ProductsPage clickSubmit() {
        this.buttonSubmit.click();
        return new ProductsPage(this.driver);
    }
}
