package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
