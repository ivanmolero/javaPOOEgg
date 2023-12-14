package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriver {
    private WebDriver driver;

    public LocalDriver() {
//        System.setProperty("webdriver.gecko.driver", "C:/Program Files/Mozilla Firefox/geckodriver-v0.8.0-win32/geckodriver.exe");
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
