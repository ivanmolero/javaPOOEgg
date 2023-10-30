package test;

import org.testng.annotations.BeforeTest;
import screens.MainScreen;
import utils.Driver;

public class BaseTest {
    protected MainScreen mainScreen;
    @BeforeTest
    public void preTest() {
        this.mainScreen = new MainScreen(new Driver().getDriver());
    }
}
