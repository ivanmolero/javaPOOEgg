package test;

import pages.AviancaHome;

public class Test extends TestBase {
    @org.testng.annotations.Test
    public void AviancaTest() {
        this.aviancaHome.clickAcceptCookiesButton();
        this.aviancaHome.textToInputOrigen("CARTAGENA");
    }

}
