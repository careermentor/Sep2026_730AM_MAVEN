package org.wipro.automation.saucedemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class FirstAutomation 
{

	@Test
	public void login_functionlaity_chrome()
	{
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(op);  //launch the browser
		
		driver.get("https://www.rediff.com/");  //pass the url
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login_functionlaity_edge()
	{
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("inprivate");
		
		WebDriver driver = new EdgeDriver(eo);  //launch the browser
		
		driver.get("https://www.rediff.com/");  //pass the url
		
		driver.manage().window().maximize();
		
	}
	
}
