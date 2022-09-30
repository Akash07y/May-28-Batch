package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;

public class TestClass2 {

//		@BeforeSuite
//		public void beforeSuite() {
//			System.out.println("Before Suite TestClass - 2");
//		}
//		@BeforeTest
//		public void beforeTest() {
//			System.out.println("Before Test TestClass - 2");
//		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println("Before Class TestClass - 2" );
		}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method TestClass -  2");
		}
		
		@Test 
		public void testA() {

			System.out.println("Test A TestClass - 2");
		}
		
		@Test 
		public void testB() {
			System.out.println("Test B TestClass - 2");
		}
		
		@Test 
		public void testC() {
			System.out.println("Test C TestClass - 2");
		}
		
		@Test 
		public void testD() {
			System.out.println("Test D TestClass - 2");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method TestClass - 2");
		}
		
		@AfterClass
		public void afterClass() {
			System.out.println("After Class TestClass - 2");
		}
		

		@AfterTest
		public void afterTest() {
			System.out.println("After Test TestClass - 2");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("Before Suite TestClass - 2");
		}
}






