package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tyss.flipkart.genericlibrary.Utility;

public class HomePage {
	Utility u = new Utility();
	@FindBy(linkText = "Amazon Pay")
	private WebElement amazonPayLink;
	
	@FindBy(linkText = "Today's Deals")
	private WebElement todaysDealsLink;
	
	@FindBy(linkText = "Best Sellers")
	private WebElement bestSellersLink;
	
	
	@FindBy(linkText = "Mobiles")
	private WebElement mobilesLink;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	private WebElement electronicsLink;
	
	
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public WebElement getAmazonPayLink() {
		return amazonPayLink;
	}

	public WebElement getTodaysDealsLink() {
		return todaysDealsLink;
	}

	public WebElement getBestSellersLink() {
		return bestSellersLink;
	}

	public WebElement getMobilesLink() {
		return mobilesLink;
	}

	public WebElement getCustomerServiceLink() {
		return customerServiceLink;
	}

	public WebElement getBuyAgainLink() {
		return buyAgainLink;
	}

	public WebElement getNewReleasesLink() {
		return newReleasesLink;
	}

	public WebElement getPantryLink() {
		return PantryLink;
	}

	public WebElement getAccountsAndLists() {
		return accountsAndLists;
	}

	@FindBy(linkText = "Customer Service")
	private WebElement customerServiceLink;
	
	@FindBy(linkText = "Buy Again")
	private WebElement buyAgainLink;
	
	@FindBy(linkText = "New Releases")
	private WebElement newReleasesLink;
	
	@FindBy(linkText = "Pantry")
	private WebElement PantryLink;
	
	@FindBy(xpath = "//span[text()='Account & Lists']")
	private WebElement accountsAndLists;

	@FindBy(xpath="//div[@class='_2aUbKa']")
	private WebElement profileLink;

	public WebElement getProfileLink() {
		return profileLink;
	}
	@FindBy(xpath="//div[@class='_2aUbKa']")
	private WebElement logOutProfile;
	
	public WebElement getLogOutProfile() {
		return logOutProfile;
	}

	public void profile(WebDriver driver) {
		u.moveToElement(driver, profileLink);
	}
	public void electronics(WebDriver driver) {
		u.moveToElement(driver, electronicsLink);
	}
	public void logout(WebDriver driver) {
		u.moveToElement(driver, logOutProfile);
	}

}
