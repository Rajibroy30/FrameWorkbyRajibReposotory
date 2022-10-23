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
		pf =PageFactory.initElements(driver, NopCommerceWebElement.class);
		pf.getHomepage().click();
	    
	}
	@When("User Selects the Computers Tab")
	public void user_selects_the_computers_tab() {
	    
		pf.getComputers().click();
		//Thread.sleep(1000);
	}
	
	@When("User clicks the desktop icon")
	public void user_clicks_the_desktop_icon() {
		pf.getDesktop().click();
	    
	}
	@When("The User selects the item to add to cart")
	public void the_user_selects_the_item_to_add_to_cart() {
		
		pf.getChoseDesktop().click();
	    
	}
	@When("User selects the option of the item")
	public void user_selects_the_option_of_the_item() {
	    
		pf.getOption1().click();
		pf.getOption2().click();
		pf.getOption3().click();
		pf.getOption4().click();
	}
	@Then("User clicks the add to cart button")
	public void user_clicks_the_add_to_cart_button() {
	    
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
	
	@Then("The User views the item added onto the cart")
	public void the_user_views_the_item_added_onto_the_cart() throws InterruptedException {
		pf.getShoppingCart().click();
		Thread.sleep(1000);
	    
	}
	
	
	
	
	
	@Given("User Selects the Electronics Tab")
	public void user_selects_the_electronics_tab() {
	    
		pf.getElectronics().click();
	}
	@When("User clicks the Cell phones icon")
	public void user_clicks_the_cell_phones_icon() {
	    
		pf.getCellphones().click();
	}
	@When("The User selects the Second item to add to cart")
	public void the_user_selects_the_second_item_to_add_to_cart() {
		
		pf.getChosePhone().click();   
	}
	
	@When("User enters the Quantity of the item")
	public void user_enters_the_quantity_of_the_item() {
	    
		pf.getQuantity().clear();
		pf.getQuantity().sendKeys("3");
		
	}
	
	@Then("The User clicks the add to cart button")
	public void the_user_clicks_the_add_to_cart_button() {
	    
		pf.getAddToCart().click();	
	}
	@Then("The User views all the item added onto the cart")
	public void the_user_views_all_the_item_added_onto_the_cart() {
		pf.getShoppingCart().click();
	}
	@Then("The User accepts the terms of service")
	public void the_user_accepts_the_terms_of_service() {
	    pf.getAcceptTerm().click();
	}

	@Then("The user navigates to the check out page")
	public void the_user_navigates_to_the_check_out_page() {
		 pf.getCheckout().click();
		 driver.quit();
	}
	
	
}
