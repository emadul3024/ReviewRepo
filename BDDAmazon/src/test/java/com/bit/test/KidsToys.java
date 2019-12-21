package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class KidsToys {
	WebDriver driver;
	String searchtext="kids for toys";
	public KidsToys(WebDriver dr) {
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstProduct")WebElement firstProduct;
   public ProductDetailsPage ClickOnFirstProduct() {
	   Helper.clickon(firstProduct);
	return new ProductDetailsPage(driver);
}
}
