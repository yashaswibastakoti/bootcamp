package Slack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/resources",
            glue = "Slack"
    )

public class TestRunner extends AbstractTestNGCucumberTests {
}


