package myStore.abilities;

import myStore.actions.MyStoreHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable myStoreHomePage(){
        return Task.where("{0} opens My Store home page", Open.browserOn().the(MyStoreHomePage.class));
    }
}
