package Activity1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

public class LMSActivity8 {
	WebDriver driver;
@BeforeMethod
public void BC()
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GogulaKousalya\\Downloads\\3. IBM  Work files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms");
	
}
@Test
public void Test() throws InterruptedException
{
	  
    String title = driver.getTitle();
   
    System.out.println(title);
    driver.findElement(By.xpath("//*[@id='menu-item-1506']//a")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'wpforms-8-field_0\']")).sendKeys("Gogula");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'wpforms-8-field_1\']")).sendKeys("abc.com@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'wpforms-8-field_3\']")).sendKeys("LMS-Alchemy");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'wpforms-8-field_2\']")).sendKeys("Test");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\'wpforms-submit-8\']")).click();
  
    String message=driver.findElement(By.xpath("//*[@id='uagb-column-3c1a3492-d74d-4e1e-b35b-69d0e288d4ca']")).getText();
    System.out.println("Submitted Request: " +  message);
    Assert.assertEquals(message, "Thanks for contacting us! We will be in touch with you shortly.");
    }


	@AfterMethod
 public void afterMethod() {
     //Close the browser
     driver.quit();
 }
}