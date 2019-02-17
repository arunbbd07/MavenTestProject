package com.arun.corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		MapExample obj=new MapExample();
		obj.hashMap();

	}

	void hashMap()
	{ 
		//Add the <K,V> in the HashMap
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("EmpCode", new Integer(100));
		hm.put("PersonId", new Integer(101));
		hm.put("Pincode", new Integer(222109));
		hm.put("DOB", new Integer(2019));
		
		//Returns the Set View
		Set<Entry<String, Integer>> set=hm.entrySet();
		
		for(Map.Entry<String,Integer> element :set)
		{
			System.out.println(element.getKey()+": "+element.getValue());
		}
		System.out.println("====Blank========");
		hm.forEach((name, id) -> System.out.println(name+" =>: "+id));
		
	}
}
