package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(className = "btn_inventory")
    private List<WebElement> addToCartButtons;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public Integer countProducts() {
        return this.addToCartButtons.size();
    }

}
