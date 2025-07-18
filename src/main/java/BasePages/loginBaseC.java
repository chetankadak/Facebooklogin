package BasePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginBaseC {

	public static String browser="chrome";
	public static String URL="https://en-gb.facebook.com/reg";                  //https://fb.com //https://en-gb.facebook.com/reg/
	public static WebDriver driver;
//https://www.google.com/
	public static void browserInitzation(String browser,String URL)
	{
		switch(browser)
		{
		case "chrome":
			 WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			 driver.get(URL);
			 break;
			 
		case "IE":
			 WebDriverManager.iedriver().setup();
			 driver= new InternetExplorerDriver();
			 break;	
		
		}
		
	}
		
	public static void browser_Close()
	{
		driver.close();
	}
	public static void main(String[] args)
	{

	}
}
