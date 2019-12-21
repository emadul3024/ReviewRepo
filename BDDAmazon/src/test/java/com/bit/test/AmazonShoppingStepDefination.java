package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonShoppingStepDefination {

	
	WebDriver driver;
    BaseTest baseTest;
    HomePage homePage;
    KidsToys kidsToys;
    ProductDetailsPage productDetailPage;
    SignInPage signInPage;
		 
		@Given("^open chrome browser$")
		public void open_chrome_browser() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			baseTest = new BaseTest();
			baseTest.OpenBrowser();
		}

		@Given("^Nevigate to url$")
		public void nevigate_to_url() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			homePage=baseTest.getUrl();
		} 

		@When("^user search toys in search text box$")
		public void user_search_toys_in_search_text_box() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    homePage.typeOnSearchBox();
		}

		@When("^user click search button$")
		public void user_click_search_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		     kidsToys=homePage.ClickOnSearchButton();
		}

		@When("^user click on first product$")
		public void user_click_on_first_product() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			productDetailPage= kidsToys.ClickOnFirstProduct();
		}

		@When("^user click on add to cart button$")
		public void user_click_on_add_to_cart_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    productDetailPage.clickOnAddToCartButton();
		}

		@When("^user click on add to procedd to check out button$")
		public void user_click_on_add_to_procedd_to_check_out_button() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			//driver.findElement(By.id("checkOutButton")).click();
			signInPage=productDetailPage.ClickOnCheckOutButton();
		}

		@Then("^user should see sign in page$")
		public void user_should_see_sign_in_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			signInPage.verifysignInText();
		}


		

	}


