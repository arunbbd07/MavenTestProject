package com.arun.corejava;

public class TryCatch {

	public static void main(String[] args) {
		
		try
		{
		 int [] arr= new int[15];
		 arr[14]=1/0;
		 arr[15]=26;
	
		}
		catch (ArithmeticException e)
		{
			System.out.println("This is the ArithmeticException!!");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is the ArrayIndexOutOfBoundsException!!!");
		}
		catch(Exception e)
		{
			System.out.println("This is the Generic Exception!!");
		}

		finally
		{
			System.out.println("this would be get executed always!!");
		}
		
		
	}

}
