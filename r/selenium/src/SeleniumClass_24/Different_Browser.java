package SeleniumClass_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Different_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// passing values from one browser to another.
		System.setProperty("webdriver.ie.driver","F:\\Selenium\\IEDriverServer.exe");
System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String text = driver.findElement(By.className("gb_d")).getText();
		
		System.out.println(text);
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver = new InternetExplorerDriver();
		driver.get("http://www.gcrit.com/build3/create_account.php");
		driver.findElement(By.name("firstname")).sendKeys(text);
		
		
		
	}

}
