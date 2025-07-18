package GenericMethodPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePages.loginBaseC;

public class loginGeneric extends loginBaseC{

	public static void JavascriptExecutor_click(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		  js.executeScript("arguments[0].click();", ele);
	}

	public static void Explictwait_clickable(WebElement ele, int timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));

		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public static String captureScreenShot() throws IOException 
	{
		
		TakesScreenshot tc=(TakesScreenshot)loginBaseC.driver;
		//we are Takescreenshot as interface and converting driver as TakesScreenshot.
			
		File scrfile=tc.getScreenshotAs(OutputType.FILE);
			
		
		File destfile=new File("E:\\SS\\"+"ScreenCaptue"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(scrfile, destfile);
		
		
		return destfile.getAbsolutePath();
	}
	
	public static void options(WebElement ele) {
		Select selectDropdown = new Select(ele);
		List<WebElement> alloptions = selectDropdown.getOptions();
		
		for(WebElement e : alloptions) {
			System.out.println(e.getText());
		}
	}
	
	public static void clickdropdown() {
		
	}
	
}
