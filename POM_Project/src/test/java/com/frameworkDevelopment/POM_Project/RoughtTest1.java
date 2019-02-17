package com.frameworkDevelopment.POM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class RoughtTest1 {
	public WebDriver driver;
	
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
	}

}
