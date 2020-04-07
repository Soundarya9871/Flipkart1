package com.tyss.flipkart.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	public void moveToElement(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void switchToNewTab(WebDriver driver, String id) {
		driver.switchTo().window(id);
	}
}
