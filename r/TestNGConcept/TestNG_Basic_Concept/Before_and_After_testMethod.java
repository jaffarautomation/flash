package TestNG_Basic_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Before_and_After_testMethod {

	
	//@BeforeTest

	//methods under this annotation will be executed prior to the first test case in the TestNG file.

	//@AfterTest

	//methods under this annotation will be executed after all test cases in the TestNG file are executed.
	
	//The placement of the annotation blocks can be interchanged without affecting the chronological order by which they will be executed.
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
   
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
    	 
    	 System.out.println("In before test");
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
          driver = new ChromeDriver();
          driver.get(baseUrl);
      }
      @Test
      public void verifyHomepageTitle() {
    	  
    	  System.out.println("In test");
          String expectedTitle = "Welcome: Mercury Tours";
          String actualTitle = driver.getTitle();
          Assert.assertEquals(actualTitle, expectedTitle);
     }
      @AfterTest
      public void terminateBrowser(){
    	  System.out.println("In after test");
          driver.close();
      }
	
	
	
	
}
