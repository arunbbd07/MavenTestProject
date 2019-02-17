package com.arun.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingleKeyMultipleValueUsingList {

	public static void main(String[] args) {
		
		// create map to store
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		// create list one and store values
		ArrayList<String> valSetOne = new ArrayList<String>();
		valSetOne.add("Alcala");
		valSetOne.add("NYC");
		// create list two and store values
		ArrayList<String> valSetTwo = new ArrayList<String>();
		valSetTwo.add("108 Food");
		valSetTwo.add("NYC");
		// create list three and store values
		ArrayList<String> valSetThree = new ArrayList<String>();
		valSetThree.add("Star Of Siam");
		valSetThree.add("Chicago");
		// put values into map
		map.put("Rest01", valSetOne);
		map.put("Rest02", valSetTwo);
		map.put("Rest03", valSetThree);

		Set<String> keys = map.keySet();
		// iterate and display values
		System.out.println("Fetching Keys and corresponding [Multiple] Values n");
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			String key = entry.getKey();
			List<String> values = entry.getValue();
			for(String str :values)
			{
			if (str.equals("Alcala"))
					{
			System.out.println("Key = " + key);
			System.out.println("Values = " + values + "n");
					}
		}
		}
	}

}
