package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private MenuBar menuBar;
    public HomePage(WebDriver driver) {
        super(driver);
        this.driver.navigate().to(this.url);
        this.menuBar = new MenuBar(this.driver);
    }

    public void homeVisible() {
        this.softAssert.assertTrue(this.menuBar.getHome().isDisplayed());
    }

    public LoginPage clickSignUpLogin() {
        this.menuBar.clickSignUpLogin();
        return new LoginPage(this.driver);
    }
}
