package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver =new FirefoxDriver();
	driver.get("https://www.westpac.co.nz");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	
	
	}

}
