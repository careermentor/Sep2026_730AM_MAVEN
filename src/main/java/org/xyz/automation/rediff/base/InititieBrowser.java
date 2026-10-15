package org.xyz.automation.rediff.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.xyz.automation.rediff.utilties.ReadPropertiesFiles;

public class InititieBrowser
{
	
	public WebDriver driver;

	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		
		if(ReadPropertiesFiles.read_config_data("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropertiesFiles.read_config_data("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropertiesFiles.read_config_data("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropertiesFiles.read_config_data("ApplicationURL"));
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
}
