package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.BaseTest;

public class PurchaseItem extends BaseTest{

	AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(accessibility = "menu item log in")
	public AndroidElement login;
	
	@AndroidFindBy(accessibility = "Username input field")
	public AndroidElement username;
	
	@AndroidFindBy(accessibility = "Password input field")
	public AndroidElement password;
	
	@AndroidFindBy(accessibility = "Login button")
	public AndroidElement loginBtn;
	
	@AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"store item\"])[4]")
	public AndroidElement fleeceJacket;
	
	@AndroidFindBy(accessibility = "Add To Cart button")
	public AndroidElement addToCartBtn;
	
	@AndroidFindBy(accessibility = "cart badge")
	public AndroidElement cartBtn;
	
	@AndroidFindBy(accessibility = "Proceed To Checkout button")
	public AndroidElement checkOutBtn;
	
	@AndroidFindBy(accessibility = "Full Name* input field")
	public AndroidElement fullName;
	
	@AndroidFindBy(accessibility = "Address Line 1* input field")
	public AndroidElement address;
	
	@AndroidFindBy(accessibility = "City* input field")
	public AndroidElement city;
	
	@AndroidFindBy(accessibility = "Zip Code* input field")
	public AndroidElement zipcode;
	
	@AndroidFindBy(accessibility = "Country* input field")
	public AndroidElement country;
	
	@AndroidFindBy(accessibility = "To Payment button")
	public AndroidElement toPaymentBtn;
	
	@AndroidFindBy(accessibility = "Full Name* input field")
	public AndroidElement cardFullName;
	
	@AndroidFindBy(accessibility = "Card Number* input field")
	public AndroidElement cardNumber;
	
	@AndroidFindBy(accessibility = "Expiration Date* input field")
	public AndroidElement expiryDate;
	
	@AndroidFindBy(accessibility = "Security Code* input field")
	public AndroidElement securityCode;
	
	@AndroidFindBy(accessibility = "Review Order button")
	public AndroidElement reviewOrderBtn;
	
	@AndroidFindBy(accessibility = "Place Order button")
	public AndroidElement placeOrderBtn;
	
	@AndroidFindBy(accessibility = "Continue Shopping button")
	public AndroidElement continueShoppingBtn;
	
	@AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility = "menu item log out")
	public AndroidElement logout;

	@AndroidFindBy(id = "android:id/button1")
	public AndroidElement confirmLogout;
	
	@AndroidFindBy(id = "android:id/button1")
	public AndroidElement okBtn;
	
	public PurchaseItem(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	 
   public void selectFleeceJacket() {
	   waitForElement(fleeceJacket);
	   click(fleeceJacket);
   }
   
   public void addToCart() {
	   waitForElement(addToCartBtn);
	   click(addToCartBtn);
   }
   
   public void goToCart() {
	   waitForElement(cartBtn);
	   click(cartBtn);
   }
   
   public void proceedCheckout() {
	   waitForElement(checkOutBtn);
	   click(checkOutBtn);
   }
   
   public void enterFullName() {
	   waitForElement(fullName);
	   click(fullName);
	   sendText("Rebecca Winter");
   }
   
   public void enterAddress() {
	   waitForElement(address);
	   click(address);
	   sendText("Mandorley 112");
   }
   
   public void enterCity() {
	   waitForElement(city);
	   click(city);
	   sendText("Truro");
   }
   
   public void enterZipcode() {
	   waitForElement(zipcode);
	   click(zipcode);
	   sendText("89750");
   }
   
   public void enterCountry() {
	   waitForElement(country);
	   click(country);
	   sendText("United Kingdom");
   }
   
   public void selectToPayment() {
	   waitForElement(toPaymentBtn);
	   click(toPaymentBtn);
   }
   
   public void enterCardFullName() {
	   waitForElement(cardFullName);
	   click(cardFullName);
	   sendText("Rebecca Winter");
   }
   
   public void enterCardNumber() {
	   waitForElement(cardNumber);
	   click(cardNumber);
	   sendText("4242424242424242");
   }
   
   public void enterExpiryDate() {
	   waitForElement(expiryDate);
	   click(expiryDate);
	   sendText("03/25");
   }
   
   public void enterSecurityCode() {
	   waitForElement(securityCode);
	   click(securityCode);
	   sendText("123");
   }
   
   public void selectReviewOrder() {
	   waitForElement(reviewOrderBtn);
	   click(reviewOrderBtn);
   }
   
   public void selectPlaceOrder() {
	   waitForElement(placeOrderBtn);
	   click(placeOrderBtn);
   }
   
   public void selectContinueShopping() {
	   waitForElement(continueShoppingBtn);
	   click(continueShoppingBtn);
   }
   
   public void clickOpenMenuBtn() {
   	waitForElement(openMenuBtn);
   	click(openMenuBtn);
   }
	
	public void clickLogOutBtn() {
		waitForElement(logout);
		click(logout);
	}
	
	public void confirmLogOut() {
		waitForElement(confirmLogout);
		click(confirmLogout);
	}
   
	public void okBtn() {
		waitForElement(okBtn);
		click(okBtn);
	}
}   