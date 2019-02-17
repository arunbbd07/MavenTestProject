package com.arun.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayListExample obj= new ArrayListExample();
		obj.arrayListProg();

	}
	
	void arrayListProg()
	{
		ArrayList<String> arrlist= new ArrayList<String>();
		Collections.addAll(arrlist,"Alcala", "Spice","Sushumai","108 Food","Meat & Potato" );
		arrlist.forEach(System.out::println);
		System.out.println("Natural Orderding Sorting as below");
		Collections.sort(arrlist);
		for(String str: arrlist)
		{
			System.out.println(str);
		}
		System.out.println("Natural Reverse Orderding Sorting as below");
		//Collections.sort(arrlist,Comparator.reverseOrder());
		Collections.reverse(arrlist);
		arrlist.forEach(System.out::println);
		
	}

}
