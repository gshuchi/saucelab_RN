package pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.BaseTest;

public class OpenMenu extends BaseTest{

	AndroidDriver<AndroidElement> driver;
	
	@AndroidFindBy(accessibility = "open menu")
	public AndroidElement openMenuBtn;
	
	@AndroidFindBy(accessibility= "sort button")
	public AndroidElement sortBtn;
	
	@AndroidFindBy(accessibility = "cart badge")
	public AndroidElement cartBtn;
	
	@AndroidFindBy(accessibility = "products screen")
	public AndroidElement productsList;
	
	@AndroidFindBy(accessibility = "menu item catalog")
	public AndroidElement catalog;
	
	@AndroidFindBy(accessibility = "menu item webview")
	public AndroidElement webview;
	
	
	public OpenMenu(AndroidDriver<AndroidElement> driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
}
