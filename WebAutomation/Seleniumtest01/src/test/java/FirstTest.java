import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FirstTest {
    WebDriver driver = null;

    @Test
//    @Ignore
    public void wikiTest() {
        String driverPath = "/home/imolero/IdeaProjects/POO/WebAutomation/Seleniumtest01/src/utils/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);

        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.navigate().to("https://www.wikipedia.org");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("Microsoft");
        WebElement searchButton = driver.findElement(By.className("pure-button-primary-progressive"));
        searchButton.click();
        WebElement wikiPageTitle = driver.findElement(By.className("mw-page-title-main"));
        Assert.assertTrue(wikiPageTitle.isDisplayed() && wikiPageTitle.getText().equals("Microsoft"), "la prueba de comparación de datos no ha resultado");
        // capturar todos los links de la página
        List<WebElement> enlaces = driver.findElements(By.tagName("a"));
        for (WebElement elemento : enlaces) {
            System.out.println(elemento.getText());
        }
        //driver.close();
    }

//    @Test
//    public void ejercicio2Test01() {
//        String driverPath = "/home/imolero/IdeaProjects/POO/WebAutomation/Seleniumtest01/src/utils/chromedriver";
//        System.setProperty("webdriver.chrome.driver", driverPath);
//
//        this.driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.navigate().to("https://demoblaze.com/");
//
//
//        WebElement linkSignUp = driver.findElement(By.cssSelector("#signin2"));
//        linkSignUp.click();
//    }
}
