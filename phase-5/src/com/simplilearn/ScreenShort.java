package com.simplilearn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShort {
	
	public static void main(String[] args) {
		
		
		String Path= "C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		
		//initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//giving Base Url
		String base_url="https://www.facebook.com";
		
		//launching in chrome
		driver.get(base_url);
		
		
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File src= screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(src, new File("D://Screenshot//test1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}