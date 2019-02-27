package practise1;

import org.openqa.selenium.By;

public class BNZ extends Bankslogin {

	public static void main(String[] args) throws Exception {
		
		BNZ Test2= new BNZ();
		Test2.launchbrowser();
		Test2.bnzlogin();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/login/registration']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("register")).click();
		
		driver.findElement(By.id("RegisterForm:surname")).sendKeys("Rana");
		driver.findElement(By.id("RegisterForm:accessNumber")).sendKeys("526586");
		driver.findElement(By.id("RegisterForm:pin")).sendKeys("98689");
		driver.findElement(By.id("RegisterForm:newPassword")).sendKeys("Nani1234");
		driver.findElement(By.id("RegisterForm:confirmPassword")).sendKeys("Nani1234");
		driver.findElement(By.id("RegisterForm:acceptedTerms")).click();
		driver.findElement(By.id("RegisterForm:submit")).click();
		

	}

}
