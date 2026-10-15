package org.wipro.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProgram 
{

	//write a method to reverse a string and return the reversed string
	public static String reverseString(String input) 
	{
		StringBuilder reversed = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) 
		{
			reversed.append(input.charAt(i));
		}
		return reversed.toString();
	}
	
	public void TC005_valid_cred_login_button()
	{
		//launch the browser and pass the url
		//enter valid username and password	
		//click on login button
		WebDriver driver = new ChromeDriver();  //launch the browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //pass the url
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Get a new Rediffmail ID']")).click();
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Hello World"));
	}
	
}
