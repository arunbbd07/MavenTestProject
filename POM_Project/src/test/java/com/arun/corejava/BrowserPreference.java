package com.arun.corejava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserPreference {

	public static void main(String[] args) {
		BrowserPreference obj= new BrowserPreference();
		obj.browserLocalization("chrome");

	}
	 void browserLocalization(String browser){
		 
		 if(browser.toLowerCase().equals("chrome"))
		 {
			 ChromeOptions options=new ChromeOptions();
			 options.addArguments("--lang=es");
			 ChromeDriver driver=new ChromeDriver(options);
			 driver.get("http://google.com");
			 		 
		 }
		 else
		 {
			 /*FirefoxProfile profile= new FirefoxProfile();
			 profile.setPreference("intl.accept_languages","fr");
			 driver = new FirefoxDriver();*/
			 
			 
			 
		 }
		 
	 }

}
