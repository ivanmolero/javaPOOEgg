package test;

import org.testng.annotations.Test;
import screens.LoginScreen;

public class LoginScreenTest extends BaseTest{

    LoginScreen loginScreen;

    @Test
    public void LoginTest() {
        this.loginScreen = this.mainScreen.clickLoginButton();
        this.loginScreen.sendKeysInputEmail("abc@abc.com");
        this.loginScreen.sendKeysInputPassword("12345678");
        this.loginScreen.clickLoginButton();
    }
}
