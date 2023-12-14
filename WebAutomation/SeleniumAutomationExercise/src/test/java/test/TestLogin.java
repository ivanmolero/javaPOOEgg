package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.LocalDriver;

public class TestLogin {
    private HomePage homePage;

    @BeforeTest
    public void pretest() {
        LocalDriver driver = new LocalDriver();
        this.homePage = new HomePage(driver.getDriver());
    }

    @Test
    public void registerUser() {
        this.homePage.homeVisible();
    }
}
