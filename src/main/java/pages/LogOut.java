package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.BaseTest;

public class LogOut extends BaseTest {

	AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility = "menu item log out")
	public AndroidElement logout;

	@AndroidFindBy(id = "android:id/button1")
	public AndroidElement confirmLogout;
	
	@AndroidFindBy(id = "android:id/button1")
	public AndroidElement okBtn;
	
	public LogOut(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
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
