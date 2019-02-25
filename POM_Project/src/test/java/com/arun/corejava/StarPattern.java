package com.arun.corejava;

public class StarPattern {

	public static void main(String[] args) {
		StarPattern obj = new StarPattern();
		obj.Palindrone("radar");
		obj.star1(5);
		System.out.println();
		obj.star2(5);
		obj.star3(5);

	}

	void star1(int n) {
		int count;
		for (int i = 0; i < n; i++) {
			//count = 0;
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				//count++;
			}
			System.out.println();
		}
	}

	void star2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}

	void star3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

	void Palindrone(String str) {
		StringBuffer sb = new StringBuffer();
       	for (int i = str.length() - 1; i >= 0; i--) 
       	{
          sb.append(str.charAt(i));
		}
       	if(str.equals(sb.toString()))
       	{
       		System.out.println("Palindrome");
       	}
       	else
       	{
       		System.out.println("Not Palindrome");
       	}
	}
	
	

}
