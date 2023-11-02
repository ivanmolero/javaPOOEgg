package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class DragScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement titleTexView;

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getTextTitle() {
        this.waitToBeVisible(this.titleTexView);
        return this.titleTexView.getText();
    }
}
