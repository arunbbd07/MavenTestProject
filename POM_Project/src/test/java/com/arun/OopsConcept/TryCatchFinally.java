package com.arun.OopsConcept;

public class TryCatchFinally {

	public static void main(String[] args) throws Exception {
		TryCatchFinally obj=new TryCatchFinally();
		obj.tryCatch();

	}
	
	void tryCatch() throws Exception
	{
		try
		{
			int i=5/0;
		}
		catch(Exception e)
		{
			
			throw new Exception();
		}
		finally
		{
			System.out.println("Finally executed!!!!!!!!!!!!!!!");
		}
	}

}
