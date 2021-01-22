package Activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LMSActivity2 {

	WebDriver driver;
	    
	    @BeforeMethod
	    public void BC() {
	       
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GogulaKousalya\\Downloads\\3. IBM  Work files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	        driver = new FirefoxDriver();
	        driver.get("https://alchemy.hguy.co/lms");
	    }
	    @Test
	    public void Testcase1() {
	    	String title = driver.getTitle();
	        //Print the title of the page
	        System.out.println("Page title is: " + title);
	       String header = driver.findElement(By.className("uagb-ifb-title")).getText();
	        System.out.println("Header is :" + header);
	        Assert.assertEquals(header, "Learn from Industry Experts");
	    }
	    @AfterMethod
	    public void Aftermethod() {
	        
	        driver.quit();
	}
	}



