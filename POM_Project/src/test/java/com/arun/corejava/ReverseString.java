package com.arun.corejava;

public class ReverseString {
	String reverseString= "";

	public static void main(String[] args) {
		ReverseString obj= new ReverseString();
		obj.reverseString("Arun");
		obj.reverseString1("Yadav");
		obj.reverseString2("Arun Kumar Yadav Jaunpur");

	}
	
	void reverseString(String str)
	{
	  for(int i=str.length()-1;i>=0;i--)
	  {
		  reverseString+=str.charAt(i);  
	  }
	  System.out.println(reverseString);
	}
	
	void reverseString1(String str)
	{
		String [] strarr=str.split("");
		
		for(int i=strarr.length-1;i>=0;i--)
		{
			System.out.print(strarr[i]);
		}
		System.out.println();
	}
	
	void reverseString2(String str)
	{
		String[] strarr=str.split(" ");
		//for(int i=strarr.length-1;i>=0;i--) //descending order
		for(int i=0;i<strarr.length-1;i++)
		{
			System.out.println(strarr[i]);
		}
	}
     
}
