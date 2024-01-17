package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResult extends UIInteractions {
    public String getResultTitle() {
        return $(".mw-page-title-main").getText();
    }

    public List<WebElement> getTagA() {
        System.out.println("inicio del método getTagA");
        return findAll(By.tagName("a")).map(webElementFacade -> webElementFacade.getElement());
//        findAll(By.tagName("a")).forEach(webElementFacade -> System.out.println(webElementFacade.getElement().getText()));
//        $$("a").forEach(webElementFacade -> System.out.println(webElementFacade.getElement().getText()));
    }
}
