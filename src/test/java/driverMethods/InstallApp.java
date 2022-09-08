package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp {
	 public static AppiumDriver driver;
	@Test
	public void appInstall() throws Throwable {
		
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10S");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		 cap.setCapability(MobileCapabilityType.UDID, "TOYDBYMR9P6LTGKJ");

		URL url=new URL("http://localhost:4723/wd/hub");
		 
		 driver = new AndroidDriver(url,cap);
		 AndroidDriver android = new AndroidDriver(url,cap);
		 driver.installApp("D:\\section3 project\\appium4.1.2\\apkpackages\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		boolean value = driver.isAppInstalled("jp.rallwell.siriuth.touchscreentest");
		System.out.println(value);
		
	}

}
