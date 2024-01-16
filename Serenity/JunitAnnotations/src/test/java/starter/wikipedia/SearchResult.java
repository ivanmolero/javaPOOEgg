package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;

public class SearchResult extends UIInteractions {
    public String getResultTitle() {
        return $(".mw-page-title-main").getText();
    }
}
