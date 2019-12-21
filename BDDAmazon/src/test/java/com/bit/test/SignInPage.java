package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class SignInPage {
	WebDriver driver;
	String searchtext="kids for toys";
	public SignInPage(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signIn")WebElement signInText;
	
	public void verifysignInText() {
		Helper.verifyElement(signInText);
	}
	
  
}
