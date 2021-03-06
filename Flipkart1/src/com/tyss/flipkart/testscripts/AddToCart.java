package com.tyss.flipkart.testscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.tyss.flipkart.genericlibrary.Base;
import com.tyss.flipkart.objectrepository.ElectronicsPage;
import com.tyss.flipkart.objectrepository.HomePage;

public class AddToCart extends Base {
	@Test
	public void addTocart() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ElectronicsPage elePage = PageFactory.initElements(driver, ElectronicsPage.class);
		hp.electronics(driver);
		elePage.getSamsungLink().click();
		elePage.getSamsungPhoneLink().click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		elePage.getAddToCartBtn().click();
		Reporter.log("Product added to cart successfully",true);
	}
}