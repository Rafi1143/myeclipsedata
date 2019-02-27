package learnautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadfile {

	public static void main(String[] args) {
		
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		
		WebDriver driver= new FirefoxDriver(profile);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.filehippo.com/download_adobe_reader");
		
		driver.findElement(By.xpath("")).click();
		

	}

}
