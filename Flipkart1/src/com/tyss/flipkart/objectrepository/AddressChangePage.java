package com.tyss.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressChangePage {
	@FindBy(xpath = "//span[text()='Check']")
	private WebElement deliveryChangeLink;

	@FindBy(id = "pincodeInputId")
	private WebElement pincodeTB;

	public WebElement getDeliveryChangeLink() {
		return deliveryChangeLink;
	}

	public WebElement getPincodeTB() {
		return pincodeTB;
	}

}
