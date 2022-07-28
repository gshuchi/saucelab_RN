package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.BaseTest;

public class WebViewPage extends BaseTest{

	AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility = "menu item webview")
	public AndroidElement webviewBtn;
	
	@AndroidFindBy(accessibility = "URL input field")
	public AndroidElement URLfield;
	
	@AndroidFindBy(accessibility = "Go To Site button")
	public AndroidElement siteBtn;
	
	public WebViewPage(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickOnOpenMenu() {
		waitForElement(openMenuBtn);
		click(openMenuBtn);
	}
	
	public void clickWebViewBtn() {
		waitForElement(webviewBtn);
		click(webviewBtn);
	}
	
	public void enterURL() {
		waitForElement(URLfield);
		click(URLfield);
		sendText("https://www.google.co.in");
	}
	
	public void clickSiteBtn() {
		waitForElement(siteBtn);
		click(siteBtn);
	}
	
}
