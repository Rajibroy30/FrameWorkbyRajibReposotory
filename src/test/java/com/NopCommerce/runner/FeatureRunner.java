package com.NopCommerce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features1/"},//RegistrationAndLogin1.feature","Features1/SCheckout1.feature","Features1/TNegativeLogin1.feature"},
		glue = {"com.NopCommerce.stepdef", "Com.NopCommerce.Hooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {

	
	
}


