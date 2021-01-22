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

public class LMSActivity7 {
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
    driver.findElement(By.xpath("//*[@id='menu-item-1508']//a")).click();
    List<WebElement> Listofcoursesavailable=driver.findElements(By.xpath("//*[@class='caption']/h3"));
    System.out.println("No of courses:"+ Listofcoursesavailable.size());
   
    for (WebElement courses : Listofcoursesavailable) {
        System.out.println(courses.getText());
    }
     
    }


	@AfterMethod
 public void afterMethod() {
     //Close the browser
     driver.quit();
 }
}