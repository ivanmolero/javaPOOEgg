package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(css = "#ca-edit")
    private WebElement editLink;

    @FindBy(css = "#ca-history")
    private WebElement historyLink;

    @FindBy(css = "#firstHeading")
    private WebElement pageTitle;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public EditPage clickEditLink() {
        this.clickOnElement(this.editLink);
        return new EditPage(this.driver);
    }

    public HistoryPage clickHistoryLink() {
        this.clickOnElement(this.historyLink);
        return new HistoryPage(this.driver);
    }

    public String getTextPageTitle() {
        return this.getTextFromElement(this.pageTitle);
    }
}
