package com.frameworkDevelopment.POM_Project;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RoughTest2{
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("This is BeforeTest Method");
	}
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("This is AfterTest Method");
		driver.quit();
		//Assert.fail();
	}
	@Test(enabled=false)
	public void openWebsite()
	{
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	@Test(enabled=true)
	void homePageOpen()
	{
		HomePage hp=new HomePage(driver);
		hp.OpenWebsite("https://pr5.netcoresmartech.com/dineandmoresmt/admin/index.php/dashboard/welcome/");
		System.out.println(driver.getTitle());
	}

}
