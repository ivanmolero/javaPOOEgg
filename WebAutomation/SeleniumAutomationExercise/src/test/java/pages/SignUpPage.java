package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class SignUpPage extends BasePage{

    private int randomIndex;
    @FindBy(css = ".title:first-child")
    private WebElement titleH2;

    @FindBy(css = "#password")
    private WebElement inputPassword;

    @FindBy(css = ".radio")
    private List<WebElement> genderRadios;

    @FindBy(css = "#days")
    private WebElement selectDays;

    @FindBy(css = "#months")
    private WebElement selectMonths;

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void validateTitle() {
        this.softAssert.assertTrue(this.titleH2.isDisplayed());
        this.softAssert.assertEquals(this.titleH2.getText(), "Enter Account Information");
    }

    public void selectGenderRadio() {
        Random random = new Random();
        randomIndex = random.nextInt(2);
        this.clickElement(this.genderRadios.get(randomIndex));
    }

    public void fillPassword(String text) {
        this.waitVisible(this.inputPassword);
        this.textToElement(this.inputPassword, text);
    }

    public void fillDay(String day) {
        this.textToElement(this.selectDays, day);
    }

    public void fillMonth(String month) {
        this.textToElement(this.selectMonths, month);
    }
}
