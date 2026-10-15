package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestScenario4
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase - step1");
		
		Assert.assertEquals("TestNG", "TestNG");
		
		System.out.println("second_testcase - step2");
		
		Assert.assertEquals("TestNG", "Testing");  //failed
		
		System.out.println("second_testcase - step3");
		
		Assert.assertEquals("TestNG", "Testing");
	}
	
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
		
		Assert.assertEquals("TestNG", "Testing");
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
