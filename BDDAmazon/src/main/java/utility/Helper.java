package utility;

import org.openqa.selenium.WebElement;

public class Helper {
	
	public static void typeOn(WebElement element, String searchtext) {
		element.sendKeys(searchtext);
	}
	
	public static void clickon(WebElement element) {
		element.click();
	}
	public static void verifyElement(WebElement element) {
		boolean b=element.isDisplayed();
		if(b) {
			System.out.println("element is displayed");
		}else {
			System.out.println("element is not displayed");
		}
		
	}

}
