package com.arun.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMapExample obj= new HashMapExample();
		obj.hashMapTest();
		
	}
	
	void hashMapTest()
	{
		 Map<Integer,ArrayList<String>> mp=new HashMap<Integer, ArrayList<String>>();
         Integer Order1 = 1;
         Integer Order2 = 2;
         String fruit1 = "banana";
         String fruit2 = "apple";
         String fruit3 = "orange";
         String fruit4 = "guava";
         String veg1 = "carrot";
         String veg2 = "potato";
         ArrayList<String> arrlist1= new ArrayList<String>();
         arrlist1.add(fruit1);
         arrlist1.add(fruit2);
         arrlist1.add(fruit3);
         arrlist1.add(fruit4);
         Collections.addAll(arrlist1, "Tamarillo","Tamarind","Lime");
         Collections.sort(arrlist1);
         for(String fruit :arrlist1)
         {
        	 System.out.println(fruit);
         }
         
         ArrayList<String> arrlist2=new ArrayList<String>();
         arrlist2.add(veg1);
         arrlist2.add(veg2);
        

         mp.put(Order1,arrlist1);
         mp.put(Order2,arrlist2);
        
         for (Integer key : mp.keySet()){
             //String fruit = mp.get(Key);
        	     for(String order:mp.get(key))
        		 {
        		 if(order.equals("potato"))
        		 System.out.println("The order # of potato is: "+ key);
        		 }
        	
             System.out.println("Key :" +key);
             System.out.println("Value : "+mp.get(key));
             
	}

	}
}
