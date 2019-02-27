package learnautomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("rafi");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screeenshots/facebook1.png"));
		System.out.println("Screenshot taken");
		

	}

}
