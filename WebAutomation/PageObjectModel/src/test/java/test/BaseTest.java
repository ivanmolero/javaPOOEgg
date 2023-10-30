package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver driver = null;

    protected SoftAssert softAssert;
    @BeforeTest
    public void preTest() {
        String driverPath = "/home/imolero/IdeaProjects/POO/WebAutomation/PageObjectModel/src/utils/chromedriver";
        System.setProperty("webDriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        this.softAssert = new SoftAssert();
    }

    @AfterTest
    public void postTest() {
        //this.driver.close();
    }

    protected LoginPage getLoginPage() {
        return new LoginPage(driver, "https://www.saucedemo.com/");
    }
}
