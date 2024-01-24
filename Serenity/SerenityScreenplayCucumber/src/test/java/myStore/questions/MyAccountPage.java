package myStore.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MyAccountPage {

    public static Question<String> LoginStatus(){
        return actor -> Text.of(myStore.ui.MyAccountPage.LOGIN_STATUS).answeredBy(actor);
    }
}
