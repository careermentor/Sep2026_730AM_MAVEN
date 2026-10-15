package testngdemo;

import org.testng.annotations.Test;



public class TestScenario3
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
	}
	
	
	@Test(enabled=true)
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	
	@Test(groups="Sanity")
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	
	@Test(groups="Regression")
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
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
