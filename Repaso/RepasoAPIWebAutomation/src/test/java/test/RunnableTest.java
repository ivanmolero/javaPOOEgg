package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = {"src/test/resources/features/ejercicio.feature"},
        glue = {"test"},
        plugin = {}
)
public class RunnableTest extends AbstractTestNGCucumberTests {
}
