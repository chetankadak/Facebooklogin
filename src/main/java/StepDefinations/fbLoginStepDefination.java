package StepDefinations;

import java.io.IOException;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import GenericMethodPage.loginGeneric;
import Pages.loginPageCheck;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class fbLoginStepDefination extends loginPageCheck{

	@Given("User should be login page")
	public static void User_should_be_login_page() throws IOException {
		browserInitzation(browser, URL);
		ExtentCucumberAdapter.addTestStepLog("application is launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginGeneric.captureScreenShot());
	}
	
	@When("user enters valid username {string}")
	public static void user_enters_valid_username(String emailid) {
		Enter_email(emailid, loginPageCheck.EMailInput);
	}
	
	@And("user enters valid password {string}")
	public static void user_enters_valid_password(String passwordid) {
		Enter_password(passwordid, loginPageCheck.EMailpassword);
	}
	
	@When("^user enters valid usernameC\"([^\"]*)\"$")
	public static void user_enters_valid_usernameC(String Emailid) throws IOException
 {
		Enter_email(Emailid,loginPageCheck.EMailInput);
		ExtentCucumberAdapter.addTestStepLog("Entered email");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginGeneric.captureScreenShot());
		
	}
	
	@When("^user enters valid passwordC\"([^\"]*)\"$")
	public static void user_enters_valid_passwordC(String password) throws IOException
	{
		Enter_password(password,loginPageCheck.EMailpassword);
		ExtentCucumberAdapter.addTestStepLog("Entered password");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(loginGeneric.captureScreenShot());
		
	}
	
	@And("Clicks on submit")
	public static void Clicks_on_submit() {
		Button_login();
	}
//	
//	@And("close the browser")
//	public static void close_the_browser()
//	{
//		browser_Close();
//	}

	
	
}
