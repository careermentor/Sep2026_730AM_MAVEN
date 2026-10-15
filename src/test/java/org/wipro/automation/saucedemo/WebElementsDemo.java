package org.wipro.automation.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementsDemo 
{

	@Test
	public void login_functionlaity_chrome() throws Exception
	{
		
		WebDriver driver = new EdgeDriver();

        // Open login page
        driver.get("https://www.saucedemo.com/");
        
        driver.manage().window().maximize();
        
        //user came to login page
        
      //  driver.getCurrentUrl();
        
     //step1
        Assert.assertEquals( driver.getCurrentUrl(), "https://www.saucedemo.com/");

      // step2 // check username field is available in the login page
        
       // driver.findElement(By.id("user-name")).getAttribute("placeholder"); //Username
        
        Assert.assertEquals(driver.findElement(By.id("user-name")).getAttribute("placeholder"), "Username");
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        
        //driver.findElement(By.id("password")).getAttribute("placeholder"); //Password
        
        Assert.assertEquals(driver.findElement(By.id("password")).getAttribute("placeholder"), "Password");
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //  validate Login button is there in the login page
        
       // driver.findElement(By.id("login-button")).getAttribute("value"); //Login
        
        Assert.assertEquals(driver.findElement(By.id("login-button")).getAttribute("value"), "Login");
        
        driver.findElement(By.id("login-button")).click();
        
        //test user came to product page
        
        //driver.getCurrentUrl();
        
        //product page
        Assert.assertEquals( driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        
       // driver.findElement(By.cssSelector("[class='title']")).getText();  //Products
        
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='title']")).getText(), "Products");
        
        
       // driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();  //no such element exception
        
      //  driver.navigate().back();
        
        List<WebElement> list_products = driver.findElements(By.cssSelector("[class='inventory_item_name ']"));
        
        System.out.println(list_products.size());  //6
        
        /*
        for(WebElement list: list_products)
        {
        	System.out.println(list.getText());
        }
        */
        
        for(int i=0; i<list_products.size();i++)
        {
        	System.out.println(list_products.get(i).getText());
        	
        }
        
        list_products.get(1).isEnabled(); //true
        
        list_products.get(1).isDisplayed(); //true
        
        Assert.assertEquals(list_products.get(1).isEnabled(), true);
        
        list_products.get(1).click();
		
	}
	
	
	
}
