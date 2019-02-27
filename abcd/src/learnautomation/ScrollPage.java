package learnautomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//je.executeScript("scroll(0,400)") - this will scroll down
		//je.executeScript("scroll(400,0)") - this will scroll up

		WebDriver driver= new FirefoxDriver();
		driver.get("https://anz.co.nz");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("scroll(400,0)");
	}

}
