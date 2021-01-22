package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMSActivity4 {
   WebDriver driver;

@BeforeMethod
public void BC() {
    
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GogulaKousalya\\Downloads\\3. IBM  Work files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/lms");
	
}
@Test
public void Test1()
{
	
String Title=driver.getTitle();
System.out.println(Title);
String course=driver.findElement(By.xpath("//*[@id='post-71']//div[2]//h3")).getText();
System.out.println("secondmostpopularcourse is :"  +  course );

Assert.assertEquals(course, "Email Marketing Strategies");



}

@AfterMethod
public void AC()
{
	driver.quit();
	}

}