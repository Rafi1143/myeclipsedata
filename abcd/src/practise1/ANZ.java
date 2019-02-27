package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ANZ extends Bankslogin{

	public static void main(String[] args) throws InterruptedException {
		
		ANZ Test1=new ANZ();
		Test1.launchbrowser();
		Test1.anzlogin();
		//Test1.closebrowser();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Register'][@href='javascript:void(0);']")).click();
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(2000);
		
		driver.findElement(By.id("customer-number")).sendKeys("Raj");
		driver.findElement(By.id("full-name")).sendKeys("Rahul");
		driver.findElement(By.id("email-address")).sendKeys("Raj@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Thammana");
		driver.findElement(By.id("confirm-password")).sendKeys("Thammana");
		driver.findElement(By.id("terms-accepted")).click();
		driver.findElement(By.id("submit")).click();
		driver.close();

	}

}
