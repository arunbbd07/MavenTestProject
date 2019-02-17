package com.arun.corejava;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {

	WebDriver driver;
	public static void main(String[] args) {
		System.out.println(10 + 20 + "Javatpoint");   
        System.out.println("Javatpoint" + 10 + 20);
		CookiesTest obj= new CookiesTest();
		obj.fetchCookies();
		obj.deleteCookies();
	}
	
	void fetchCookies()
	{
		driver= new ChromeDriver();
		driver.get("https://www.alcalarestaurant.nyc/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Set<Cookie> allCookies= driver.manage().getCookies();
		for(Cookie cookies:allCookies)
		{
			System.out.println(cookies);
		}
				
		driver.quit();
	}
	
	void deleteCookies()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.alcalarestaurant.nyc/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Set<Cookie> allCookies= driver.manage().getCookies();
		for(Cookie cookies:allCookies)
		{
			System.out.println(cookies);
		}
				
		driver.quit();
		
	}

}
