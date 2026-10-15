package org.wipro.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowserControl 
{

	@Test
	public void login_functionlaity_chrome() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch the browser
		
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //pass the url
		
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).clear();
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("David");
		
		WebElement month = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		
		Select dob_month = new Select(month);
		
		dob_month.selectByContainsVisibleText("SE"); //SEP
		dob_month.selectByVisibleText("MAY");
		dob_month.selectByIndex(6); //JUNE
		dob_month.selectByValue("08"); //AUG
		
		//dob_month.deselectAll();
		
		/*
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		*/
		
	}
	
	
	
}
