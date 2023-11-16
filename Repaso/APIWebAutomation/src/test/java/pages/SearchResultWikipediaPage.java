package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultWikipediaPage extends BasePage {

    @FindBy(css = "#firstHeading span")
    private WebElement titlePage;

    @FindBy(id = "vector-toc")
    private WebElement vectorTOC;

    @FindBy(css = "li[id=\"ca-edit\"] a")
    private WebElement editButton;

    @FindBy(css = "li[id=\"ca-history\"] a")
    private WebElement historyButton;

    public SearchResultWikipediaPage(WebDriver driver) {
        super(driver);
    }

    public String getTitlePageText() {
        return this.getTextFromElement(this.titlePage);
    }

    public Boolean isVisibleVectorTOC() {
        return this.vectorTOC.isDisplayed();
    }

    public EditWikipediaPage clickEditButton() {
        this.clickOnElement(this.editButton);
        return new EditWikipediaPage(this.driver);
    }

    public HistoryWikipediaPage clickHistoryButton() {
        this.clickOnElement(this.historyButton);
        return new HistoryWikipediaPage(this.driver);
    }
}
