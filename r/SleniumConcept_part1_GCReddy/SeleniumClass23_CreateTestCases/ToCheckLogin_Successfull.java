package SeleniumClass23_CreateTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckLogin_Successfull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.gcrit.com/build3/login.php");
			
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=text]")).sendKeys("johnnybaba@gmail.com");
			driver.findElement(By.cssSelector("#bodyContent > div:nth-child(3) > div > form > table > tbody > tr:nth-child(2) > td.fieldValue > input[type=password]")).sendKeys("johnnybaba");
			
			driver.findElement(By.cssSelector("#tdb5 > span.ui-button-text")).click();
			
			String LoginURL = driver.getCurrentUrl();
			if (LoginURL.contains("index.php"))
			{
				
				System.out.println("login successfull");
			}
			else
			{
				System.out.println("Login unsuccessfull");
			}
	
	}

}
