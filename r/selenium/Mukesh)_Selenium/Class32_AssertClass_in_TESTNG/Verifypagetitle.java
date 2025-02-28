package Class32_AssertClass_in_TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


// Verification of page using Assert In testNG
public class Verifypagetitle {

	
	
	@Test
	public void title()
	{
		
System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
String actualtitle=driver.getTitle();

String expectedtitle = "Facebook � log in or sign up";

//Using assert class
//If verification failed it will print the verification failed message and move out from @test method
Assert.assertEquals(actualtitle, expectedtitle, "Verification failed");
System.out.println("Verification successfull");


//Here we are failing the test result, in this verification failed message will print and it will kick out of the method


Assert.assertTrue(actualtitle.contains("john"), "verification failed  inside assert ");
System.out.println("Assertrue verification passed");


//if you dont want to verify the full title, we can use assert true

Assert.assertTrue(actualtitle.contains("Facebook"), "verification passed");
System.out.println("Assertrue verification passed");

	}
	
	
}
