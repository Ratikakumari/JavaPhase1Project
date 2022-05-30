package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	
	public static void main(String[] args) {
		//assigning driver path
		String Path= "C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		
		//initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//giving Base Url
		String base_url="http://www.facebook.com/";
		
		//launching in chrome
		driver.get(base_url);
		
		WebElement username= driver.findElement(By.id("email"));
		WebElement pass= driver.findElement(By.id("pass"));
		WebElement login= driver.findElement(By.name("login"));
		
		
		Actions builder = new Actions(driver);
		
		
		 Action seriesofAction = builder 
				 .moveToElement(username) 
				 .click()
				 .sendKeys(username,"Hello") 
				 .keyDown(username,Keys.SHIFT) 
				 .doubleClick()
				 .contextClick() 
				 .build();
		 
		 seriesofAction.perform();
		 
		
		
		 
	}
}
