package com.arun.exceptionhandling;

public class TryCatch {
	
	public static void main(String[] args) {
		TryCatch obj= new TryCatch();
		obj.tryCatchExample();
		//obj.customException();
		
	}

   void tryCatchExample()
   {
	  
	   
	   try
	   {
		   //System.out.println(15/0);
		   System.out.println("This is the try block");
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   finally
	   {
		   System.out.println("this would be always get executed irrespective of exception");
	   }
   }
   
   void customException()    {
	   
	  while (true)
	   {
		   try {
			throw new MyException();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   }
}
