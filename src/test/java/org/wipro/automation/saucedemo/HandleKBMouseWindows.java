package org.wipro.automation.saucedemo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKBMouseWindows 
{

	WebDriver driver;
	
	@Test
	public void tc01_handleFrames() throws Exception
	{
		driver= new ChromeDriver();  //launch the browser
		
		driver.get("https://demoqa.com/frames");  //pass the url
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		driver.switchTo().frame("frame1");
		
		
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
		CaptureScreenshot.testresult(driver,"tc01_handleFrames");
		
		driver.quit();
	
	}
	
	@Test
	public void tc02_handleAlerts() throws Exception
	{
		driver= new ChromeDriver();  //launch the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //pass the url
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresult(driver,"tc02_handleAlerts");
		
		driver.quit();
	
	}
	
	
	public void handleMouse() throws Exception
	{
		driver= new ChromeDriver();  //launch the browser
		
		driver.get("https://www.rediff.com/");  //pass the url
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Payments']"))).perform();
		
		act.click(driver.findElement(By.xpath("//a[text()='Mobile Recharge']"))).perform();
		
		
		Set<String> windowsid = driver.getWindowHandles();
		System.out.println(windowsid);
		
		Iterator<String> itr = windowsid.iterator();
		
		
		String win1 = itr.next();
		String win2 = itr.next();
		
		//Thread.sleep(2000);
		
		
		
		driver.switchTo().window(win2);
		
		driver.findElement(By.cssSelector("[type='tel']")).sendKeys("7799601919");
		
		//act.sendKeys(Keys.TAB).perform();
		
		//act.sendKeys("7799601919").perform();
		
		//act.scrollToElement(driver.findElement(By.xpath("//a[text()='About Rediff']"))).perform();
		
		//act.dragAndDrop(null, null); //https://demoqa.com/droppable
	
	}
	
	
	
	public void handleKB()
	{
		driver= new ChromeDriver();  //launch the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //pass the url
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		act.sendKeys("testuser").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("pass3455").perform();
		
		//act.sendKeys(Keys.ENTER).perform();
		
	}
	
}
