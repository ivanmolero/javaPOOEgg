package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class FormsScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").instance(0)")
    private WebElement titleTextView;

    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }

    public String getTextTitle() {
        this.waitToBeVisible(this.titleTextView);
        return this.titleTextView.getText();
    }
}
