package com.NopCommerce.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			features = {"Features/"},
			glue = {"com.NopCommerce.stepdef"},
			plugin = {"pretty","json:target/cucumber.json"},
			dryRun = false,
			monochrome = true
				
			)
	public class FeatureRunner extends AbstractTestNGCucumberTests {

		
		
	}


