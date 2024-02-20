package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "src\\test\\resources\\FeatureFiles\\login.feature",
	glue = "execution",
	plugin = "pretty",
	publish=true
)
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
