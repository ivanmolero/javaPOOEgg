package org.example;

import net.serenitybdd.annotations.Narrative;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.annotations.WithTags;
import net.serenitybdd.core.Serenity;
import org.junit.jupiter.api.Test;

@Narrative(text = {"This is a sample Serenity"})
@WithTags({@WithTag("sample")})
public class SerenityTest {
    @Steps
    SampleSteps sampleSteps = new SampleSteps();

    @Test
    public void verifySerenityBDDSetup() {
        sampleSteps.performSomeActions(5, 10);
//        Serenity.reportThat("texto", () -> sampleSteps.verifyResult(5, 10));
        sampleSteps.verifyResult(5, 10);
    }
}
