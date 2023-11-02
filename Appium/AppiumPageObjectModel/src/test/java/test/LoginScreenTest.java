package test;

import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginScreenTest extends BaseTest{

    @Test
    public void loginTest() {
        LoginScreen loginScreen = this.mainScreen.clickLoginButton();
        loginScreen.sendKeysInputEmail("abc@abc.com");
        loginScreen.sendKeysInputPassword("12345678");
        loginScreen.clickLoginButton();
        loginScreen.clickOkButton();
    }
 }
