package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestScenario2
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	
	@Test
	public void register()
	{
		System.out.println("register");
		
		Assert.assertEquals("TestNG", "Testing");
	}
	
	
	@Test(dependsOnMethods="register")
	public void login()
	{
		System.out.println("login");
	}
	
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
	
}
