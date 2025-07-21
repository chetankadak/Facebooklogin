package TestcaseExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\software\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("testing");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='lnnVSe' and @aria-description]"));
		System.out.println(list.size());
		Thread.sleep(3000);
	    for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).getAttribute("aria-label"));
		if("testing jobs".equalsIgnoreCase(list.get(i).getAttribute("aria-label"))) {
		list.get(i).click();
		break;
	}

	}
	}
}
