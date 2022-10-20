package Com.NopCommerce.PageFactory;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.Basepage.BaseProjectClass;

public class WebElement extends BaseProjectClass{

	public WebElement() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//a[@href='/register?returnUrl=%2F']")
	private WebElement RegisterButton;
	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	@FindBy (xpath = "//input[@id='gender-male']")
	private WebElement Genderselect;
	public WebElement getGenderselect() {
	return Genderselect;
	}
	@FindBy (xpath = "//input[@name='FirstName']")
	private WebElement Firstname;
	public WebElement getFirstname() {
		return Firstname;
	}
	@FindBy (xpath ="//input[@name='LastName']")
	private WebElement Lastname;
	public WebElement getLastname() {
		return Lastname;
		
	}
	@FindBy (name = "DateOfBirthDay")
	private WebElement Day;
	public WebElement getDay() {
		return Day;
	}
	
}