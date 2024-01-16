package org.example;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import org.assertj.core.api.SoftAssertions;

public class SampleSteps {
    private int total;
    private SoftAssertions softAssertion = new SoftAssertions();

    @Step
    public void performSomeActions(int a, int b) {
        this.total = a + b;
    }

    @Step
    public void verifyResult(int a, int b) {
        Serenity.reportThat("mensaje", () -> softAssertion.assertThat(this.total).as("validando la suma ", a + b));
//        softAssertion.assertThat(this.total).as("validando la suma ", a + b);
//        softAssertion.assertAll();
    }
}
