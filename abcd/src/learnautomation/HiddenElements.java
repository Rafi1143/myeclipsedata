package learnautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.co.nz/2016/08/");
		Thread.sleep(5000);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		/*int x=driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("x cord"+x);
		System.out.println("y cord"+y);
		*/

		List<WebElement> radio= driver.findElements(By.id("female"));
		
		int count=radio.size();
		System.out.println("Total radio buttons are "+count);
		
		for(int i=0;i<count;i++)
		{
			int y= radio.get(i).getLocation().getY();
			if(y!=0){
				radio.get(i).click();
				break;
				
			}
		}
		
	}

}
