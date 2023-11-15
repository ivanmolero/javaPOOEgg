package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CharacterWikipediaPage extends BasePage {

    @FindBy(css = "#firstHeading span")
    private WebElement titlePage;

    @FindBy(id = "vector-toc")
    private WebElement vectorTOC;

    public CharacterWikipediaPage(WebDriver driver) {
        super(driver);
    }

    public String getTitlePageText() {
        return this.getTextFromElement(this.titlePage);
    }

    public Boolean isVisibleVectorTOC() {
        return this.vectorTOC.isDisplayed();
    }
}
