package com.appium4.launch;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumLaunchTest {
	public static AppiumDriver driver;
	@Test
	public void launch() throws Throwable {
		 DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 10S");
		 cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		 cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		 cap.setCapability(MobileCapabilityType.UDID, "TOYDBYMR9P6LTGKJ");
		 cap.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		 cap.setCapability("appActivity", ".TouchScreenTestActivity");
		 
		URL url=new URL("http://localhost:4723/wd/hub");
		 
		 AndroidDriver android = new AndroidDriver(url,cap);
		 android.launchApp();
		 android.closeApp();
	}

}
