package RunningThroughXML_part2_Grouping;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

// Grouping of methods.
// In this we group method according to functionality or according to test process i.e regression or sanity.

//first we run the group which include sanity. Method 1,2,3,4 we execute. Method 4 because it contain sanity and also regression group tag.


//Then we create the second test under the xml file and provide the tag regression and run it again method 5,6  and 4 execute



// We have also use the before group method and after group method.


public class Group {
	
	

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This method will execute before all the test method");
	}
	
	@BeforeClass
	public void AfterClass()
	{
		System.out.println("This method will execute After all the test method");
	}
	
	
	
	@BeforeGroups(groups ={"Sanity"})
	public void beforegroup()
	{
		System.out.println("This method will execute before all the method will include group as sanity");
	}

	
	@AfterGroups(groups ={"Sanity"})
	public void AfterGroup()
	{
		System.out.println("This method will execute after all the method will include group as sanity");
	}
	
	@Test(groups = {"Sanity"} , priority =1)
	public void method1()
	{
		System.out.println("This come under sanity test method 1");
	}
	
	@Test (groups = {"Sanity"}, priority =2)
	public void method2()
	{
		System.out.println("This come under sanity test method 2");
	}
	
	@Test (groups ={"Sanity"}, priority=3)
	public void method3()
	{
		System.out.println("This come under sanity test method 3");
	}
	


	@Test(groups ={"Sanity", "Regression"}, priority =6)
	public void method4 ()
	{
		System.out.println("This come under regression and sanity  test method 4");
	}
	
	@Test(groups ={"Regression"}, priority =4)
	public void method5()
	{
		System.out.println("This come under regression  test method 5");
	}
	
	@Test(groups ={"Regression"}, priority =5)
	public void method6()
	{
		System.out.println("This come under regression  test method 6");
	}
}
