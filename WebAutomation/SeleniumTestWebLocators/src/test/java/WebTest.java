import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.regex.Pattern;

public class WebTest {

    WebDriver driver = null;

    @BeforeTest
    public void preTests() {
        String driverPath = "/home/imolero/IdeaProjects/POO/WebAutomation/SeleniumTestWebLocators/src/utils/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://demoblaze.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void postTests() {
        //driver.close();
    }

    @Test
    public void signUp() {
        WebElement linkSignUp = driver.findElement(By.cssSelector("#signin2"));
        linkSignUp.click();

        WebElement inputUsername = driver.findElement(By.cssSelector("#sign-username"));
        inputUsername.sendKeys("CarloMagnoGarciaFilo");

        WebElement inputPassword = driver.findElement(By.cssSelector("#sign-password"));
        inputPassword.sendKeys("123456");

        WebElement buttonSignUp = driver.findElement(By.cssSelector("#signInModal .btn-primary"));
        buttonSignUp.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

    }

    @Test
    public void aboutUs() {
        WebElement linkAboutUs = driver.findElement(By.cssSelector("ul li:nth-child(3) a"));
        linkAboutUs.click();

        WebElement divPoster = driver.findElement(By.cssSelector(".vjs-poster"));
        divPoster.click();

    }

    @Test
    public void buyProcess() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        WebElement linkLaptops = driver.findElement(By.cssSelector(".list-group a:nth-child(3)"));
        linkLaptops.click();

        wait.until(ExpectedConditions.textMatches(By.cssSelector(".col-lg-4:nth-child(1) .card-title a"), Pattern.compile("Sony")));

        WebElement linkFirstEquipment = driver.findElement(By.cssSelector(".col-lg-4:nth-child(1) .card-title a"));
        linkFirstEquipment.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn-success")));

        WebElement buttonAddToCart = driver.findElement(By.cssSelector(".btn-success"));
        buttonAddToCart.click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();

        WebElement linkcart = driver.findElement(By.cssSelector("ul li:nth-child(4) a"));
        linkcart.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("td:nth-child(2)")));

        WebElement buttonPlaceOrder = driver.findElement(By.cssSelector(".btn-success"));
        buttonPlaceOrder.click();

        WebElement inputName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        inputName.sendKeys("Juan");

        WebElement inputCountry = driver.findElement(By.cssSelector("#country"));
        inputCountry.sendKeys("Perú");

        WebElement inputCity = driver.findElement(By.cssSelector("#city"));
        inputCity.sendKeys("Cusco");

        WebElement inputCard = driver.findElement(By.cssSelector("#card"));
        inputCard.sendKeys("123456");

        WebElement inputMonth = driver.findElement(By.cssSelector("#month"));
        inputMonth.sendKeys("october");

        WebElement inputYear = driver.findElement(By.cssSelector("#year"));
        inputYear.sendKeys("2023");


    }
}
