package TestcaseExecution;

import org.openqa.selenium.By;

import Pages.loginPageCheck;

public class ExecuteTestCase extends loginPageCheck{

	public static void main(String[] args) {
		browserInitzation(loginPageCheck.browser, loginPageCheck.URL);

		Enter_email("chetankadak@gmail.com",EMailInput);
		Enter_password("45511nahkj",EMailpassword);
		Button_login();
		
	}

}
