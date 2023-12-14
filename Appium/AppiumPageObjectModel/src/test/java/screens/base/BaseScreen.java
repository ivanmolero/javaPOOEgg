package screens.base;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BaseScreen(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public void waitToBeClickable(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitToBeVisible(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickOnElement(WebElement element) {
        this.waitToBeClickable(element);
        element.click();
    }

    public void sendKeysOnElement(WebElement element, String keys) {
        this.waitToBeVisible(element);
        element.sendKeys(keys);
    }

    public String getTextFromElement(WebElement element) {
        this.waitToBeVisible(element);
        return element.getText();
    }

    public void swipeElement(String id, String direction, Double percent, Integer speed) {
        ((JavascriptExecutor) this.driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId", id,
                "direction", direction,
                "percent", percent,
                "speed", speed
        ));
    }
}
