package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage {
	@FindBy(xpath = "//a[text()='Samsung']")
	private WebElement samsungLink;

	public WebElement getSamsungLink() {
		return samsungLink;
	}

	@FindBy(xpath="//div[text()='Remove']")
	private WebElement removeBtn;
	
	public WebElement getRemoveBtn() {
		return removeBtn;
	}
	
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement confirmRemoveBtn;

	public WebElement getConfirmRemoveBtn() {
		return confirmRemoveBtn;
	}

	@FindBy(xpath = "//a[contains(text(),'Samsung Galaxy')]")
	private WebElement samsungPhoneLink;

	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement addToCartBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getSamsungPhoneLink() {
		return samsungPhoneLink;
	}
}
