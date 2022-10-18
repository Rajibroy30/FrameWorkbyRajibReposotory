package com.NopCommerce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"Features/"}, //RegistrationAndLogin.feature","Features/Checkout.feature
		glue = {"com.NopCommerce.stepdef", "Com.NopCommerce.Hooks"},
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false,
		monochrome = true
			
		)
public class FeatureRunner extends AbstractTestNGCucumberTests {

	
	
}


