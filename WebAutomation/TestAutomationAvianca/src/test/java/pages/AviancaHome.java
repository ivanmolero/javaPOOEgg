package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AviancaHome extends BasePage {

    @FindBy(css = "#onetrust-accept-btn-handler")
    private WebElement buttonAcceptCookies;

    @FindBy(css = "input[placeholder=\"Origen\"]")
    private WebElement inputOrigen;

    @FindBy(css = "input[placeholder=\"Destino\"]")
    private WebElement inputDestino;

    @FindBy(css = "#searchButton")
    private WebElement buttonSearch;

    public AviancaHome(String url, WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void clickAcceptCookiesButton() {
        this.clickOnElement(this.buttonAcceptCookies);
    }

    public void textToInputOrigen(String text) {
        this.clickOnElement(this.inputOrigen);
        this.sendKeysOnElement(this.inputOrigen, text);
    }

    public void textToInputDestino(String text) {
        this.clickOnElement(this.inputOrigen);
        this.sendKeysOnElement(this.inputOrigen, text);
    }



}
