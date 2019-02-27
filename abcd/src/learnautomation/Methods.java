package learnautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
	public static WebDriver driver;
	
	//launch browser
	public void launchbrowser(){
		driver=new FirefoxDriver();
	}
	
	//facebook login 
	 
	public void facebook() throws Exception{
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Testing");
		driver.findElement(By.id("pass")).sendKeys("testing");
		
		}
	
	public void trademe() throws Exception {
		driver.get("https://trademe.co.nz");
		Thread.sleep(2000);
		driver.findElement(By.id("LoginLink")).click();
		}
	public void trademeregister() throws Exception{
		driver.get("https://tradem.co.nz");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("LoginDetails_EmailAddressTextBox")).sendKeys("Testing1");
		
	}
	//close browser
	public void closebrowser(){
		if(!driver.toString().contains("null")){
			driver.close();
		}
	}
	

	public static void main(String[] args) throws Exception {
		Methods obj= new Methods();
		obj.launchbrowser();
		obj.facebook();
		obj.closebrowser();
		obj.launchbrowser();
		obj.trademe();
		obj.closebrowser();
		obj.launchbrowser();
		obj.trademeregister();
		obj.closebrowser();
		

	}

}
