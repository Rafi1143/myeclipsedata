package practise1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trademe1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://trademe.co.nz");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LoginLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("page_email")).sendKeys("Testing1");
		driver.findElement(By.id("page_password")).sendKeys("Testing2");
		driver.findElement(By.id("PageRememberMe")).click();
	//	TakesScreenshot ts=(TakesScreenshot)driver;
	//	File source=ts.getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(source, new File("./Screenshots/trademelogin.png"));
	//	System.out.println("Screenshot taken");
		driver.findElement(By.id("LoginPageButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("LoginDetails_EmailAddressTextBox")).sendKeys("Testing@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("LoginDetails_EmailAddressTextBox")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("LoginDetails_EmailAddressTextBox")).sendKeys("Testing1@gmail.com");
		
		driver.findElement(By.id("ContactDetails_GenderMale")).click();
	}

}
