package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/tanvir/Downloads/chromedriver");
		driver= new ChromeDriver();
	}
	public HomePage getUrl() {
		 driver.get("https://www.amazon.com/"); //this method takes us to home page 
		 //so we will return the new instance i.e. new Homepage()
		 return new HomePage(driver);
	}

}
