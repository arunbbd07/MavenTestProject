package com.frameworkDevelopment.POM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
public WebDriver driver;
	
	@BeforeSuite
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("This is BeforeTest Method");
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("This is AfterTest Method");
		driver.quit();
	}
	
}
