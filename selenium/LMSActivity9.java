package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.TestNGException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LMSActivity9 {
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
    driver.findElement(By.xpath("//*[@id='menu-item-1508']//a")).click();
    Thread.sleep(2000);
    String course=driver.findElement(By.xpath("//*[@id='post-71']//div[2]//h3")).getText(); 
    		
    System.out.println("secondmostpopularcourse is :"  +  course );

    Assert.assertEquals(course, "Email Marketing Strategies");
	driver.findElement(By.xpath("//*[@id='post-71']//div[2]//p[2]//a")).click();
	
	if(driver.findElement(By.xpath("//*[@id=\'ld-expand-91\']//div//a//div[1]")).isSelected()) 
	{
	     driver.findElement(By.xpath("//*[@id=\'ld-expand-91\']//div//a//div[1]")).click();
	}

	else
	    System.out.println("Button disabled");
	
	////*[@id="learndash_post_91"]/div/div[3]/div[2]/form/input[4]
}


	@AfterMethod
 public void afterMethod() {
     //Close the browser
    driver.quit();
 }
}