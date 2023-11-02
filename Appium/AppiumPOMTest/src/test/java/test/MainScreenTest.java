package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MainScreen;
import utils.Driver;

public class MainScreenTest extends BaseTest{
    @Test
    public void loginScreenTest() {
        LoginScreen loginScreen = this.mainScreen.clickLoginButton();
        Assert.assertEquals("Login / Sign up Form", loginScreen.getTitle());
    }
}
