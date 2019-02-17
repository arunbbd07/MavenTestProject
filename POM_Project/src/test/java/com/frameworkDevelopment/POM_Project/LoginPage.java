package com.frameworkDevelopment.POM_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.HTMLReporter.Config;

public class LoginPage extends TestBase {
	
	
	public static Logger log= Logger.getLogger("devpinoyLogger");
		
	public static void main (String[] args) 
	{
		//LoginPage obj= new LoginPage(driver);
		//obj.searchGoogle();
		
		/*Properties mail1=new Properties();
		FileInputStream fismail=new FileInputStream(System.getProperty("user.dir")+"\\resources\\Config.properties");
		mail1.load(fismail);
		MonitoringMail mail= new MonitoringMail();
		System.out.println(mail1.getProperty("from"));
		login();
		mail.sendMail(mail1.getProperty("server"), mail1.getProperty("from"),TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		*/
	}
	
	
	void login() throws IOException
	{
		Properties or=new Properties();
		Properties config=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\resources\\OR.properties");
		FileInputStream fis1=new FileInputStream(System.getProperty("user.dir")+"\\resources\\Config.properties");
		or.load(fis);
		log.debug("OR properties loaded"); 
		config.load(fis1);
		log.debug("config properties loaded");
		System.out.println(or.getProperty("username"));
		log.debug("username properties loaded");
		System.out.println(config.getProperty("url"));
		log.debug("url properties loaded");
		
	}
	
	/*public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}*/
	@Test
	void searchGoogle()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(" how to select top 10 items in mysql");
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
		System.out.println("This is the Open Website Method of Test Base");
	}
	

}
