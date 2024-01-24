package myStore.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountPage {
    public static final Target LOGIN_STATUS = Target.the("My Login status")
            .located(By.xpath("//*[text()=' Logged in as ']"));

}
