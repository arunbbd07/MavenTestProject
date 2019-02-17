package com.arun.factorypattern;

public class SingletonClass {

	private static  SingletonClass obj;
	private SingletonClass(){};
	
	public static SingletonClass getInstance()
	{
	  if(obj==null)
	  {
	   obj=new SingletonClass();
	  }
	  return obj;
	}
	
	public static void main(String[] args)
	{
		SingletonClass obj= SingletonClass.getInstance();
		SingletonClass obj1=SingletonClass.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}
