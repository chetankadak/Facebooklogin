package T1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C2 {

	@BeforeClass
	public static void BeforeClass2() {
		System.out.println("Before Class 2");
	}
	
	@AfterClass
	public static void AfterClass2() {
		System.out.println("After class 2");
	}
	
	@Test
	public static void Test2() {
		System.out.println("Test2");
	}
	
	@org.testng.annotations.BeforeSuite
	public static void BeforeSuite() {
		System.out.println("BeforeSuite of C2");
	}
	
	@org.testng.annotations.AfterSuite
	public static void AfterSuite() {
		System.out.println("AfterSuite of C2");
	}
}
