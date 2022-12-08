package com.NopCommerce.RgisterTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.NopCommerce.Basepage.BaseProjectClass;
import Com.NopCommerce.PageFactory.NopCommerceWebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTestNG extends BaseProjectClass{
	
	@BeforeTest
	public static void setup() {
	WebDriverManager.chromedriver().setup(); 
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().deleteAllCookies();	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	@Test
	public static void Registration() throws InterruptedException {
		driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lasttname);
		
		Thread.sleep(2000);
		String actual = driver.findElement(By.linkText("Register")).getText();
		Assert.assertTrue(actual.contains("Register"));
		
	}
	@AfterTest
	public static void teardown() {
		driver.close();
}
	}
