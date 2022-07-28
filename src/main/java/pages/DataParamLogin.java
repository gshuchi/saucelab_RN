package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class DataParamLogin {
	
	public AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility = "menu item log in")
	public AndroidElement Login;
	
	@AndroidFindBy(accessibility = "Username input field")
	public AndroidElement Username;
	
	@AndroidFindBy(accessibility = "Password input field")
	public AndroidElement Password;
	
	@AndroidFindBy(accessibility = "Login button")
	public AndroidElement loginBtn;
	
	
	public DataParamLogin(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
    
}
