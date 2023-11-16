package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditWikipediaPage extends BasePage{

    @FindBy(css = "#firstHeading")
    private WebElement titlePage;

    @FindBy(css = "div[role=\"dialog\"] a[role=\"button\"]")
    private WebElement startEditingButton;

    public EditWikipediaPage(WebDriver driver) {
        super(driver);
    }

    public void clickStartEditingButton() {
//        this.startEditingButton = driver.findElement(By.cssSelector("div[role=\"dialog\"] a[role=\"button\"]"));
//        this.clickOnElement(this.startEditingButton);
    }

    public String getTitleEdit() {
        return this.getTextFromElement(this.titlePage);
    }
}
