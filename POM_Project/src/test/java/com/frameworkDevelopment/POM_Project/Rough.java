package com.frameworkDevelopment.POM_Project;

import java.io.IOException;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.WebDriver;

public class Rough {

	private String name;

	public static void main(String[] args) {

		Rough obj = new Rough();
		obj.stopWatchProg();
		obj.printPyramid(5);
		obj.setName("Munchado");
		obj.toCheckPrimeNum(37);
		// obj.checkAge(10);
		System.out.println("Name is :" + obj.getName());
		obj.overriddingMethod();
		// Rough1 obj1=new Rough1();
		//obj1.overriddingMethod();
		Rough obj2 = new Rough1();
	
		obj2.overriddingMethod();
		obj.Method1();

		/*
		 * Integer [] intarr={1,2,3,4,5,6,7,8,9,10}; Double[]
		 * doublearr={1.5,2.5,3.5,4.5,5.5,6.5,7.5,8.5,9.5,10.5}; Character[]
		 * charr={'H','E','L','L','O'}; obj.GenericMethodPrintingArray(intarr);
		 * System.out.println("====Blank==========");
		 * obj.GenericMethodPrintingArray(doublearr);
		 * System.out.println("====Blank==========");
		 * obj.GenericMethodPrintingArray(charr);
		 * System.out.println("====Blank==========");
		 */

	}

	<E> void GenericMethodPrintingArray(E[] arrGeneric) {
		for (E element : arrGeneric) {
			System.out.println(element);
		}
		System.out.println();
	}

	void Method1() {
		try {
			int a = 1 / 0;
			System.out.println("this is the try block");
		} catch (Exception e) {
			System.out.println("This is the Exception block");
		} finally {
			System.out.println("This is the finally block");
		}

	}

	void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Sorry! not eligible for voting");
		} else {
			System.out.println("Congrats!, eligble for voting");
		}
	}

	void overriddingMethod() {
		System.out.println("This is the parant method of overridding");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	void toCheckPrimeNum(int num) {
		boolean flag = false;
		for (int a = 2; a < num / 2; a++) {
			if (num % a == 0) {
				flag = true;
				break;
			}

		}
		if (!flag) {
			System.out.println("The number is Prime: " + num);
		}

		else if (flag) {
			System.out.println("The number is not prime: " + num);
		}
	}

	void printPyramid(int num) {
		for (int i = 0; i <=num; i++) {
			for (int j=0;j<i;j++) //ascending order
			//for (int j = i; j < num; j++) //descending order
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
	
	void stopWatchProg()
	{
		StopWatch stopWatchobj= new StopWatch();
		System.out.println("This is before start method");
		stopWatchobj.start();
		System.out.println("this is just after "+ stopWatchobj);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this just after 500ms" +stopWatchobj);
		
	}

}




class Rough1 extends Rough {

	public void overriddingMethod() {
		System.out.println("This is the child method of overridding");
	}
}
