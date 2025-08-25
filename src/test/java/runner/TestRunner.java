package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features", // path to .feature files
        glue = {"StepDefs","Hooks"},      // package for step definitions
        tags = "@Smoke",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        monochrome = true
)
public class TestRunner {
    // no need to add methods
}