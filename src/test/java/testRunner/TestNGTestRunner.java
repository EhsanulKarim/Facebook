package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {
	
	@CucumberOptions(
	       
	        features = "Features",
	        glue ="stepdefs"
	       )
	        

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
