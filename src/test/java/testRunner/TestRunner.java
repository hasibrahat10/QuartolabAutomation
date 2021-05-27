package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = {""},
        glue = "stepDefinitions",
        monochrome = true,
        strict = true,
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {
}
