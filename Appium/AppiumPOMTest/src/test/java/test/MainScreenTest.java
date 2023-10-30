package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MainScreen;
import utils.Driver;

public class MainScreenTest extends BaseTest{
    @Test
    public void loginScreenTest() {
        this.mainScreen.clickLoginButton();
    }
}
