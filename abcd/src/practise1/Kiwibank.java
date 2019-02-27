package practise1;

import org.openqa.selenium.By;

public class Kiwibank extends Bankslogin {

	public static void main(String[] args) throws Exception {
		
		Kiwibank Test3=new Kiwibank();
		Test3.launchbrowser();
		Test3.kiwibanklogin();
		
		Thread.sleep(2000);
		
		// driver.findElement(By.linkText("Register for internet banking")).click();
		

	}

}
