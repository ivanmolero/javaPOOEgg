package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaPage extends BasePage {
    @FindBy(id = "searchInput")
    private WebElement searchInput;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement searchButton;
    public WikipediaPage(WebDriver driver) {
        super(driver);
        this.driver.get("https://www.wikipedia.org");
    }

    public void sendKeysSearchInput(String keys) {
        this.sendKeysOnElement(this.searchInput, keys);
    }

    public CharacterWikipediaPage clickSearchButton() {
        this.clickOnElement(this.searchButton);
        return new CharacterWikipediaPage(this.driver);
    }
}
