package org.xyz.automation.rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xyz.automation.rediff.utilties.ReadPropertiesFiles;

public class LoginPage_PF 
{
	WebDriver driver;  //global variable

	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login1")
	WebElement username_textbox;
	
	@FindBy(name="passwd")
	WebElement password_textbox;
	
	@FindBy(css="[type='checkbox']")
	WebElement rememberme_checkbox;
	
	
	@FindBy(xpath="//button[text()='Log In']")
	WebElement loginbttn_button;
	
	
	public void enter_username_textbox(String uname) throws Exception
	{
		//WebElement username_textbox =  driver.findElement(By.id("login1"));
		
		username_textbox.sendKeys(uname);
		
		//driver.findElement(By.id(ReadPropertiesFiles.read_element_data("login_username_id"))).sendKeys(uname);
	}
	
	public void enter_password_textbox(String pass) throws Exception
	{
		password_textbox.sendKeys(pass);
	}
	
	
	public void click_rememberme_checkbox() throws Exception
	{
		rememberme_checkbox.click();
	}
	
	public void click_loginbttn_button() throws Exception
	{
		loginbttn_button.click();
	}
	
}
