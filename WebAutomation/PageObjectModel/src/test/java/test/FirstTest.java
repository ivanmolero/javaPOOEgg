package test;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class FirstTest extends BaseTest {
    @Test
    public void login() {
        LoginPage loginPage = getLoginPage();
        this.softAssert.assertEquals("Swag Labs", loginPage.getTitleText());
        loginPage.setUserName("standard_user");
        loginPage.setPassword("secret_sauce");
        ProductsPage productsPage = loginPage.clickSubmit();
        this.softAssert.assertEquals((Integer) 6, productsPage.countProducts());
    }
}
