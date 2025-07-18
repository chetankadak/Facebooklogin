package TestcaseExecution;

import org.openqa.selenium.By;

import Pages.signupPage;

public class signupTestCase extends signupPage{

	public static void main(String[] args) {
		browserInitzation(browser, URL);
		
		//createAccountSignup(createaccountclick);
		firstNameText(enterFirstname, "Divyank");
		lastNameText(enterlastname, "kadak");
		dayText(Dayenter, "1");
		monthText(Monthenter, "Jun");
		yearText(Yearenter, "1999");
		selectGender(gender, "2");
		customgendercheck(customgender, "1");
		emailText(enterEmail, "divyank01@gmail.com");
		passwordText(enterPassword, "chugwaug4521");
		clickSignup(signupClick);
	}

}
