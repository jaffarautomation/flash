package TestNG_Basic_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNG_Case {

	
//Test NG dont contain main method
// We need to write annotation
//TestNG  contain only method with Annotation	
	
@Test
public void VerifyTitle()
{
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.co.in/");
	String title = driver.getTitle();
	Assert.assertEquals("Google", "Google");
	

}

// Report will generate on console
//Separate test report can be generated
//after execution click on selenium project and hit refresh and Test-output folder will pop up
//click on index.html and open with web browser to view report
//You can also download the email and copy the file on desktop

}
