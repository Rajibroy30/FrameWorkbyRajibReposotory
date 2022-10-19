package com.NopCommerce.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.NopCommerce.Basepage.BaseProjectClass;
import Com.NopCommerce.PageFactory.WebElement;
import Com.NopCommerce.Utils.NopComerceUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterLoginStepDefinition extends BaseProjectClass{
	
	WebElement pf =PageFactory.initElements(driver, WebElement.class) ;
	//PageFactory.initElements(driver, WebElement.class)
@Given("Users open the browser")
public void users_open_the_browser() throws InterruptedException, IOException {
    
		BaseProjectClass.BrowserLaunch();
}

@Given("Users Navigate to {string}")
public void users_navigate_to(String string) {
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().deleteAllCookies();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}

@When("Users click on the register button")
public void users_click_on_the_register_button() {
	driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
}

@When("Users select the Gender")
public void users_select_the_gender() {
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();	
}

@When("Users enter the Name")
public void users_enter_the_name() {
    
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lasttname);
}

@When("Users enter Date of birth")
public void users_enter_date_of_birth() {
    

	Select Date = new Select(driver.findElement(By.name("DateOfBirthDay")));
	Date.selectByVisibleText("20");
	
	Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
	Month.selectByVisibleText("July");
	
	Select Year = new Select (driver.findElement(By.name("DateOfBirthYear")));
	Year.selectByVisibleText("1993");
}

@When("Users enter Valid Email")
public void users_enter_valid_email() {
	driver.findElement(By.id("Email")).sendKeys(email)
;
   
}

@When("Users enter Company Name")
public void users_enter_company_name() {
    
	driver.findElement(By.id("Company")).sendKeys("Smart Tech");
}

@When("Users enter Password and Confirm Password")
public void users_enter_password_and_confirm_password() {
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
   
}

@When("Users click on Register Button")
public void users_click_on_register_button() {
    
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); // Registration
}

@Then("Users Finishes registration")
public void users_finishes_registration() throws InterruptedException {
    
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']")).sendKeys(Keys.ENTER);

}




@Given("Users displayed successfully register message and Logs out")
public void users_displayed_successfully_register_message_and_logs_out() {
    
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
}

@When("User clicks the Login button")
public void user_clicks_the_login_button() {
	
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
}

@When("Enters the Email and Password")
public void enters_the_email_and_password() throws IOException {
	
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);
	NopComerceUtilities.getHighLighter(driver.findElement(By.id("Email")));
	NopComerceUtilities.getHighLighter(driver.findElement(By.id("Password")));
	NopComerceUtilities.takeScreenShot();
}

@Then("Users Logs in and navigates to home page")
public void users_logs_in_and_navigates_to_home_page() {
    
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();// login
}

}