package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="./Features/FormFill.feature",
		glue="stepDefination",
		monochrome = true,
		dryRun=false,
		plugin = {"pretty","html:test-output/reports_html.html"}

		)


public class Run {

}
