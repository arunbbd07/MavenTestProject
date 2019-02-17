package com.arun.corejava;

public class ConstructorTest extends Test {

	public static void main(String[] args) {
		//ConstructorTest obj = new ConstructorTest();   
       Test t1=new  ConstructorTest();

		//Test t=new Test();
	}
	 
	ConstructorTest()
	{
		System.out.println("This is the  Child method");
	}

}

class Test{
	
	Test()
	{
		System.out.println("This is the Parent method");
	}
}
