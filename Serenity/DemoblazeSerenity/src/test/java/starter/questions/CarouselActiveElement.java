package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import starter.ui.HomePage;

public class CarouselActiveElement {

    public static Question<String> carouselFirstActiveElement() {
        return actor -> Attribute.of(HomePage.CAROUSEL_FIRST_ACTIVE_ELEMENT).named("alt").answeredBy(actor);
    }

    public static Question<String> carouselSecondActiveElement() {
        return actor -> Attribute.of(HomePage.CAROUSEL_SECOND_ACTIVE_ELEMENT).named("alt").answeredBy(actor);
    }

    public static Question<String> carouselThirdActiveElement() {
        return actor -> Attribute.of(HomePage.CAROUSEL_THIRD_ACTIVE_ELEMENT).named("alt").answeredBy(actor);
    }

}
