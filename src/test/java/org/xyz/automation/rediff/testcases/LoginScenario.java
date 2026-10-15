package org.xyz.automation.rediff.testcases;

import org.testng.annotations.Test;
import org.xyz.automation.rediff.base.InititieBrowser;
import org.xyz.automation.rediff.pages.LoginPage;
import org.xyz.automation.rediff.pages.LoginPage_PF;

public class LoginScenario extends InititieBrowser
{

	//wd (parent class) - global variable
	
	@Test
	public void tc01_login_functionality_valid_credentils() throws Exception
	{
		LoginPage_PF login = new LoginPage_PF(driver);
		
		login.enter_username_textbox("testuser");
		login.enter_password_textbox("vbjsbvkjs");
		login.click_rememberme_checkbox();
		login.click_loginbttn_button();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
	
	
	public void tc02_login_functionality_invalid_password() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username_textbox("testuser");
		login.enter_password_textbox("vbjsbvkjs");
		login.click_rememberme_checkbox();
		login.click_loginbttn_button();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
	
	public void tc03_login_functionality_invalid_username() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username_textbox("testuser");
		login.enter_password_textbox("vbjsbvkjs");
		login.click_rememberme_checkbox();
		login.click_loginbttn_button();
		
		//Cannot invoke "org.openqa.selenium.WebDriver.findElement(org.openqa.selenium.By)" because "this.driver" is null
	}
	
}
