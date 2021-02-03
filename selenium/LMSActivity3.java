package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMSActivity3 {
WebDriver driver;
    
    @BeforeMethod
    public void BC() {
       
    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GogulaKousalya\\Downloads\\3. IBM  Work files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void Testcase() {
       
        String title=driver.getTitle();
        System.out.println(title);
        String FirstBoxinfo = driver.findElement(By.xpath("//div[@class='uagb-ifb-title-wrap']//h3[@class='uagb-ifb-title']")).getText();
        System.out.println("FirstBox is :" + FirstBoxinfo);
         Assert.assertEquals(FirstBoxinfo,"Actionable Training");
   
    }
    @AfterMethod
    public void afterMethod() {
        
        driver.quit();
}
}