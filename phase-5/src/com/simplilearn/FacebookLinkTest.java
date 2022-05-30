package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkTest {
	public static void main(String[] args) {
		
		//step:1 Declare the Path of Chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe");
		
		//step:2 initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//step: 3 Launching Facebook
		driver.get("http://www.facebook.com/");
		
		WebElement linktext= driver.findElement(By.linkText("Forgotten password?"));
		
		linktext.click();
		
		
		
		
	}

}