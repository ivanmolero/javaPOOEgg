package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HistoryWikipediaPage extends BasePage{

    @FindBy(css = "#firstHeading")
    private WebElement titlePage;

    public HistoryWikipediaPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleHistory() {
        return this.getTextFromElement(this.titlePage);
    }
}
