package SeleniumClass23_CreateTestCases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyCustomerCanRegisterSuccessfully {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	//	To verify the User can register successfully

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.gcrit.com/build3/create_account.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#bodyContent > form > div > div:nth-child(2) > table > tbody > tr:nth-child(1) > td.fieldValue > input[type=radio]:nth-child(1)")).click();
		
		//Enter first name
		WebElement name =driver.findElement(By.cssSelector("#bodyContent > form > div > div:nth-child(2) > table > tbody > tr:nth-child(2) > td.fieldValue > input[type=text]"));
			name.click();
			name.sendKeys("maha purush");
	// Enter last name
			WebElement lastname =driver.findElement(By.cssSelector("#bodyContent > form > div > div:nth-child(2) > table > tbody > tr:nth-child(3) > td.fieldValue > input[type=text]"));
			lastname.click();
			lastname.sendKeys("johnny sins");
			
			//Enter the date
			WebElement Date =driver.findElement(By.name("dob"));
			
			//Date.click();
			Date.sendKeys("02/05/1746");
			lastname.click();
			name.click();
			Thread.sleep(5000);
			
			//Enter email
			WebElement Email =driver.findElement(By.name("email_address"));
			Email.sendKeys("johnnybaba@gmail.com");
			
			//Enter address
			WebElement Add =driver.findElement(By.name("street_address"));
			Add.click();
			Add.sendKeys("bhok mai jaa");
			
			//Enter pincode
			WebElement pincode =driver.findElement(By.name("postcode"));
			pincode.click();
			pincode.sendKeys("420420");
			
			//Enter city
			WebElement city =driver.findElement(By.name("city"));
			city.click();
			city.sendKeys("trump city");
			
			//Enter state
			WebElement state =driver.findElement(By.name("state"));
			state.click();
			state.sendKeys("bihar");
			
			//To select the countryfrom dropdown
			WebElement country =driver.findElement(By.name("country"));
					Select dropdown = new Select(country);
			dropdown.selectByVisibleText("Cuba");
			
			
			//To print the all element in dropdown list
			List<WebElement> size =dropdown.getOptions();
			int i =size.size();
			
			System.out.println("No of element in Drop down are = " +  i);
			
			for (WebElement Names : size) {
				
				String value=Names.getText();
				System.out.println(value);
			}
			
			//To enter the telephone no
			
			WebElement telephone =driver.findElement(By.name("telephone"));
			telephone.sendKeys("8456789215");
			
			WebElement password =driver.findElement(By.name("password"));
			password.sendKeys("johnnybaba");
			
			WebElement Cpassword =driver.findElement(By.name("confirmation"));
			Cpassword.sendKeys("johnnybaba");
			

			WebElement Continue =driver.findElement(By.cssSelector("#tdb4 > span.ui-button-text"));
			Continue.click();
			
			String CurrentURL = driver.getCurrentUrl();
			if (CurrentURL.equals("http://www.gcrit.com/build3/create_account_success.php"))
			{
				
				System.out.println("User is navigate to confirmation page");
			}
			else
			{
			
				System.out.println("Please fill all the required value");			}

			WebElement textarea = driver.findElement(By.cssSelector("#bodyContent > h1"));
			String verificationMessage = textarea.getText();
			
			if(verificationMessage.equals("Your Account Has Been Created!"))
			{
				
				System.out.println("User account has created successfully");
			}
			else
			{
				System.out.println("Error occures while creating an account");
			}
			
			
			//To check login successful is next step in other class
	}

}
