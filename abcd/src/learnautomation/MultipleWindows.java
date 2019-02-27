package learnautomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
    WebDriver driver =new FirefoxDriver();
    
		driver.get("http://seleniumpractise.blogspot.co.nz/");
		
		String Parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + Parent);
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		
		Set <String> allwindows=driver.getWindowHandles();
		
		int count=allwindows.size();
		
		System.out.println("Total windows"+ count);
		
		for(String child:allwindows){
			if(!Parent.equalsIgnoreCase(child)){
				driver.switchTo().window(child);
				//driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
				driver.findElement(By.linkText("Gmail")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
	}

}
