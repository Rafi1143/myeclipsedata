package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodPractise {

	public static WebDriver driver;
	
	//launch broswer
	public void launchbroswer(){
		driver=new FirefoxDriver();
		
	}
	
	//facebook with username and password
	public void facebookwithusername() throws Exception{
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Testing");
		driver.findElement(By.id("pass")).sendKeys("testing2");
	}
	
	//facebookwithout username
	   public void facebookwithoutusername(String username, String password){
		   driver.get("https://www.facebook.com/");
		   driver.findElement(By.id("email")).sendKeys(username);
		   driver.findElement(By.id("pass")).sendKeys(password);
	   }
	   //trademe register
	     public void trademe () throws Exception {
	    	 driver.get("https://trademe.co.nz");
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//a[@href='/Members/Register.aspx']")).click();
	     }
	   
	
	   //close broswer
	   public void closebrower(){
		  if(!driver.toString().contains("null")){
			  driver.close();
		  }
		   
	   }
	
	
	public static void main(String[] args) throws Exception {
		
		MethodPractise test=new MethodPractise();
		test.launchbroswer();
		test.facebookwithusername();
		test.closebrower();
		test.launchbroswer();
		test.facebookwithoutusername("test", "testin1");
		test.closebrower();
		test.launchbroswer();
		test.trademe();
		

	}

}
