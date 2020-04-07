package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameTB;
	
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getEditLink() {
		return editLink;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameTB;
	
	@FindBy(xpath="//span[text()='Edit']")
	private WebElement editLink;
	
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement saveBtn;
	
	
	@FindBy(xpath="//div[text()='My Profile']")
	private WebElement myProfileLink;

	public WebElement getMyProfileLink() {
		return myProfileLink;
	}
}
