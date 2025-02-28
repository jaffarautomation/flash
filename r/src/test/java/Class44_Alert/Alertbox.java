package Class44_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*In some application, while submitting a form or for confirmation a window comes that window known as Alert.Today we will talk about how we can handle alert in Selenium Webdriver using Alert Interface and using different methods.*/

// alert box contain only ok button with text message

//Confirm box contain ok and cancel buttonwith text message


public class Alertbox {

	@Test
	public void alert(){
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	// Start browser
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
	
	
	//Click on alert box button
	driver.findElement(By.xpath("//*[@id='alert']")).click();
	
	//switch to alert method 
	Alert value = driver.switchTo().alert();
	
	// printing the text message from alert box
	String text =value.getText();
	System.out.println(text);
	
	//below code will click on ok button
	value.accept();
	
	
	
	
}}
