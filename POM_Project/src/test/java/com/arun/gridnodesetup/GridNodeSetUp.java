package com.arun.gridnodesetup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Register Hub on CMD: java -jar D:\Selenium\selenium-server-standalone-3.141.59.jar -role hub
 * Register Node on CMD: java -Dwebdriver.gecko.driver="C:\Arun Kumar Yadav\geckodriver.exe" -jar "C:\Arun Kumar Yadav\selenium-server-standalone-3.141.59.jar"  -role node -hub http://192.168.1.101:4444/grid/register
 */

public class GridNodeSetUp {

	WebDriver driver;
	String baseUrl,hubUrl;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		baseUrl="https://stackoverflow.com";
		hubUrl="http://localhost:4444/wd/hub";
		DesiredCapabilities capability=  DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WINDOWS);
		
		URL url=new URL(hubUrl);
		driver= new RemoteWebDriver(url, capability);
       driver.get(baseUrl);
       //System.out.println(driver.getTitle());
        
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	@Test(invocationCount=5, threadPoolSize=2, timeOut=100000, priority=0, groups={"bvt","smoke"},dependsOnMethods={"login"}, dependsOnGroups={"bvt"}, enabled=true)
	public void simpleTest()
	{
		driver.get(baseUrl);
		System.out.println(driver.getTitle());
		/*for(int i=1; i<=20;i++)
		{
			System.out.println("Count is: "+i);
		}*/
	}
}
