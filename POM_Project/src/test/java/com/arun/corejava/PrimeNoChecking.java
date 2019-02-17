package com.arun.corejava;

import java.util.Scanner;
import java.util.TreeSet;

public class PrimeNoChecking {

	
	public static void main(String[] args) {
		PrimeNoChecking obj = new PrimeNoChecking();
		//obj.toCheckPrimeNo();
		//obj.toReverseString("ARUN");
		//obj.fizzBuzz();
		obj.toDuplicateElement();

	}
	

	void toCheckPrimeNo() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number");
		int n = scan.nextInt();
		scan.close();
		if (n <= 1) {
			System.out.println("This is not prime number");

		} else {
			int flag = 0;
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("This is the prime number");
			} else {
				System.out.println("This is not prime number");
			}
		}
	}

	void toReverseString(String str) {
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	void fizzBuzz() {
		for (int i = 1; i < 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz :: " + i);
			} else if (i % 3 == 0) {

				System.out.println("Fizz :: " + i);
			} else if (i % 5 == 0) {
				System.out.println("Buzz :: " + i);
			}

		}
	}
	
	void toDuplicateElement()
	{
		int [] arr={2,5,8,9,10,15,2,5,8,1,1,4,6,7,11};
		
		TreeSet<Integer> tset=new TreeSet<Integer>();
		
		for(int i=0;i< arr.length;i++)
		{
			tset.add(arr[i]);
		}
		
		System.out.println(tset);
		System.out.println("the highest number is "+ tset.last());
		System.out.println("the lowest number is "+ tset.first());
	}
	
	

}
