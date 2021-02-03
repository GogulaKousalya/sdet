package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMSActivity6 {
	WebDriver driver;
@BeforeMethod
public void BC()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GogulaKousalya\\Downloads\\3. IBM  Work files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms");
	
}
@Test
public void Test()
{
	  
    String title = driver.getTitle();
   
    System.out.println(title);
    driver.findElement(By.xpath("//*[@id='menu-item-1507']//a")).click();
     driver.findElement(By.xpath("//*[@id='uagb-column-e9d225cb-cee9-4e02-a12d-073d5f051e91']//div[2]//div[2]//a")).click();
     driver.findElement(By.xpath("//*[@id=\'user_login']")).sendKeys("root");
     driver.findElement(By.xpath("//*[@id=\'user_pass']")).sendKeys("pa$$w0rd");
     driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
     String LoggedIn = driver.getTitle();
     System.out.println("Loggedin Title is :" + LoggedIn);
     Assert.assertEquals(LoggedIn, "My Account – Alchemy LMS");
}

	@AfterMethod
 public void afterMethod() {
     //Close the browser
     driver.quit();
 }
}