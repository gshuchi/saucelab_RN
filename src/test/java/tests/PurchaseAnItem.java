package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.LogIn;
import pages.LogOut;
import pages.PurchaseItem;
import utility.BaseTest;

public class PurchaseAnItem {
	
	public static AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod()
	public void InvokeApp() throws Exception {
	   	BaseTest dc = new BaseTest();
	   	driver = dc.desiredcaps();
	 } 	
	    
	@Test()
    public void InvokeTest() throws Exception {
		LogIn login = new LogIn(driver);
		login.clickOpenMenuBtn();
		login.clickLogIn();
		login.userName();
		login.passWord();
		login.clickLogInBtn();
		System.out.println("User LoggedIn Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		PurchaseItem item = new PurchaseItem(driver);
		item.selectFleeceJacket();
		item.addToCart();
		item.goToCart();
		item.proceedCheckout();
		System.out.println("Item selected Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		item.enterFullName();
		item.enterAddress();
		item.enterCity();
		item.enterZipcode();
		item.enterCountry();
		item.selectToPayment();
		System.out.println("User Details entered Successfully");
		Thread.sleep(4000);
		
		item.enterCardFullName();
		item.enterCardNumber();
		item.enterExpiryDate();
		item.enterSecurityCode();
		item.selectReviewOrder();
		item.selectPlaceOrder();
		Thread.sleep(3000);
		item.selectContinueShopping();
		Thread.sleep(3000);
		System.out.println("Card Details entered Successfully");
	    	    
	    LogOut logout = new LogOut(driver);
	    logout.clickOpenMenuBtn();
	    logout.clickLogOutBtn();
	    logout.confirmLogOut();
	    logout.okBtn();
		System.out.println("User LogOut Successfully"); 
	}
	
	 @AfterMethod()
	 public void TearDown() throws Exception {
		 System.out.println("Passed 2 Test Cases");
	  }
}
