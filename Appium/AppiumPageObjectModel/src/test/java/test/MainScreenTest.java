package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.*;
import utils.Driver;

public class MainScreenTest extends BaseTest{

    @Test
    public void webViewScreenTest() {

    }
    @Test
    public void loginScreenTest() {
        LoginScreen loginScreen = this.mainScreen.clickLoginButton();
        Assert.assertEquals(loginScreen.getTextTitle(), "Login / Sign up Form");
    }

    @Test
    public void webviewScreenTest() {
        WebviewScreen webviewScreen = this.mainScreen.clickWebviewButton();
        Assert.assertTrue(webviewScreen.isIoImageDisplayed());
    }

    @Test
    public void formsScreenTest() {
        FormsScreen formsScreen = this.mainScreen.clickFormsButton();
        Assert.assertEquals(formsScreen.getTextTitle(), "Form components");
    }

    @Test
    public void swipeScreenTest() {
        SwipeScreen swipeScreen = this.mainScreen.clickSwipeButton();
        Assert.assertEquals(swipeScreen.getTextTitle(), "Swipe horizontal");
    }

    @Test
    public void dragScreenTest() {
        DragScreen dragScreen = this.mainScreen.clickDragButton();
        Assert.assertEquals(dragScreen.getTextTitle(), "Drag and Drop");
    }

}
