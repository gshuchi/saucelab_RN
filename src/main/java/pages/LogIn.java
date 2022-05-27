package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.BaseTest;

public class LogIn extends BaseTest {

	AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility = "menu item log in")
	public AndroidElement login;
	
	@AndroidFindBy(accessibility = "Username input field")
	public AndroidElement username;
	
	@AndroidFindBy(accessibility = "Password input field")
	public AndroidElement password;
	
	@AndroidFindBy(accessibility = "Login button")
	public AndroidElement loginBtn;
	
	
	public LogIn(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOpenMenuBtn() {
		waitForElement(openMenuBtn);
		click(openMenuBtn);
	}
	
	public void clickLogIn() {
		waitForElement(login);
		click(login);
	}
	
	public void userName() {
		waitForElement(username);
		click(username);
		sendText("bob@example.com");
	}

   public void passWord() {
	   waitForElement(password);
	   click(password);
	   sendText("10203040");
   }
    
   public void clickLogInBtn() {
	   waitForElement(loginBtn);
	   click(loginBtn);
   }



}

