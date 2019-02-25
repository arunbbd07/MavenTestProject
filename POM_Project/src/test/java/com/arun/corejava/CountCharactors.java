package com.arun.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CountCharactors {

	public static void main(String[] args) throws FileNotFoundException {
		CountCharactors obj= new CountCharactors();
		obj.reverseString("Arun");
		obj.countDuplicateCharactor();
		obj.redJSONFile();
	}
	void countDuplicateCharactor()
	{
		char Char;
		int count;
		String a = "ArunArunArun";
		a = a.toLowerCase();
		for (Char = 'a'; Char <= 'z'; Char++) {
			count = 0;
			for (int i = 0; i < a.length(); i++) {
				if (a.charAt(i) == Char) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("Number of occurences of " + Char + " is " + count);
			}
		}
	}
	
	void redJSONFile() throws FileNotFoundException {
		File file = new File("C:\\Users\\Arun Kumar Yadav\\Desktop\\Test.txt");
		Scanner scanFile = new Scanner(file);
		int sum = 0;
		while (scanFile.hasNext()) {
			sum += scanFile.nextInt();

		}
		System.out.println(sum);
		scanFile.close();
	}
	void reverseString(String str)
	{
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		String str1=new String(arr);
		System.out.println(str1);
	}
	
	
}

