package com.arun.OopsConcept;

import org.omg.Messaging.SyncScopeHelper;

public class A {

	public static void main(String[] args) {
		A obj=new A();
		obj.printStar();
		obj.toCheckPrimeNo(67);
		obj.countVowels();
		obj.arithmatic();
		A obj1=new A();
		//===============================
		if(obj==obj1)
		{
			System.out.println("obj==obj1");
		}
	    if(obj.equals(obj1))
	    {
	    	System.out.println("obj.equals(obj1)");
	    }
	  //===============================
		obj.m2(null);
		
		String name="ARUN";
		//String[] arr=name.split("");
		char[] arr=name.toCharArray();
		int n=arr.length;
		for (int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("length is "+ n);
		
		 A a= new A();
		a.m1();

	}
	//===============================================================
	 void m2 (String str)
	 {
		 System.out.println("String Method");
	 }
	 
	void m2(Object o)
	 {
		
		 System.out.println("Object Method");
	 }
	
	 
	 //=============================================================
	protected A m1()
		{
			System.out.println("This Parent m1() : class A");
			return new A();
		}
	
	void arithmatic()
	{
		int [] arr= {1,3,5,7,9,11,13};
		int n=arr.length;
		//13=1+(n-1)2--> 2n=14--> n=7
	
		int d=arr[2]-arr[1];
		
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
			int sum=arr[i];
		   System.out.println(sum +" of #"+i);
		   }
			else
			{
				int sum=arr[i-1]+d;
				System.out.println(sum +" of #"+i);
			}
		}
	
	}
	void countVowels()
	{
		String str="How many vowels in this String";
		char[] arr=str.toCharArray();
		int count =0;
		for(char c: arr)
		{
			
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
		          count ++;
		break;
		default:
		}
			
			
		
		}
		System.out.println(" total vowel count is  "+ count);
	}
	
	void toCheckPrimeNo( int n)
		{
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(" prime");
		}
		else if(flag==1)
		{
			System.out.println(" not prime ");
		}
		
		
	}
	
	void printStar()
	{
		int n=5;
		
		for( int i=0;i<=n;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}
	
	
	}
	class B extends A
	{
	 protected B m1()
		{
			//super.m1();
			System.out.println("This Child m1() : class B");
			return new B();
		}
	 
	}

