package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ProductDetailsPage {
	WebDriver driver;
	String searchtext="kids for toys";
	public ProductDetailsPage(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="addToCart")WebElement addToCart;
	@FindBy(id="checkOutButton")WebElement checkOutButton;
   public void clickOnAddToCartButton() {
	   Helper.clickon(addToCart);
	   
   }
   public SignInPage ClickOnCheckOutButton () {
	  Helper.clickon(checkOutButton);
	  return new SignInPage(driver);
   }
}
