package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SwipeScreen;

public class SwipeScreenTest extends BaseTest{

    @Test
    public void swipeTest() {
        SwipeScreen swipeScreen = this.mainScreen.clickSwipeButton();
        swipeScreen.swipeLeftCarousel();
        Assert.assertEquals(swipeScreen.getSizeSecondDot(), 292);
        Assert.assertEquals(swipeScreen.getSizeFirstDot(), 784);
        swipeScreen.swipeRightCarousel();
        Assert.assertEquals(swipeScreen.getSizeFirstDot(), 292);
        Assert.assertEquals(swipeScreen.getSizeSecondDot(), 784);
    }
}
