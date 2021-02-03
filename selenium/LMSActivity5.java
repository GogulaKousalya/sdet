package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMSActivity5 {
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
   
    String MyAccounttitle = driver.getTitle();
    System.out.println("Title is :" + MyAccounttitle);
    Assert.assertEquals(MyAccounttitle, "My Account – Alchemy LMS");
}
@AfterMethod
public void afterMethod() {
    
    driver.quit();
	
  }

}
