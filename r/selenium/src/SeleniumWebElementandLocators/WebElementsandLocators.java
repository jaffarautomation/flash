package SeleniumWebElementandLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsandLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//navigate to google.com
	//	driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		//Name locator : 
			
		//	driver.findElement(By.name("password")).sendKeys("india");
		
		
		// now in this we are passing the reference of elements through findElements method and again this method return the reference as web elements.
		//So for either of those reasons you need to get the reference of the WebElement which you pass through findElement(By by) and if your search is successful the exact WebElement is returned back. Now you can invoke any of the enlisted methods() on the WebElement as per feasibility as follows :

/*clear()
click()
findElement(By by)
findElements(By by)
getAttribute(java.lang.String name)
getCssValue(java.lang.String propertyName)
getLocation()
getSize()
getTagName()
getText()
isDisplayed()
isEnabled()
isSelected()
sendKeys(java.lang.CharSequence... keysToSend)
submit()
Invoking any of the following methods() wouldn't have been possible if the return type of findElement() had been Boolean (as per your comment update).
*/
		
		// this way is used when you want to perform many operation on same element.
		/*WebElement password =  driver.findElement(By.name("identifier"));
		password.sendKeys("India");
		password.clear();
		
		
		
		System.out.println(password.getSize());
		
		Dimension D= password.getSize();
		System.out.println(D.getWidth());*/
		
		
		//tagname locator :
		// what after the < sign is the tagname
		// if the tagname is same then, first tag tag get the privilage to run first
		//  driver.findElement(By.tagName("input")).sendKeys("india");
		
		  
		  // Link test locator
		  // these locator are visible no need to inspect them, for ex in google.ccom images ,gmail are linktest
		  
		/*  driver.get("https://www.google.co.in/");
		  driver.findElement(By.linkText("Gmail")).click();
		  
		 String s=  driver.getCurrentUrl();
		  
		  if (s.equals("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"))
		  {
			  System.out.println("navigate to different page");
			  
		  }
		  
		  else{System.out.println("Not navigation");}
		  */
		  //Partial Linked test locator 
		  //For ex : if linktest name is Gmail, instead of providing the full name, you can write the half name ex : gmai or gma anything
		  
		  /*driver.get("https://www.google.co.in/");
		  driver.findElement(By.partialLinkText("Gma")).click();
		  
		 String s=  driver.getCurrentUrl();
		  
		  if (s.equals("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"))
		  {
			  System.out.println("navigate to different page");
			  
		  }
		  
		  else{System.out.println("Not navigation");}
		  */
		  // For CSS Selector
		  
		  WebDriver driver1 = new ChromeDriver();
		  driver1.get("https://www.facebook.com/");
		  driver1.findElement(By.cssSelector("#pass")).sendKeys("Inde");

	}

}
