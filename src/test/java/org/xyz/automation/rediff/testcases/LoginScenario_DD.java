package org.xyz.automation.rediff.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xyz.automation.rediff.base.InititieBrowser;
import org.xyz.automation.rediff.data.DataDriven;
import org.xyz.automation.rediff.pages.LoginPage;

public class LoginScenario_DD extends InititieBrowser
{

	//wd (parent class) - global variable
	
	@Test(dataProvider="login",dataProviderClass=DataDriven.class)
	public void tc01_login_functionality_valid_credentils(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username_textbox(username);
		login.enter_password_textbox(password);
		login.click_rememberme_checkbox();
		login.click_loginbttn_button();
		
		
	}
	
	
}
