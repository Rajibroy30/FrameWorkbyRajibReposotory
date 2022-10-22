package com.NopCommerce.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.Basepage.BaseProjectClass;
import Com.NopCommerce.PageFactory.NopCommerceWebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SCheckoutStepDefinition extends BaseProjectClass{
	
	NopCommerceWebElement pf = PageFactory.initElements(driver, NopCommerceWebElement.class);
	@Given("Users navigates to home page")
	public void users_navigates_to_home_page() {
		driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
	    
	}
	@When("User Selects the Computers Tab")
	public void user_selects_the_computers_tab() {
	    
		driver.findElement(By.xpath("//a[@href='/computers']")).click();
		//Thread.sleep(1000);
	}
	
	@When("User clicks the desktop icon")
	public void user_clicks_the_desktop_icon() {
		driver.findElement(By.xpath("//a[@title='Show products in category Desktops']")).click();
	    
	}
	@When("The User selects the item to add to cart")
	public void the_user_selects_the_item_to_add_to_cart() {
		driver.findElement(By.xpath("//a[@href='/build-your-own-computer']")).click();
	    
	}
	@When("User selects the option of the item")
	public void user_selects_the_option_of_the_item() {
	    
		driver.findElement(By.xpath("//*[@id='product_attribute_2']")).click();
		driver.findElement(By.xpath("//*[@id='product_attribute_2\']/option[4]")).click();
		driver.findElement(By.xpath("//*[@id='product_attribute_3_7']")).click();
		driver.findElement(By.xpath("//*[@id='product_attribute_4_9']")).click();
	}
	@Then("User clicks the add to cart button")
	public void user_clicks_the_add_to_cart_button() {
	    
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	@Then("The User views the item added onto the cart")
	public void the_user_views_the_item_added_onto_the_cart() throws InterruptedException {
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
	    
	}
	
	
	
	
	
	@Given("User Selects the Electronics Tab")
	public void user_selects_the_electronics_tab() {
	    
		driver.findElement(By.linkText("Electronics")).click();
	}
	@When("User clicks the Cell phones icon")
	public void user_clicks_the_cell_phones_icon() {
	    
		driver.findElement(By.linkText("Cell phones")).click();
	}
	@When("The User selects the Second item to add to cart")
	public void the_user_selects_the_second_item_to_add_to_cart() {
		
		driver.findElement(By.linkText("Nokia Lumia 1020")).click();   
	}
	
	@When("User enters the Quantity of the item")
	public void user_enters_the_quantity_of_the_item() {
	    
		driver.findElement(By.id("product_enteredQuantity_20")).clear();
		driver.findElement(By.id("product_enteredQuantity_20")).sendKeys("3");
		
	}
	
	@Then("The User clicks the add to cart button")
	public void the_user_clicks_the_add_to_cart_button() {
	    
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();	
	}
	@Then("The User views all the item added onto the cart")
	public void the_user_views_all_the_item_added_onto_the_cart() {
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
	}
	@Then("The User accepts the terms of service")
	public void the_user_accepts_the_terms_of_service() {
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	}

	@Then("The user navigates to the check out page")
	public void the_user_navigates_to_the_check_out_page() {
		 driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
		 driver.quit();
	}
	
	
}
