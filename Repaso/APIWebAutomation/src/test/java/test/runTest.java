package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/features/getSWCharacters.feature"},
        glue = {"test.StepDefinition"},
        plugin = {}
)
public class runTest extends AbstractTestNGCucumberTests {
}
