package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = {"./src/test/resources/features/Login.feature"},
   glue = {"stepdefinitions", "AppHooks"},
   plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/"},
  // tags ="@smoke",
   dryRun = false,
   monochrome = true

)

public class MyTestRunner {

}
