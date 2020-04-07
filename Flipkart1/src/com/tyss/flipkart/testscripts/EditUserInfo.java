
package com.tyss.flipkart.testscripts;


import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.tyss.flipkart.genericlibrary.Base;
import com.tyss.flipkart.objectrepository.HomePage;
import com.tyss.flipkart.objectrepository.ProfilePage;

public class EditUserInfo extends Base {
	@Test
	public void editUserInfo() {
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		hp.profile(driver);
		profilePage.getMyProfileLink().click();
		profilePage.getEditLink().click();
		profilePage.getFirstNameTB().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Abcd");
		profilePage.getLastNameTB().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Xyz");
		profilePage.getSaveBtn().click();
		Reporter.log("Account details edited successfully", true);
	}
}