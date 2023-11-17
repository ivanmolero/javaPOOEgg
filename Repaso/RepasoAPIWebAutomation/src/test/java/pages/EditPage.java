package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditPage extends BasePage{

    @FindBy(css = "#firstHeading")
    private WebElement pageTitle;

    public EditPage(WebDriver driver) {
        super(driver);
    }

    public String getTextPageTitle() {
        return this.getTextFromElement(this.pageTitle);
    }
}
