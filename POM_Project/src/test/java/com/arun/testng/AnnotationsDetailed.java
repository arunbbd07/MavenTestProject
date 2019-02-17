package com.arun.testng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDetailed {

	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("@BeforeSuite");
	}
	@BeforeTest
	void beforeTest()
	{
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("@BeforeMethod");
	}
	@Test(priority=1)
	void test1()
	{
		System.out.println("test 1");
	}
	@Test(priority=0)
	void test2()
	{
		System.out.println("test 2");
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("@AfterMethod");
	}
	@AfterClass
	void afterClass()
	{
		System.out.println("@AfterClass");
	}
	@AfterTest
	void afterTest()
	{
		System.out.println("@AfterTest");
	}
	@AfterSuite
	void afterSuite()
	{
		System.out.println("@AfterSuite");
	}
}
