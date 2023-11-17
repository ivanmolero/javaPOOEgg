package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaPage extends BasePage{

    @FindBy(css = "#searchInput")
    private WebElement searchInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;

    @FindBy(css = "#searchLanguage")
    private WebElement searchLanguageButton;

    @FindBy(css = "option[value=\"en\"]")
    private WebElement optionEn;

    public WikipediaPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wikipedia.org");
    }

    public void searchValueWikipediaPage(String value) {
        this.sendKeysOnElement(this.searchInput, value);
    }

    public SearchResultPage clickSearchButton() {
        this.clickOnElement(this.searchButton);
        return new SearchResultPage(this.driver);
    }

    public void clickSearchLanguageButton() {
        this.clickOnElement(this.searchLanguageButton);
    }

    public void clickOptionEn() {
        this.clickOnElement(this.optionEn);
    }
}
