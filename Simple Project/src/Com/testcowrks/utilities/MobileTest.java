package Com.testcowrks.utilities;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileTest{

	public static void main(String[] args) {


 

 
public class AppiumTest {
	
	public void main(String[] args) {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("automationName","UiAutomator2");

	//	caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
		caps.setCapability("appPackage", "com.rmz.mex");
		caps.setCapability("appActivity", "com.rmz.mex.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}
 
}
	}

}
