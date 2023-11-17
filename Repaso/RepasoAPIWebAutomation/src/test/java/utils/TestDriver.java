package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDriver {
    WebDriver driver;

    public TestDriver() {
        String path = "/home/imolero/drivers/chromedriver/chromedriver";
        System.setProperty("webDriver.chrome.driver", path);
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
