package TestRunners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/Features.module2/Search.feature"
			,glue= {"stepDefinitions"},
			plugin= {
					"html:reporting/CucumberHTMLReports/Sanity"
			},
			tags= {"@smoke or @regression"}
)
public class Module2Runner {

}
