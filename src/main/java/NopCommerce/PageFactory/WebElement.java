package NopCommerce.PageFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.Basepage.BaseProjectClass;

public class WebElement extends BaseProjectClass{

	public WebElement() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//input[@id='gender-male']")
	private WebElement Genderselect;
	
	@FindBy (xpath = "//input[@name='FirstName']")
	private WebElement Firstname;
	
	@FindBy (xpath ="//input[@name='LastName']")
	private WebElement Lastname;
	
	@FindBy (name = "DateOfBirthDay")
	private WebElement Day;
	
	
}