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
	@FindBy (xpath ="(//button[@type='submit'])[2]")
	private WebElement Submit;
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(id= "Email")
	private WebElement Email;
	public WebElement getEmail() {
		return Email;
	}
	@FindBy(xpath = "//a[@class='button-1 register-continue-button']")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	
	@FindBy (xpath = "//a[@class='ico-logout']")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
	}
	
	@FindBy (xpath = "//a[@class='ico-login']")
	private WebElement Login;
	public WebElement getLogin() {
		return Login;
	}
	@FindBy (xpath ="//img[@alt='nopCommerce demo store']")
	private WebElement Homepage;
	public WebElement getHomepage() {
		return Homepage;
	}
	@FindBy (xpath ="//a[@href='/computers']")
	private WebElement Computers;
	public WebElement getComputers() {
		return Computers;
	}
	@FindBy (xpath ="//a[@title='Show products in category Desktops']")
	private WebElement Desktop;
	public WebElement getDesktop() {
		return Desktop;
	}
	@FindBy (linkText ="Build your own computer")
	private WebElement ChoseDesktop;
	public WebElement getChoseDesktop() {
		return ChoseDesktop;
	}

	@FindBy (xpath = "//*[@id='product_attribute_2']")
	private WebElement Option1;
	public WebElement getOption1() {
		return Option1;
	}
	@FindBy (xpath = "//*[@id='product_attribute_2\']/option[4]")
	private WebElement Option2;
	public WebElement getOption2() {
		return Option2;
	}
	
	@FindBy (xpath = "//*[@id='product_attribute_3_7']")
	private WebElement Option3;
	public WebElement getOption3() {
		return Option3;
	}
	@FindBy (xpath = "//*[@id='product_attribute_4_9']")
	private WebElement Option4;
	public WebElement getOption4() {
		return Option4;
	}
	@FindBy (xpath = "(//button[@type='button'])[2]")
	private WebElement AddToCart;
	public WebElement getAddToCart() {
		return AddToCart;
	}
	@FindBy (linkText = "Shopping cart")
	private WebElement ShoppingCart;
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	@FindBy (linkText = "Electronics")
	private WebElement Electronics;
	public WebElement getElectronics() {
		return Electronics;
	}
	@FindBy (linkText = "Cell phones")
	private WebElement Cellphones;
	public WebElement getCellphones() {
		return Cellphones;
	}
	@FindBy (linkText = "Nokia Lumia 1020")
	private WebElement ChosePhone;
	public WebElement getChosePhone() {
		return ChosePhone;
	}
	@FindBy (id = "product_enteredQuantity_20")
	private WebElement Quantity;
	public WebElement getQuantity() {
		return Quantity;
	}
	@FindBy (xpath = "(//input[@type='checkbox'])[3]")
	private WebElement AcceptTerm;
	public WebElement getAcceptTerm() {
		return AcceptTerm;
	}
	@FindBy (xpath ="(//button[@type='submit'])[6]")
	private WebElement Checkout;
	public WebElement getCheckout() {
		return Checkout;
	}
	
}
