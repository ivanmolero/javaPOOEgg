package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
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
        LoginPage loginPage = this.homePage.clickSignUpLogin();
        loginPage.visibleTitleSignUp();
        loginPage.fillInputName("nombre");
        loginPage.fillInputEmail("nombre@gmail.com");
        SignUpPage signUpPage = loginPage.clickSignUpButton();
        signUpPage.validateTitle();
        signUpPage.selectGenderRadio();
        signUpPage.fillPassword("password");
        signUpPage.fillDay("31");
        signUpPage.fillMonth("De");
    }

    @AfterTest
    public void postTest() {
//        this.homePage.close();
    }
}
