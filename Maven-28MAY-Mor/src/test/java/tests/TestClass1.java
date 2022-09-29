package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite TestClass -1");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test TestClass - 1");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class TestClass - 1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@Test 
	public void test1() {
		System.out.println("Test 1 TestClass - 1");
	}
	
	@Test 
	public void test2() {
		System.out.println("Test 2 TestClass - 1");
	}
	
	@Test 
	public void test3() {
		System.out.println("Test 3 TestClass - 1");
	}
	
	@Test 
	public void test4() {
		System.out.println("Test 4 TestClass - 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method TestClass - 1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class TestClass - 1");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test TestClass - 1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Before Suite TestClass - 1");
	}
}
