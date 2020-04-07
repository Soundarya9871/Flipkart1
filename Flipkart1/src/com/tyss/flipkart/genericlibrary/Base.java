package com.tyss.flipkart.genericlibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.tyss.flipkart.objectrepository.HomePage;
import com.tyss.flipkart.objectrepository.LoginPage;
import com.tyss.flipkart.objectrepository.LogoutPage;

public class Base {
	public WebDriver driver;
	public FileLib fib = new FileLib();
	public WebDriverWait wait;
    public static WebDriver scrndriver;
    public Utility util;
    
	@BeforeClass

	public void configBC() {
		if (fib.getPropertyKey("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/driverExecutables/chromedriver.exe");
			driver = new ChromeDriver();
			scrndriver = driver;
		} else {
			System.setProperty("webdriver.gecko.driver", "./src/driverExecutables/geckodriver.exe");
			driver = new FirefoxDriver();
			scrndriver = driver;
		}
		driver.manage().window().maximize();
		driver.get(fib.getPropertyKey("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		
	}

	@BeforeMethod
	public void configBM() {
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		lp.login(fib.getPropertyKey("number"), fib.getPropertyKey("password"));
		lp.getLoginBtn().click();
	}
	@AfterMethod
	public void configAM() {
		LogoutPage logOut = PageFactory.initElements(driver, LogoutPage.class);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
//		homePage.profile(driver);
//		logOut.getLogoutLink().click();
	}
	@AfterTest
	public void configAT() {
//		driver.close();
	}
}
