package com.simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstdemo {
	
	public static void main(String[] args) {
		
		//step-1: Declare path Driver
		String path="C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		
		//initiate the driver
		WebDriver driver= new ChromeDriver();
		
		///step:2 Base url
		String base_url="http://www.google.com/";
		
		//step:3 launching google chrome
		driver.get(base_url);
		
		driver.close();
		
	}

}
