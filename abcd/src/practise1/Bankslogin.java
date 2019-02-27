package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bankslogin{
	public static WebDriver driver;
	
//launch browser
	public void launchbrowser () {
		driver= new FirefoxDriver();
}
// anz
	public void anzlogin()
	{
		driver.get("https://anz.co.nz");
		driver.findElement(By.xpath("//div[@id='submitlogin']")).click();
		driver.findElement(By.id("user-id")).sendKeys("TestingANZ");
		driver.findElement(By.id("password")).sendKeys("Testingpass");
		driver.findElement(By.id("submit")).click();
		   String url=driver.getCurrentUrl();
		   System.out.println(url);
		     if(url.contains("https://secure.anz.co.nz/IBCS/service/home"))
			    {
				  System.out.println("login successfull");
				}
		   else {
		    	  System.out.println("Login failed");		   
		    	}
	}
				
			
//bnz 
	public void bnzlogin() throws Exception
	{
		driver.get("https://bnz.co.nz");
		driver.findElement(By.xpath("//a[@class='header_button header_button-login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Personal")).click();
		driver.findElement(By.id("accessid")).sendKeys("TestingBNZ");
		driver.findElement(By.id("password")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@class='submit submit-block submit-large']")).click();
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
           if(url2.equals("https://www.bnz.co.nz/ib/app/flow/login?execution=e1s1"))
              {
        	   System.out.println("login successfull");
        	   }
           else {
        	   System.out.println("login failed");
        	  }
     }

// Westpac
	public void Westpaclogin() throws Exception
	{
		driver.get("https://westpac.co.nz");
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='login-box-ps']/div/span/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-username")).sendKeys("324528859");
		driver.findElement(By.id("login-password")).sendKeys("fatima.0511");
		driver.findElement(By.id("action-login")).click();
		String url3=driver.getCurrentUrl();
		System.out.println(url3);
		
		if(url3.equals("https://bank.westpac.co.nz/one/app.html#accounts"))
		  {
			System.out.println("login successfull");
		  }
		else 
		  {
			System.out.println("login failed");
		  }
	}
		
		
         
//kiwi bank
	public void kiwibanklogin() throws Exception
	{
		driver.get("https://kiwibank.co.nz");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='u-current-link icon-text--rev nav-primary__link'][@href='http://www.ib.kiwibank.co.nz/']")).click();
		driver.findElement(By.id("ctl00_c_txtUserName")).sendKeys("Testingkiwibank");
		driver.findElement(By.id("ctl00_c_txtPassword")).sendKeys("Testing3");
		driver.findElement(By.id("ctl00_c_ProgressFinalSubmit_FinalStepButton")).click();
	}

 // close browser
	public void closebrowser() 
	{
		if(! driver.toString().contains("null"))
		{
    		driver.close();
	    }
	}
	public static void main(String[] args) throws Exception {
		
		Bankslogin test=new Bankslogin ();
		test.launchbrowser();
		test.anzlogin();
		test.closebrowser();
		test.launchbrowser();
		test.bnzlogin();
		test.closebrowser();
	    test.launchbrowser();
		test.kiwibanklogin();
		test.closebrowser();
		test.launchbrowser();
	    test.Westpaclogin();
		test.closebrowser();
		
		
		
	}
}

