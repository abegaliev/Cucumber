package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber-report", "json:target/cucumber.json"

		},

		features = "./src/test/resources/features/", glue = "stepDefinitions"
)

public class CucesRunner extends AbstractTestNGCucumberTests {


}
