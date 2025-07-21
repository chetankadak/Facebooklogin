package T1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C3 {

	@org.testng.annotations.BeforeSuite
	public static void BeforeSuite() {
		System.out.println("BeforeSuite");
	}
	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@BeforeMethod
	public static void BeforeMehtod() {
		System.out.println("BeforeMehtod");
	}
	
	@Test(invocationCount=2, priority=2)
	public static void Test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=1)
	public static void Test2() {
		System.out.println("Test2");
	}
	
	@org.testng.annotations.AfterSuite
	public static void AfterSuite() {
		System.out.println("After suite");
	}
	
	@org.testng.annotations.AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@org.testng.annotations.AfterMethod
	public static void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@org.testng.annotations.BeforeTest
	public static void BeforeTest() {
		System.out.println("BeforeTest");
	}
	
	@org.testng.annotations.AfterTest
	public static void AfterTest() {
		System.out.println("AfterTest");
	}
}
