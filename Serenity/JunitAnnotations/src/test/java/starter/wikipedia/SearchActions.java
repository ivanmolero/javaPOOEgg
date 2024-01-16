package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class SearchActions extends UIInteractions {
    public void byKeyword(String keyword) {
        $("#searchInput").sendKeys(keyword, Keys.ENTER);
    }

    public void clickSearchButton() {
        $("button[type=\"submit\"]").click();
    }
}
