package com.NopCommerce.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.Basepage.BaseProjectClass;
import Com.NopCommerce.PageFactory.NopCommerceWebElement;
import Com.NopCommerce.Utils.NopComerceUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginStepDefinition extends BaseProjectClass{
	NopCommerceWebElement pf = PageFactory.initElements(driver, NopCommerceWebElement.class);
	
	
	@Given("I open the browser and I navigate to the application")
	public void i_open_the_browser_and_i_navigate_to_the_application() throws InterruptedException, IOException {
		BaseProjectClass.BrowserLaunch();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("I click on the sign in button on homepage")
	public void i_click_on_the_sign_in_button_on_homepage() {
	    

		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String email, String password) {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		NopComerceUtilities.getHighLighter(driver.findElement(By.id("Email")));
		NopComerceUtilities.getHighLighter(driver.findElement(By.id("Password")));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();// login
	}

	@Then("I am suppose to get an error message")
	public void i_am_suppose_to_get_an_error_message() throws IOException {
		
		NopComerceUtilities.takeScreenShot();
	    driver.quit();
	}

}
