package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registrations {

	public static WebDriver driver;
	
	//launch browser
	public void launchbrowswer() {
		driver = new FirefoxDriver();
	}
	 
	//trademe
	public void trademe() throws Exception{
		driver.get("https://trademe.co.nz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/Members/Register.aspx']")).click();
	}
	
	//AA insurance
	public void AAinsurance() throws Exception{
		driver.get("https://www.aainsurance.co.nz/");
		Thread.sleep(2000);
		driver.get("https://online.aainsurance.co.nz/usermgmt/public/aainz/register");
		}
   //NZQA 
	public void NZQA(){
		driver.get("http://www.nzqa.govt.nz/");
		driver.findElement(By.id("bannLogin")).click();
	}
		
	//IRD 
	 public void ird() 
	 {
		 driver.get("https://www.ird.govt.nz/");
		 driver.findElement(By.id("login")).click();
		 
	 
	}
	//close browser
	public void closebrowser(){
		if(!driver.toString().contains("null"))
		{
			driver.close();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		
	Registrations Test= new Registrations();
	Test.launchbrowswer();
	Test.trademe();
	Test.closebrowser();
	Test.launchbrowswer();
	Test.AAinsurance();
	Test.closebrowser();
	Test.launchbrowswer();
	Test.NZQA();
	Test.closebrowser();
	Test.launchbrowswer();
	Test.ird();
	Test.closebrowser();
		
		

	}

}
