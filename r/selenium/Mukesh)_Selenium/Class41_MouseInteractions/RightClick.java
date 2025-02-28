package Class41_MouseInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// Start browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement elment = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		//instantiating the action class
	Actions Action = new Actions(driver);
	
	//Below code will hover the mouse to specified location on web page
	Action.contextClick(elment).perform();
	
	
	}

}
