package T1;


import org.testng.annotations.*;

import Pages.loginPageCheck;

public class C1 extends loginPageCheck {

	@BeforeTest
	public static void BeforeTest() {
		System.out.println("Before test");
	}

	@AfterTest
	public static void AfterTest() {
		System.out.println("After test");
	}

	@BeforeClass
	public static void BeforeClass() {
		browserInitzation(browser, URL);
		System.out.println("Before class");
	}

	@Test(priority = 1)
	public static void Test2() {
		System.out.println("Test case 2");

	}

	@BeforeMethod
	public static void BeforeMethod() {
		System.out.println("Before method");
	}

	@Parameters({ "emailid", "passwordid" })
	@Test(invocationCount = 1, priority = 2)
	public static void Test1(String emailid, String passwordid) {
		System.out.println("Test case 1");
		Enter_email(emailid, EMailInput);
		Enter_password(passwordid, EMailpassword);

	}

	@AfterMethod
	public static void AfterMethod() {
		System.out.println("After Method");
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("After class");
	}

}
