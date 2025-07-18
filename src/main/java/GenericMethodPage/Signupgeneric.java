package GenericMethodPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BasePages.loginBaseC;

public class Signupgeneric extends loginBaseC{

	public static void JavascriptExecutor_click(WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		  js.executeScript("arguments[0].click();", ele);
	}
	
	public static void gendropdown(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	
	public static void genRadio(By gender, String name) {
    List<WebElement> checkedradio = driver.findElements(gender);
        
        for(int i=0; i<=checkedradio.size()-1; i++) {
        	if(name.equals(checkedradio.get(i).getAttribute("value"))) {
        		checkedradio.get(i).click();
        	}
        }
		}
	
	public static String takeCaptureScreenshot() throws IOException {
		TakesScreenshot tc =  (TakesScreenshot)loginBaseC.driver;
		
		File sourcefile = tc.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("E:\\SS\\"+"ScreenCapture"+System.currentTimeMillis()+".png");
		
		FileUtils.copyFile(sourcefile, destinationfile);
		
		return destinationfile.getAbsolutePath();
	}
}