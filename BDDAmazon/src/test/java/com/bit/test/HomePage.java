package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class HomePage {
	WebDriver driver;
	String searchtext="kids for toys";
	public HomePage(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="searchbox")WebElement searchbox;
	@FindBy(id="searcbutton")WebElement searchbutton;
	
	public void typeOnSearchBox() {
		Helper.typeOn(searchbox, searchtext);
		
	}
	
	public KidsToys ClickOnSearchButton() {
		Helper.clickon(searchbutton);
		return new KidsToys(driver);
		
		//driver.findElement(By.id("searchbutton")).click();
	}

}
