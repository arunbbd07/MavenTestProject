package com.arun.corejava;

public class WrapperClass {

	public static void main(String[] args) {
		WrapperClass obj = new WrapperClass();
		obj.IntegerWrapper();
	}

	void IntegerWrapper() {

		
		String str = "37";
		int num1 = Integer.parseInt(str);
		int sum = num1 + 10;
		System.out.println("Sum is: " + sum);
		//IntegerWrapper();
	}

}
