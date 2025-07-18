package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePages.loginBaseC;
import GenericMethodPage.Signupgeneric;

public class signupPage extends loginBaseC{

	//public static By createaccountclick = By.xpath("//a[text()='Create new account']");
	public static By enterFirstname = By.name("firstname");
	public static By enterlastname = By.name("lastname");
	public static By Dayenter = By.name("birthday_day");
	public static By Monthenter = By.name("birthday_month");
	public static By Yearenter = By.name("birthday_year");
	public static By gender = By.id("sex");
	public static By custom = By.xpath("//label[text()='Custom']//input");
	public static By customtext = By.xpath("//select[@name='preferred_pronoun']//option");
	public static By customgender = By.xpath("//select[@name='preferred_pronoun']");
	public static By enterEmail = By.name("reg_email__");
	public static By enterPassword = By.name("reg_passwd__");
	public static By signupClick = By.name("websubmit");
	
//	public static void createAccountSignup(By createaccountclick) {
//		WebElement ele = driver.findElement(createaccountclick);
//		Signupgeneric.JavascriptExecutor_click(ele);
//	}
	
	public static void firstNameText(By enterFirstname, String firstname) {
		driver.findElement(enterFirstname).sendKeys(firstname);
	}
	
	public static void lastNameText(By enterlastname, String lastname) {
		driver.findElement(enterlastname).sendKeys(lastname);
	}
	
	public static void dayText(By Dayenter, String birthday) {
		WebElement ele = driver.findElement(Dayenter);
		Signupgeneric.gendropdown(ele, birthday);
	}
	
	public static void monthText(By Monthenter, String birthmonth) {
		WebElement ele = driver.findElement(Monthenter);
		Signupgeneric.gendropdown(ele, birthmonth);
	}
	
	public static void yearText(By Yearenter, String birthyear) {
		WebElement ele = driver.findElement(Yearenter);
		Signupgeneric.gendropdown(ele, birthyear);
	}
	
	public static void selectGender(By gender, String name) {
		Signupgeneric.genRadio(gender, name);
	}
	
	public static void customChecked(By custom, String check) {
		Signupgeneric.genRadio(custom, check);
	}
	
	public static void textdropdown(By customtext, String wish) {
		WebElement ele = driver.findElement(customtext);
		Signupgeneric.gendropdown(ele, wish);
	}
	
	public static void customgendercheck(By customgender, String wish) {
		WebElement ele = driver.findElement(customgender);
		Signupgeneric.gendropdown(ele, wish);
	}
	
	public static void emailText(By enterEmail, String name) {
		driver.findElement(enterEmail).sendKeys(name);
	}
	
	public static void passwordText(By enterPassword, String name) {
		driver.findElement(enterPassword).sendKeys(name);
	}
	
	public static void clickSignup(By signupClick) {
		WebElement ele = driver.findElement(signupClick);
		Signupgeneric.JavascriptExecutor_click(ele);
	}
}
