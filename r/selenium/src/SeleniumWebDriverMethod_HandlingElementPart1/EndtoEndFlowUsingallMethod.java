package SeleniumWebDriverMethod_HandlingElementPart1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndFlowUsingallMethod {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//Handling browser and Edit box in selenium, a complete END to END flow.		
		/*
		driver.get("https://www.facebook.com/");
		String A1=driver.getCurrentUrl();
        System.out.println(A1);
        
       String A2 = driver.getTitle();
       System.out.println(A2);
        
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.google.co.in/");
        A1=driver.getCurrentUrl();
        System.out.println(A1);
        
        driver.navigate().back();  // facebook
        A1=driver.getCurrentUrl();
        System.out.println(A1);
       
        
        driver.navigate().refresh();   //facebook
        A1=driver.getCurrentUrl();
        System.out.println(A1);
        
        // Starting of handling  Edit box
        
       WebElement s1 =  driver.findElement(By.className("inputtext"));
       boolean display =s1.isDisplayed();   // return true
       System.out.println(display);
       
       boolean enabled = s1.isEnabled();   // return true
       System.out.println(enabled);
       
       s1.sendKeys("facebook");  // enter facebook as a value
       
       String text =s1.getText();  // return the value facebook
       System.out.println("return the value from email or phone edit box = " + text);
       
       s1.clear();  // clear the value i.e facebook
       */
  //********************************************************************************************     
        
        // Handling a text area  in selenium 
		
		// a) Below code return the text area of the particular field in gmail page
   /*    
       driver.navigate().to("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        WebElement E1= driver.findElement(By.cssSelector("#headingText > span"));
        String E2 = E1.getText();
        System.out.println(E2);
        
        String E4 = E1.getTagName();
        System.out.println(E4);
        
        // b) Below code capture the error message on gmail page if user click on sign in button without entering the email id
        
          driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
          String geterror = driver.findElement(By.className("GQ8Pzc")).getText();
          System.out.println(geterror);
          */
          
		//RUN A AND B PARALLELY BY REMOVING COMMENTS
          
          // c) capturing window pop up by using Altert interface
          
          
         /* driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
          driver.findElement(By.name("proceed")).click();
          
          Alert alert = driver.switchTo().alert();  // switch to pop up 
          String s1 = alert.getText();
          System.out.println(s1);
          
          Thread.sleep(5000);
          
          alert.accept(); // click on ok button
*/ //******************************************************************************************         
         
          // handling of button
          
          driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
       WebElement G1 = driver.findElement(By.cssSelector("#headingText > span"));
       G1.click();
       System.out.println(G1.isEnabled());
       System.out.println(G1.isDisplayed());
       System.out.println(G1.getAttribute("value"));
       System.out.println(G1.getAttribute("name")); 
       System.out.println(G1.getAttribute("type"));
       
       //Example of getAttribute method :
       
       WebElement G2 =  driver.findElement(By.cssSelector("#identifierId"));
      System.out.println(G2.getAttribute("type"));
      System.out.println(G2.getAttribute("name"));
      System.out.println(G2.getAttribute("autocomplete"));
      System.out.println(G2.getText());
      
      System.out.println(G2.getTagName());
	
        String G3 = G2.getText()	;
        System.out.println(G3);
        
        
	}

}
