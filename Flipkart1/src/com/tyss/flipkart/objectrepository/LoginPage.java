package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement phoneNumTB;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement passwordTB;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginBtn;

	public WebElement getEmailTB() {
		return phoneNumTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public void login(String number,String password) {
		phoneNumTB.sendKeys(number);
		passwordTB.sendKeys(password);
		loginBtn.click();
	}
	
	
}