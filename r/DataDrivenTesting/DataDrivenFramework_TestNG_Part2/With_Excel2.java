package DataDrivenFramework_TestNG_Part2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDrivenFramework_part1.Lib;

public class With_Excel2 {

	
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
			 
			 
			 Assert.assertTrue(driver.getTitle().contains("G"), "unable to login");
			 
			 System.out.println("Successfully login");
			 
		
		
	}
	
	@AfterMethod
	public void quit()
	{
		
		driver.quit();
	}
	
	@DataProvider(name = "GC reddy site")
	public Object[][] data1 () throws Throwable
	{
		
		Lib exceldata = new Lib ("F:\\Selenium\\Excel file\\Data.xlsx");
		
		int row =exceldata.getrowcount(0);
		
		
		
		String[][] data = new String [row][2] ;		 // defining of array
	
		
        for(int i=0; i<row;i++)
        {
        	data[i][0]= exceldata.getdata(0, i, 0);
        	data[i][1]= exceldata.getdata(0, i, 1);
        	
        }
        
		return data;
		
	}
	
}
