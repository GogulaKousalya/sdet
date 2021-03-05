package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
		static WebDriver driver=new FirefoxDriver();
		static WebDriverWait  Wait= new WebDriverWait(driver, 15);
		public static void browserSetup() {
			// TODO Auto-generated method stub
			
		}

}
