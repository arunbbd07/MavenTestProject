package com.arun.stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountNoOfCharacters {

	public static void main(String[] args) {
		CountNoOfCharacters obj=new CountNoOfCharacters();
		obj.reverseString("Arun");
        obj.duplicateCharCount("Programming is a kind of good thing need to be practiced lot");
        obj.duplicateWords();
	}
	
	void duplicateCharCount(String str) {
		char[] carr = str.toCharArray();
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		for (int i = 0; i < carr.length; i++) {
			if (hMap.containsKey(carr[i])) {
				hMap.put(carr[i], hMap.get(carr[i]) + 1);
			} else {
				hMap.put(carr[i], 1);
			}
		}
		System.out.println(hMap);
		Set<Map.Entry<Character, Integer>> entrySet = hMap.entrySet();
		for (Map.Entry<Character, Integer> entry : hMap.entrySet()) {
			if (entry.getValue() > 1) {
				if (entry.getKey() != ' ') {
					System.out.println("Duplicate Value is= " + entry.getKey() + ": " + entry.getValue());
				}
			}
		}
	}
	
	void duplicateWords()
	{
		String paragraph="Arun is good boy Arun looks good";
		String[] str=paragraph.split(" ");
		HashMap<String, Integer> hMap=new HashMap<String, Integer>();
		for(int i=0;i<str.length;i++)
		{
			if(hMap.containsKey(str[i]))
			{
				hMap.put(str[i], hMap.get(str[i])+1);
			}
			else
			{
				hMap.put(str[i], 1);
			}
		}
		System.out.println(hMap);
		
	}
	
	void reverseString(String str)
	{
		int num=100;
		String abc=Integer.toString(num);
		String abc1=String.valueOf('c');
		//StringBuilder sb=new StringBuilder();
		StringBuffer sb=new StringBuffer();
		char [] carr=str.toCharArray();
		for(int i=carr.length-1;i>=0;i--)
		{
			sb.append(carr[i]);
		}
		System.out.println(sb.toString());
		System.out.println("================");
		String reversestr=new StringBuffer(str).reverse().toString();
		System.out.println(reversestr);
	}

}
