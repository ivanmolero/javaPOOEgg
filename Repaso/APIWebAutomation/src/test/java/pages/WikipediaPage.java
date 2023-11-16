package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikipediaPage extends BasePage {
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;

    @FindBy(id = "searchLanguage")
    private WebElement searchLanguageButton;

    @FindBy(css = "option[value=\"en\"]")
    private WebElement englishOption;

    public WikipediaPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wikipedia.org");
    }

    public void sendKeysSearchInput(String keys) {
        this.sendKeysOnElement(this.searchInput, keys);
    }

    public SearchResultWikipediaPage clickSearchButton() {
        this.clickOnElement(this.searchButton);
        return new SearchResultWikipediaPage(this.driver);
    }

    public void changeLanguageToEnglish() {
//        this.searchLanguageButton = driver.findElement(By.cssSelector("#searchLanguage"));
        this.clickOnElement(this.searchLanguageButton);
        this.clickOnElement(this.englishOption);
    }

}
