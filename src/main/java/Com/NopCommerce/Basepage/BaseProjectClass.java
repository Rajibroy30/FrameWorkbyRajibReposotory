package Com.NopCommerce.Basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseProjectClass {
	public static WebDriver driver;
	static String firstname = "Rajib";
	static String lasttname = "Roy";		
	static String email = "RajibRoy650@me.com";
	static String pass = "SmartTech1";
	
	public static void BrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj Roy\\eclipse-workspace\\FraneworkByRajib\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://demo.nopcommerce.com/");
	driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();	
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lasttname);
	
	
	Select Date = new Select(driver.findElement(By.name("DateOfBirthDay")));
	Date.selectByVisibleText("20");
	
	Select Month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
	Month.selectByVisibleText("July");
	
	Select Year = new Select (driver.findElement(By.name("DateOfBirthYear")));
	Year.selectByVisibleText("1993");
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Company")).sendKeys("Smart Tech");
	driver.findElement(By.id("Password")).sendKeys(pass);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); // Registration
	
	
	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pass);// login
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	//driver.navigate().back();
	

	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).click();
	
	driver.findElement(By.xpath("//a[@href='/computers']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@title='Show products in category Desktops']")).click();
	driver.findElement(By.xpath("//a[@href='/build-your-own-computer']")).click();
	
	
	driver.findElement(By.xpath("//*[@id='product_attribute_2']")).click();
	driver.findElement(By.xpath("//*[@id='product_attribute_2\']/option[4]")).click();
	driver.findElement(By.xpath("//*[@id='product_attribute_3_7']")).click();
	driver.findElement(By.xpath("//*[@id='product_attribute_4_9']")).click();
	
	//Thread.sleep(1000);

	driver.findElement(By.xpath("//button[@type='button']")).click();
	
	driver.findElement(By.linkText("Electronics")).click();
	driver.findElement(By.linkText("Cell phones")).click();
	driver.findElement(By.linkText("Nokia Lumia 1020")).click();
	driver.findElement(By.id("product_enteredQuantity_20")).clear();
	driver.findElement(By.id("product_enteredQuantity_20")).sendKeys("3");
	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	
	
	
	driver.findElement(By.linkText("Shopping cart")).click();

	
//driver.quit();
	

	
	}
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	BaseProjectClass.BrowserLaunch();

}
}
