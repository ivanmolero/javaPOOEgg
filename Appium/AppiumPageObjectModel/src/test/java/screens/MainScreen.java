package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import screens.base.BaseScreen;

public class MainScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login\")")
    private WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Webview\")")
    private WebElement webviewButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Forms\")")
    private WebElement formsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Swipe\")")
    private WebElement swipeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drag\")")
    private WebElement dragButton;


    public MainScreen(AndroidDriver driver) {
        super(driver);
    }

    public LoginScreen clickLoginButton() {
        this.clickOnElement(this.loginButton);
        return new LoginScreen(this.driver);
    }

    public WebviewScreen clickWebviewButton() {
        this.clickOnElement(this.webviewButton);
        return new WebviewScreen(this.driver);
    }

    public FormsScreen clickFormsButton() {
        this.clickOnElement(this.formsButton);
        return new FormsScreen(this.driver);
    }

    public SwipeScreen clickSwipeButton() {
        this.clickOnElement(this.swipeButton);
        return new SwipeScreen(this.driver);
    }

    public DragScreen clickDragButton() {
        this.clickOnElement(this.dragButton);
        return new DragScreen(this.driver);
    }
}
