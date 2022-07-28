package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.WebViewPage;
import utility.BaseTest;

public class WebView {

	public static AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod()
	public void InvokeApp() throws Exception {
		BaseTest dc = new BaseTest();
		driver = dc.desiredcaps();
	}
	
	@Test()
	public void InvokeTest() throws Exception{
		WebViewPage view = new WebViewPage(driver);
		view.clickOnOpenMenu();
		view.clickWebViewBtn();
		view.enterURL();
		view.clickSiteBtn();
		Thread.sleep(10000);
	}
	
	@AfterMethod()
	public void TearDown() throws Exception{
		driver.closeApp();
	}
}
