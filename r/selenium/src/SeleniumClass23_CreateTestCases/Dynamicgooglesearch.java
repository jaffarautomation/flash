package SeleniumClass23_CreateTestCases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicgooglesearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			

			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			
			
			WebElement t = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input"));
			
		t.sendKeys("tet");
			Thread.sleep(3000);
			
			List<WebElement>r = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
				int y =r.size();
				System.out.println("No of suggestion is " + y);
				
				for (int i=0; i<y; i++)
				{
					String p = r.get(i).getText();
					System.out.println(p);
					if(p.contains("tet exam"));
					{
					       r.get(i).click();
					       break;
					}
					
				}
			
			
			
			
		
				
				
				
				
				//InvalidSelectorException
			
	}

}
