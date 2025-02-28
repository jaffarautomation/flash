package DataDrivenFramework_TestNG_Part2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without_Excel {

	
	WebDriver driver;
	
	@Test  (dataProvider = "GC reddy site")
	public void loginpress(String username, String password) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
			 driver = new ChromeDriver();
			 
			 driver.get("http://www.gcrit.com/build3/login.php");
			 
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
			 driver.findElement(By.name("email_address")).sendKeys(username);
			 
			 driver.findElement(By.name("password")).sendKeys(password);
			 driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text")).click();
			 
			
			 
			 Thread.sleep(3000);
			 
			 
			 Assert.assertTrue(driver.getCurrentUrl().matches("http://www.gcrit.com/build3/account.php"), "unable to login");
			 
			 System.out.println("Successfully login");
			 
		
		
	}
	
	@AfterMethod
	public void quit()
	{
		
		driver.quit();
	}
	
	@DataProvider(name = "GC reddy site")
	public Object[][] data1 ()
	{
		
		
		Object[][] data ; // Declaration of array
		
		data= new Object [3][2] ;		 // defining of array
	
		
		data [0][0] = "johnnybaba1@gmail.com";
        data [0][1] = "pass";
        
        data [1][0] = "johnnybaba2@gmail.com";
        data [1][1] = "pass";
        
        data [2][0] = "johnnybaba@gmail.com";
        data [2][1] = "johnnybaba";
        
        
		return data;
		
	}
	
}
