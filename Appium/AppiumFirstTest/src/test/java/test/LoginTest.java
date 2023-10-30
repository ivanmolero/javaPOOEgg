package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.LoginScreen;
import screens.MainScreen;
import utils.Driver;

public class LoginTest {

    private MainScreen mainScreen;
    @BeforeTest
    public void preTest() {
        this.mainScreen = new MainScreen(new Driver().getDriver());
    }

    @Test
    public void loginTest() {
        this.mainScreen.clickLoginElement();
    }

    @Test
    public void signUpTest() {
        LoginScreen loginScreen = this.mainScreen.clickLoginElement();
        loginScreen.selectSignUp();
        loginScreen.writeEmail("correoejemplo@gmail.com");
        loginScreen.writePassword("123456789A");
        loginScreen.writeConfirmPassword("123456789A");
        loginScreen.clickSignUp();
        loginScreen.clickOKSignUp();
    }

}
