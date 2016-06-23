package com.testsol.testScripts;

import org.testng.annotations.*;

public class TestNgDemo {
	@BeforeClass
	public void beforeClass(){
		System.out.println("before Class");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod");
	}
	@Test
	public void test(){
		System.out.println("test");
	}
	@AfterClass
	public void afterMethod(){
		System.out.println("afterMethod");
	}
	@AfterMethod
	public void afterClass(){
		System.out.println("afterClass");
	}
}
