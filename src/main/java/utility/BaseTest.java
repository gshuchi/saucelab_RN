package utility;

import java.net.URL;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {

	static AndroidDriver<AndroidElement> driver;
	
		public AndroidDriver<AndroidElement> desiredcaps(){
		     try {
			      DesiredCapabilities capabilities = new DesiredCapabilities();
			      capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			      capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
			      capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			      capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			      capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
			      capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
			      capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/src/test/resources/app/MyDemoAppRN.apk");
			      capabilities.setCapability(AndroidMobileCapabilityType.AVD,"Pixel_4_Android_10");
			      capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.saucelabs.mydemoapp.rn");
			      capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.saucelabs.mydemoapp.rn.MainActivity");
			      capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
			      capabilities.setCapability(AndroidMobileCapabilityType.ALLOW_TEST_PACKAGES, true);
			      URL server = new URL("http://0.0.0.0:4723/wd/hub");
                  driver = new AndroidDriver<>(server,capabilities);
		         }catch(Exception e)
		          {
			       e.printStackTrace();
		          }
		     System.out.println("SAUCE-LABS REACT-NATIVE APK Launched Successfully with Desired Caps!");
		     return driver;
		}
	
   public void waitForElement(AndroidElement element) {
	   WebDriverWait wait = new WebDriverWait(driver,15);
	   wait.until(ExpectedConditions.visibilityOf(element));
   }
   
   public void click(AndroidElement element) {
	   element.click();
   }
	
   public void sendText(String string) {
	   Actions a = new Actions(driver);
	   a.sendKeys(string);
	   a.perform();
	   driver.navigate().back();
   }
   
}
