package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
        PageFactory.initElements(this.driver, this);
    }

    protected void waitToBeClickable(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    protected void waitToBeVisible(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void clickOnElement(WebElement element) {
        this.waitToBeClickable(element);
        element.click();
    }

    protected void sendKeysOnElement(WebElement element, String keys) {
        this.waitToBeVisible(element);
        element.sendKeys(keys);
    }

    protected String getTextFromElement(WebElement element) {
        this.waitToBeVisible(element);
        return element.getText();
    }

    protected WebElement searchWebElementText(List<WebElement> elements, String text) {
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(text)) return element;
        }
        return null;
    }

    public void close() {
        this.driver.close();
    }
}
