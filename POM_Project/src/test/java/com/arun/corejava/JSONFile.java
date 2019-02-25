package com.arun.corejava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONFile {

	public static void main(String[] args) {
		JSONFile obj = new JSONFile();
		obj.countNoOfCharacter("Programming");
		obj.writeJSON();
		obj.sortString();

	}

	void writeJSON() {
		HashMap<String, String> hmap = new HashMap<String, String>();
		hmap.put("Arun", "QA");
		hmap.put("Aman", "Data Science");
		hmap.put("Ashish", "QA");
		hmap.put("Ajay", "Engineer");
		hmap.put("Anuj", "HR");
		hmap.put("Gaurav", "Developer");
		hmap.put("Sallu", "BDM");
		hmap.put("Sharad", "Data Scientist");
		JSONObject jobj = new JSONObject();
		jobj.putAll(hmap);

		JSONArray list = new JSONArray();
		list.add("Upper Management");
		list.add("Lower Management");
		list.add("Leadership");
		jobj.put("Level", list);

		try {
			FileWriter flWriter = new FileWriter("C:\\Users\\Arun Kumar Yadav\\Desktop\\Test.json");
			flWriter.write(jobj.toJSONString());
			flWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(jobj);
	}

	void sortString() {
		String name = "Arun Kumar Yadav JNP";
		String[] str = name.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
		Arrays.sort(str);
		for (String element : str) {
			System.out.println(element);
		}
	}

	void countNoOfCharacter(String str) {
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
	}

}
