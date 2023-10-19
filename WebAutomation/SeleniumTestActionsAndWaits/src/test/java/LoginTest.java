import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

public class LoginTest {

    WebDriver driver = null;

    @BeforeTest
    public void preTest() {
        String driverPath = "/home/imolero/IdeaProjects/POO/WebAutomation/SeleniumTestActionsAndWaits/src/utils/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait

        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/");


    }

    @Test
    public void loginImplicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit wait
        WebElement inputName = driver.findElement(By.cssSelector("#user-name"));
        inputName.sendKeys("standard_user");
        WebElement inputPassword = driver.findElement(By.cssSelector("#password"));
        inputPassword.sendKeys("secret_sauce");
        WebElement buttonLogin = driver.findElement(By.cssSelector("#login-button"));
        buttonLogin.click();
    }

    @Test
    public void loginExplicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement inputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#user-name")));
        inputName.sendKeys("standard_user");
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
        inputPassword.sendKeys("secret_sauce");
        WebElement buttonLogin = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-button")));
        buttonLogin.click();
    }

    @Test
    public void loginFluentWait() {
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        WebElement inputName = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#user-name")));
        inputName.sendKeys("standard_user");
        WebElement inputPassword = (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));
        inputPassword.sendKeys("secret_sauce");
        WebElement buttonLogin = (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#login-button")));
        buttonLogin.click();
    }

    @Test
    public void addToCart() {
        this.loginFluentWait();
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn_inventory")));
        List<WebElement> botones = driver.findElements(By.cssSelector(".btn_inventory"));
        botones.get(2).click();
        botones.get(5).click();
    }
}
