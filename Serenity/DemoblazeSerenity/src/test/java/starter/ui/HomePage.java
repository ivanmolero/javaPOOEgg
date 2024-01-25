package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target CAROUSEL_ACTIVE_ELEMENT = Target.the("active element in the carousel")
            .locatedBy(".active img");
    public static Target CAROUSEL_FIRST_ACTIVE_ELEMENT = Target.the("active element in the carousel")
            .locatedBy(".active img[alt=\"First slide\"]");
    public static Target CAROUSEL_SECOND_ACTIVE_ELEMENT = Target.the("active element in the carousel")
            .locatedBy(".active img[alt=\"Second slide\"]");
    public static Target CAROUSEL_THIRD_ACTIVE_ELEMENT = Target.the("active element in the carousel")
            .locatedBy(".active img[alt=\"Third slide\"]");
}
