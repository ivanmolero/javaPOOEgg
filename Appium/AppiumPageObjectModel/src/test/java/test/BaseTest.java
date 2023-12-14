package test;

import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;
import screens.MainScreen;
import utils.Driver;

public class BaseTest {

    protected MainScreen mainScreen;
    protected SoftAssert softAssert;

    @BeforeTest
    public void preTest() {
        this.mainScreen = new MainScreen(new Driver().getDriver());
        this.softAssert = new SoftAssert();
    }
}
