package org.xyz.automation.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.xyz.automation.rediff.utilties.ReadPropertiesFiles;

public class LoginPage 
{
	WebDriver driver;  //global variable

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_username_textbox(String uname) throws Exception
	{
		//driver.findElement(By.id("login1")).sendKeys("testuser");
		
		driver.findElement(By.id(ReadPropertiesFiles.read_element_data("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropertiesFiles.read_element_data("login_password_name"))).sendKeys(pass);
	}
	
	
	public void click_rememberme_checkbox() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropertiesFiles.read_element_data("login_checkbox_rememberme_css"))).click();
	}
	
	public void click_loginbttn_button() throws Exception
	{
		driver.findElement(By.xpath(ReadPropertiesFiles.read_element_data("login_loginbttn_xpath"))).click();
	}
	
}
