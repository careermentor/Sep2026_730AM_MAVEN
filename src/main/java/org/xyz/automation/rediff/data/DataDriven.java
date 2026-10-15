package org.xyz.automation.rediff.data;

import org.testng.annotations.DataProvider;

public class DataDriven {

	

	@DataProvider(name="login")
	public Object[][] login_data()
	{
		//Object[] data1 = {"testuser1","testuser2","testuser3"};   //1-d array
		
		Object[][] data = {{"testuser1","pass1"},{"testuser2","pass2"},{"testuser3","pass3"}};   //2-d array
		
		return data;
	}
	
	@DataProvider(name="search")
	public Object[] search_data()
	{
		Object[] data = {"nike","adidas","puma"};   //1-d array
		
		//Object[][] data = {{"testuser1","pass1"},{"testuser2","pass2"},{"testuser3","pass3"}};   //2-d array
		
		return data;
	}
	
	
}
