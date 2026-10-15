package org.wipro.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalendarDemo 
{
	@Test
	public void calendar_icon() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch the browser
		
		driver.get("https://www.agoda.com/");  //pass the url
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[data-selenium='checkInBox']")).click();
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-10-03']")).click();
		
		driver.findElement(By.cssSelector("[data-selenium-date='2026-10-04']")).click();
	}
	
	
	public void calendar_text() throws Exception
	{
		
		WebDriver driver = new ChromeDriver();  //launch the browser
		
		driver.get("https://practice-automation.com/calendars/");  //pass the url
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'selectorenteradate')]")).sendKeys("2010-04-02");
		
		driver.findElement(By.xpath("//button[contains(@aria-label,'Fri Apr 02 2010')]")).click();
		
	}
	
	
	
}
