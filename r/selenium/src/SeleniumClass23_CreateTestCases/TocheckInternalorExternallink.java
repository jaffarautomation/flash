package SeleniumClass23_CreateTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocheckInternalorExternallink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//To verify the external and internal link 
		
		/*WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		
		driver.findElement(By.linkText("Create account")).click();
	String url =	driver.getCurrentUrl();
	
	if(url.contains("wikipedia"))
	{
		System.out.println("Internal link");
	}
	else{
			System.out.println("External link ");}
	
	driver.navigate().back();
	//driver.findElement(By.cssSelector("//*[@id="mw-content-text"]/div/table[2]/tbody/tr[5]/td/div/ul/li/spa#mw-content-text > div > table.infobox.vevent > tbody > tr:nth-child(5) > td > div > ul > li > span > an/a").click();
	
	url =driver.getCurrentUrl();
	if(url.contains("wikipedia"))
	{
		System.out.println("Internal link");
	}
	else{
			System.out.println("External link ");}
	*/
		
		
	// to verify the gmail link existence and enabled in google home page 
	// method A
		
	/*WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.google.co.in/");
	boolean value = driver1.findElement(By.linkText("Gmail")).isDisplayed();
	

	if( value == true)
	{
		System.out.println("Gmail is dispalyed");
	}
	
	else {
		
		System.out.println("Gmail is not displayed");
	}

	
	if( driver1.findElement(By.linkText("Gmail")).isDisplayed())
	{
		System.out.println(" gamil is displayed ");
	}
	
	else  {
		System.out.println("failed");
		}
	
	if( driver1.findElement(By.linkText("Gmail")).isEnabled())
	
		{System.out.println("Enabled");
	}
	else
	{System.out.println("disabled");
	}*/
	
	// Method B with try and catch 
	//Whenever you want to verify element use try and catch as a good practice
	
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://www.google.co.in/");
	//boolean value = driver2.findElement(By.linkText("yahoo")).isDisplayed();
	

	try {
	if( driver2.findElement(By.linkText("yahoo")).isDisplayed())
	{
		System.out.println("Gmail is dispalyed");
	}}
	
	catch (NoSuchElementException e) 
	{
		
		System.out.println("Gmail is not displayed");
	}
	
	
}}
