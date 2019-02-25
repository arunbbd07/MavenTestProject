package com.arun.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

	public static void main(String[] args) {
		RegexExamples obj= new RegexExamples();
		obj.toGetNumber("string1234more567strin7986___g890");
		obj.keyValuePairs();
		obj.mixedString();

	}
	
	void toGetNumber(String str) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
	
	void keyValuePairs()
	{
		String str="bookname=testing&bookid=123456&bookprice=123.45";
		Pattern p=Pattern.compile("(?<=bookid=)\\d+");
		Matcher m=p.matcher(str);
		 while(m.find())
		 {
			 System.out.println(""+m.group());
		 }
	}
	
    void mixedString()
    {
    	//String str="Your address is 6B1BC0";
    	Pattern p=Pattern.compile("Your address is\\s+([A-Z0-9]{6})");
    	Matcher m=p.matcher("Your address is 6B1BC0");
    	if(m.find())
    	{
    		System.out.println(m.group(1));
    	}
    }

}
