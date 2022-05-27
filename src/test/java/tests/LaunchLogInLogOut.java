package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import freemarker.log.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.LogOut;
import pages.LogIn;
import utility.BaseTest;

public class LaunchLogInLogOut {

	public static AndroidDriver<AndroidElement> driver;
	
	public static Logger logger = Logger.getLogger(java.util.logging.Logger.class.getSimpleName());

    @BeforeMethod()
    public void InvokeApp() throws Exception {
    	BaseTest dc = new BaseTest();
    	driver = dc.desiredcaps();
    	logger.info("The SAUCELABS REACT-NATIVE APK got launched successfully");
    	
    }
     
    @Test()
    public void InvokeTest() throws Exception {
    	LogIn login = new LogIn(driver);
    	login.clickOpenMenuBtn();
    	login.clickLogIn();
    	login.userName();
    	login.passWord();
    	login.clickLogInBtn();
    	logger.info("User LoggedIn Successfully");
    	
    	LogOut logout = new LogOut(driver);
    	logout.clickOpenMenuBtn();
    	logout.clickLogOutBtn();
    	logout.confirmLogOut();
    	logout.okBtn();
    	logger.info("User LogOut Successfully");
    }
     
    @AfterMethod()
    public void TearDown() throws Exception {
    	driver.closeApp();
    }
 }
