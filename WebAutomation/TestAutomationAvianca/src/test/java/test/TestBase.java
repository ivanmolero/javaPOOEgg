package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.AviancaHome;
import utils.TestDriver;

public class TestBase {
    protected AviancaHome aviancaHome;
    @BeforeTest
    public void preTest() {
        aviancaHome = new AviancaHome("https://avianca.com/es", new TestDriver().getDriver());
    }
}
