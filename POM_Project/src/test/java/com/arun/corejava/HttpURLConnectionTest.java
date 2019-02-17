package com.arun.corejava;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HttpURLConnectionTest {

	public WebDriver driver;
	public static void main(String[] args) throws Exception {
		//isDomainUp("https://stackoverflow.com/questions/3030487/is-there-a-way-to-get-the-xpath-in-google-chrome");
		HttpURLConnectionTest obj=new HttpURLConnectionTest();
		obj.allLinks("https://www.dhflpramerica.com/");
		
	}

	public void allLinks(String url) throws IOException {
		driver= new ChromeDriver();
		driver.get(url);
		List<WebElement> list=driver.findElements(By.tagName("a"));
	System.out.println("sizeBeforeImage "+list.size());
		list.addAll(driver.findElements(By.tagName("img")));
		System.out.println("sizeAfterImage "+list.size());
		ArrayList<String> arrlist= new ArrayList<String>();
		
		for(WebElement element :list )
		{
			arrlist.add(element.getAttribute("href"));
		}
		
		for(String link: arrlist)
		{
			//isDomainUp(link);
			System.out.println(link);
		}
		
		
	}

	public static void isDomainUp(String url) throws IOException {
        URL obj= new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		try {
			con.connect();
			String response = con.getResponseMessage();
			System.out.println("The url is :" + url + " => and response code is: " + response);
			con.disconnect();

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
