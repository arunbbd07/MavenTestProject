package com.frameworkDevelopment.POM_Project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void OpenWebsite(String url)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
		//driver= new ChromeDriver();
		driver.get(url);
		//assertTrue("Google", driver.getTitle());
	}
	
	void RegExProg(String url)
	{
		driver.get(url);
	    List<WebElement> lst=driver.findElements(By.tagName("a"));
	    ArrayList<String> strarr=new ArrayList<String>();
	    
	    for(WebElement element :lst)
	    {
	    	strarr.add(element.getAttribute("href"));
	    }
	    
	    for (String str:strarr)
	    {
	    	str.contains(str);
	    }
	    
	    //String pageContent=driver.findElement(By.xpath(xpathExpression));
	    
	    //if(pageContent.contains("a[href*="Smart"]"))
	    {
	    	
	    }
	}

}
