package practise1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Westpac extends Bankslogin {

	public static void main(String[] args) throws Exception {
		
		Westpac Test4=new Westpac();
		Test4.launchbrowser();
		Test4.Westpaclogin();
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		Actions builder= new Actions(driver);
		WebElement menu=driver.findElement(By.linkText("Everyday money"));
		builder.moveToElement(menu).build().perform();
		
		WebElement menu1=driver.findElement(By.linkText("Home loans"));
		builder.moveToElement(menu1).build().perform();
		
		WebElement menu2=driver.findElement(By.linkText("Credit cards"));
		builder.moveToElement(menu2).build().perform();
		
		WebElement menu3=driver.findElement(By.linkText("Investments"));
		builder.moveToElement(menu3).build().perform();
		
		

	}

}
