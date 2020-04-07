package com.tyss.flipkart.testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tyss.flipkart.genericlibrary.Base;
import com.tyss.flipkart.objectrepository.AddressChangePage;
import com.tyss.flipkart.objectrepository.ElectronicsPage;
import com.tyss.flipkart.objectrepository.HomePage;

public class DeliveryPincodeChange extends Base {
	@Test
	public void deliveryPincodeChange() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ElectronicsPage elePage = PageFactory.initElements(driver, ElectronicsPage.class);
		AddressChangePage addPage = PageFactory.initElements(driver, AddressChangePage.class);
		hp.electronics(driver);
		elePage.getSamsungLink().click();
		elePage.getSamsungPhoneLink().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		addPage.getDeliveryChangeLink().click();
		addPage.getPincodeTB().sendKeys(Keys.chord(Keys.CONTROL, "a"), "560058");
		Reporter.log("Pincode changed", true);
	}
}
