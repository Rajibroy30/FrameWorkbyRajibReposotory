package Com.NopCommerce.Basepage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Com.NopCommerce.Utils.NopComerceUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseProjectClass {
	public static WebDriver driver;
	public static String firstname = "Rajib";
	public static String lasttname = "Roy";		
	public static String email = "RajibRoy@me.com";
	public static String pass = "SmartTech1";
	
	public static void BrowserLaunch() throws InterruptedException, IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj Roy\\eclipse-workspace\\FraneworkByRajib\\Driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	

//driver.quit();

	}
	
	
public static void main(String[] args) throws InterruptedException, IOException {
	
	
	BaseProjectClass.BrowserLaunch();

}
}
