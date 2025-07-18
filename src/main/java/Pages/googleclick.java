package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePages.loginBaseC;
import GenericMethodPage.loginGeneric;

public class googleclick extends loginBaseC{

	public static By search = By.xpath("//textarea[@class='gLFyf']");
	public static By selecttesting = By.xpath("//span[text()='testing']//b[text()=' jobs']");
	
	public static void googlesearch(By search, String text) {
		WebElement web = driver.findElement(search);
		loginGeneric.options(web);
	}
}
