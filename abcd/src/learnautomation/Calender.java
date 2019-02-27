package learnautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		
		// Static approach 
		//driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[3]")).click();
		
		//Dynamic Approach 
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='rbcal_txtReturnCalendar']/table[1]//td")) ;   
		
		int total_node=dates.size();
		
		for(int i=0;i<total_node;i++)
		{
			String date=dates.get(i).getText();
			if(date.equals("31")){
				dates.get(i).click();
				break;
			}
		}
		

	}

}
