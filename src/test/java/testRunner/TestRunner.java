package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = {"@visual-docPublish"},
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:test-output"}
)
public class TestRunner {
}
