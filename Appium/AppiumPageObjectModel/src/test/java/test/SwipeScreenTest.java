package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SwipeScreen;

public class SwipeScreenTest extends BaseTest{

    @Test
    public void swipeTest() {
        SwipeScreen swipeScreen = this.mainScreen.clickSwipeButton();
        swipeScreen.swipeLeftCarousel();
        this.softAssert.assertFalse(swipeScreen.visibilityFirstCard());
        this.softAssert.assertTrue(swipeScreen.visibilitySecondCard());
        swipeScreen.swipeRightCarousel();
        this.softAssert.assertTrue(swipeScreen.visibilityFirstCard());
        this.softAssert.assertFalse(swipeScreen.visibilitySecondCard());
    }
}
