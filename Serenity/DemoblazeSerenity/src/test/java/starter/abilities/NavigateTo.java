package starter.abilities;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.actions.DemoblazeHomePage;

public class NavigateTo {
    public static Performable demoblazeHomePage(){
        return Task.where("{0} opens My Store home page", Open.browserOn().the(DemoblazeHomePage.class));
    }
}
