package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/login.feature",
		glue = "stepdefination",
		tags = "@smoke",
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:target/cucumber-reports/reports1.html"}
		)


public class Run 

{

}
