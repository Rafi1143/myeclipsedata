package practise1;

import org.openqa.selenium.By;

public class Testcase1 extends MethodPractise {

	public static void main(String[] args) throws Exception {
		Testcase1 test2= new Testcase1();
		test2.launchbroswer();
		test2.trademe();
		Thread.sleep(2000);
		
		driver.findElement(By.id("LoginDetails_EmailAddressTextBox")).sendKeys("Testing");
		
		

	}

}
