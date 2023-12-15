package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String url;
    protected SoftAssert softAssert;

    public BasePage(WebDriver driver) {
        this.url = "https://automationexercise.com/";
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.softAssert = new SoftAssert();
    }

    public void waitVisible(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
//        try {
//            this.wait.until(ExpectedConditions.visibilityOf(element));
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
    }

    public void waitClickable(WebElement element) {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void textToElement(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void close() {
        this.driver.close();
    }
}
