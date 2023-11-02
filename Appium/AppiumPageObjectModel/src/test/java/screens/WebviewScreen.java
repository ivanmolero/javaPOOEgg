package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class WebviewScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"WebdriverIO\").instance(0)")
    private WebElement ioImage;

    public WebviewScreen(AndroidDriver driver) {
        super(driver);
    }

    public Boolean isIoImageDisplayed() {
        this.waitToBeVisible(this.ioImage);
        return this.ioImage.isDisplayed();
    }
}
