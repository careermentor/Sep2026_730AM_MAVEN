package org.wipro.automation.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Locate the search textbox
        WebElement searchBox = driver.findElement(By.id("APjFqb"));

        // Send text
        searchBox.sendKeys("Selenium Automation");

        // Keep browser open for a few seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // driver.quit();
    }
    
    //write a method to search for a text in google and return the title of the page
    public static String searchGoogle(String searchText) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		searchBox.sendKeys(searchText);
		searchBox.submit();
		
		// Wait for the results to load
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String title = driver.getTitle();
		driver.quit();
		return title;
    }
}
