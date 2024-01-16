package starter.wikipedia;

import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    public void toTheWikipediaPage() {
        openUrl("https://wikipedia.org/");
    }
}
