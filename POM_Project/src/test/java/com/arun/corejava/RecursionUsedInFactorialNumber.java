package com.arun.corejava;

public class RecursionUsedInFactorialNumber {

	static int count;
	public static void main(String[] args) {
		recursion();
		System.out.println("Factorial of enter number is :"+factorialProgram(5) );

	}
	
	static void recursion()
	{
		count++;
		if(count<=10)
		{
			System.out.println("Hello "+ count);
			recursion();
		}
	}
	
	static int factorialProgram(int num)
	{
		if(num==1)
		{
			return 1;
		}
		
		else
		{
			return(num*factorialProgram(num-1));
		}
		
	}

}
