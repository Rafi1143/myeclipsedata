package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seek.co.nz");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Testing");
		driver.findElement(By.id("lastName")).sendKeys("Testing1");
		driver.findElement(By.id("email")).sendKeys("testing@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing123");
		
		driver.findElement(By.partialLinkText("Register")).click();
		
		
	}

}
