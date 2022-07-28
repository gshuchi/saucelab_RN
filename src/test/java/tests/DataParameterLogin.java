package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import freemarker.log.Logger;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.DataParamLogin;
import utility.BaseTest;
import utility.JsonReader;

public class DataParameterLogin extends BaseTest{

	public AndroidDriver<AndroidElement> driver;
	public static Logger logger = Logger.getLogger(java.util.logging.Logger.class.getSimpleName());
	
	@DataProvider(name = "JSONData")
	public Object[][] passJSONData() throws IOException, ParseException
	{
		return JsonReader.getJSONData(System.getProperty("user.dir")+"/src/main/java/data/Data.json","Data",2);
	}
	
	@BeforeMethod()
    public void InvokeApp() throws Exception {
    	BaseTest dc = new BaseTest();
    	driver = dc.desiredcaps();
    	logger.info("The SAUCELABS REACT-NATIVE APK got launched successfully");  	
    }
	
	@Test(dataProvider = "JSONData")
	public void InvokeTest(String username, String password) throws Exception
	{
		DataParamLogin login = new DataParamLogin(driver);
		
		waitForElement(login.openMenuBtn);
		click(login.openMenuBtn);
		
		waitForElement(login.Login);
		click(login.Login);
		
		waitForElement(login.Username);
		click(login.Username);
		sendText(username);
		
		waitForElement(login.Password);
		click(login.Password);
		sendText(password);
		
		waitForElement(login.loginBtn);
		click(login.loginBtn);
		
	    logger.info("User LoggedIn Successfully");
	}
	
	@AfterMethod()
    public void TearDown() throws Exception {
    	driver.closeApp();
    }
}
