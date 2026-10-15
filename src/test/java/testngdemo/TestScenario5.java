package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class TestScenario5
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
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("TestNG", "TestNG","this is step1 and get failed");
		
		System.out.println("second_testcase - step2");
		
		sa.assertEquals("TestNG", "Testing","this is step2 and get failed");  //failed
		
		System.out.println("second_testcase - step3");
		
		sa.assertEquals("TestNG", "Testing","this is step3 and get failed");
		
		sa.assertAll();
	}
	
	
	@Test(groups="OctRelease")
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	
	@Test
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
