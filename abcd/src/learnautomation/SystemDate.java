package learnautomation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SystemDate {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
		
		Date date = new Date();
		
		String date1=dateFormat.format(date);
		
		System.out.println("System date is " + date1);

	}

}
