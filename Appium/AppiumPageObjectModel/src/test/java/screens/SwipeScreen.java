package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import screens.base.BaseScreen;

public class SwipeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement titleTexView;

//    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.HorizontalScrollView\")")
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Carousel\")")
    private RemoteWebElement areaHorizontalScrollView;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(18)")
    private WebElement firstDotCarousel;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(19)")
    private WebElement secondDotCarousel;

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getTextTitle() {
        this.waitToBeVisible(this.titleTexView);
        return this.titleTexView.getText();
    }

    public void swipeLeftCarousel() {
        this.swipeElement(this.areaHorizontalScrollView.getId(), "left", 0.3, 800);
    }

    public void swipeRightCarousel() {
        this.swipeElement(this.areaHorizontalScrollView.getId(), "right", 0.3, 800);
    }

    public Integer getSizeFirstDot() {
        return this.firstDotCarousel.getSize().getHeight();
    }

    public Integer getSizeSecondDot() {
        return this.secondDotCarousel.getSize().getHeight();
    }
}
