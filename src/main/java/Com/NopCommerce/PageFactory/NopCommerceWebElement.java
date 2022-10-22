package Com.NopCommerce.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.NopCommerce.Basepage.BaseProjectClass;

public class NopCommerceWebElement extends BaseProjectClass{

	public NopCommerceWebElement() {
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
	@FindBy (name = "DateOfBirthMonth")
	private WebElement Month;
	public WebElement getMonth() {
		return Month;
	}
	@FindBy (name = "DateOfBirthYear")
	private WebElement Year;
	public WebElement getYear() {
		return Year;
	}
	@FindBy (id="Company")
	private WebElement Company;
	public WebElement getCompany() {
		return Company;
	}
	@FindBy (id = "Password")
	private WebElement Password;
	public WebElement getPassword() {
		return Password;
	}
	@FindBy (id = "ConfirmPassword")
	private WebElement ConfirmPassword;
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	@FindBy (xpath ="//a[@class='button-1 register-continue-button']")
	private WebElement RegisterButton1;
	public WebElement getRegisterButton1() {
		return RegisterButton1;
	}

}