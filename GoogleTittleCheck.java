package com.simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTittleCheck {
	
	public static void main(String[] args) {
		
		//step:1 Declare the Path of Chromedriver
		String path="C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//step:2 initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//step:3 base url
		String base_url="http://www.google.com/";
		
		
		//step: 4 Launching google chrome
				driver.get(base_url);
				
		/// step:5 to check the google title
		
		String expectedTitle="Google";
		
		String actualTitle="";
		
		//getting name of website from driver
		actualTitle= driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("Test Passed with title: "+driver.getTitle());
		else
			System.out.println("Test Failed");
		
		//close google chrome
		driver.close();
		
		
		
	}

}