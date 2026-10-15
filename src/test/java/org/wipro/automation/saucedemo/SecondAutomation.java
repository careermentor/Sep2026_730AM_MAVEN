package org.wipro.automation.saucedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondAutomation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchwebsite()
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		
		
		driver= new ChromeDriver(op);  //launch the browser
		
		driver.get("https://www.rediff.com/");  //pass the url
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		WebElement mail = driver.findElement(By.cssSelector("[data-secid='topnav_mail']"));
		mail.click();
		
		//user should navigate to login page
		
		driver.getTitle(); //to fetch page title 
	
		
	}
	
	@AfterMethod
	public void closewebsite()
	{
		//driver.close();  //will close one window at a time
		
		//driver.quit();  //will close all open windows
	}
	

	@Test(enabled=false)
	public void login_functionlaity_chrome()
	{
		
		//driver.findElement(By.id("login1")).sendKeys("testuder");
		
		WebElement enter_username = driver.findElement(By.id("login1"));
		enter_username.sendKeys("testuder");
		
		driver.findElement(By.name("passwd")).sendKeys("pass1234");
		
		//is checkbox clicked by default
		
		//driver.findElement(By.cssSelector("[type='checkbox']")).isSelected();//true
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[type='checkbox']")), true);
		
		//click to uncheck 
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		Assert.assertEquals(driver.findElement(By.cssSelector("[type='checkbox']")), false);
		
		//driver.findElement(By.className("signin-btn")).click();
		
		
		
	}
	
	@Test
	public void signup_functionlaity_chrome()
	{
		
		
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
		
		
		driver.findElement(By.cssSelector("[placeholder='Enter your full name']")).sendKeys("John Seo");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("john.seo");
		
		
		Actions act  =new Actions(driver,Duration.ofSeconds(10));
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.cssSelector("[type='checkbox']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")), "Select from the list"));
		
		Select alt_email = new Select(driver.findElement(By.xpath("//select[contains(@name,'hintq')]")));
		
		alt_email.selectByVisibleText("What is your favourite food?");
		
		
		
	}
}
