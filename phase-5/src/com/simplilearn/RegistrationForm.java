package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	
	public static void main(String[] args) {
		//assigning driver path
		String Path= "C:\\Users\\91887\\Phase-5\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Path);
		
		//initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//giving Base Url
		String base_url="https://www.shine.com/register/general/";
		
		//launching in chrome
		driver.get(base_url);
		
		//getting name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Ratika kumari");
		
		//getting email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("ratikakumari@gmail.com");
		
		//getting mobile number
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("8873177229");
		
		
		//getting a password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Ratika@123");
		
		//getting a checkbox
		WebElement check= driver.findElement(By.id("id_privacy"));
		
		if(check.isSelected()) {
			 System.out.println("CheckBox is Selected By Default");
			 System.out.println("Status of CheckBox :"+ check.isSelected());
		}
		else {
			System.out.println("Check box is Not Selected");
		}
		
		//getting button
		
		WebElement button= driver.findElement(By.id("registerButton"));
		button.click();
		
		
		//driver.close();
		
	}

}
