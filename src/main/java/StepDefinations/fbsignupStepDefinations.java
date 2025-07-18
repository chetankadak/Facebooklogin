package StepDefinations;



import java.io.IOException;

import org.openqa.selenium.By;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import GenericMethodPage.Signupgeneric;
import GenericMethodPage.loginGeneric;
import Pages.signupPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbsignupStepDefinations extends signupPage{

	@Given("user is on facebook signup page")
	public static void user_is_on_facebook_signup_page() throws IOException {
		browserInitzation(browser, URL);
		ExtentCucumberAdapter.addTestStepLog("Browser launched");
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@When("user enter firstnameS {string}")
	public static void user_enter_firstnameS(String firstname) {
		firstNameText(enterFirstname,firstname);
	}

	@And("user enter lastnameS {string}")
	public static void user_enter_lastnameS(String lastname) {
		lastNameText(enterlastname,lastname);
	}

	@And("user enter birthday dateS {string}")
	public static void user_enter_birthday_dateS(String birthday) {
		dayText(Dayenter, birthday);
	}

	@And("user enter birthday monthS {string}")
	public static void user_enter_birthday_monthS(String birthmonth) {
		monthText( Monthenter, birthmonth);
	}

	@And("user enter birthday yearS {string}")
	public static void user_enter_birthday_yearS(String birthyear) {
		yearText(Yearenter,birthyear);
	}

	@And("user select genderS {string}")
	public static void user_select_genderS(String gendername) {
		selectGender(gender,gendername);
	}
	
	@And("user select on custom {string}")
	public static void user_select_on_customS(String check) {
		customChecked(custom, check);
	}
	
	@And("user select the text {string}")
	public static void user_select_the_text(String wish) {
		customgendercheck(customgender, wish);
	}

	@And("user enter mobile numberS {string}")
	public static void user_enter_mobile_numberS(String emailidname) {
		emailText(enterEmail, emailidname);
	}

	@And("user enter passwordS {string}")
	public static void user_enter_passwordS(String passwordname) {
		passwordText(enterPassword, passwordname);
	}
	
	
	@When("^user enter firstname \"([^\"]*)\"$")
	public static void user_enter_firstname(String firstname) throws IOException {
		firstNameText(enterFirstname,firstname);
		ExtentCucumberAdapter.addTestStepLog("enter the first name "+firstname);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user enter lastname \"([^\"]*)\"$")
	public static void user_enter_lastname(String lastname) throws IOException {
		lastNameText(enterlastname,lastname);
		ExtentCucumberAdapter.addTestStepLog("enter the last name "+lastname);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user enter birthday date \"([^\"]*)\"$")
	public static void user_enter_birthday_date(String birthday) throws IOException {
		dayText(Dayenter, birthday);
		ExtentCucumberAdapter.addTestStepLog("enter the day "+birthday);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user enter birthday month \"([^\"]*)\"$")
	public static void user_enter_birthday_month(String birthmonth) throws IOException {
		monthText( Monthenter, birthmonth);
		ExtentCucumberAdapter.addTestStepLog("Enter the month"+birthmonth);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user enter birthday year \"([^\"]*)\"$")
	public static void user_enter_birthday_year(String birthyear) throws IOException {
		yearText(Yearenter,birthyear);
		ExtentCucumberAdapter.addTestStepLog("Enter the year"+birthyear);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user select gender \"([^\"]*)\"$")
	public static void user_select_gender(String gendername) throws IOException {
		selectGender(gender,gendername);
		ExtentCucumberAdapter.addTestStepLog("Select the gender"+gendername);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}
	
	@And("^user enter mobile number \"([^\"]*)\"$")
	public static void user_enter_mobile_number(String emailidname) throws IOException {
		emailText(enterEmail, emailidname);
		ExtentCucumberAdapter.addTestStepLog("Enter the mobile number"+emailidname);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}

	@And("^user enter password \"([^\"]*)\"$")
	public static void user_enter_password(String passwordname) throws IOException {
		passwordText(enterPassword, passwordname);
		ExtentCucumberAdapter.addTestStepLog("Enter the password"+passwordname);
		ExtentCucumberAdapter.addTestStepScreenCaptureFromPath(Signupgeneric.takeCaptureScreenshot());
	}


	@And("user clicks on sign up")
	public static void user_clicks_on_sign_up() {
		clickSignup(signupClick);
	}
	
	@Then("close the browser")
	public static void close_the_browser()
	{
		browser_Close();
	}
}
