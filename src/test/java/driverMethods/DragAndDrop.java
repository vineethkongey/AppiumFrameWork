package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {
	@Test
	public void Drag() throws Throwable {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		cap.setCapability(MobileCapabilityType.UDID, "");
		cap.setCapability("appPackage", "");
		cap.setCapability("appActivity", "");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,cap);
		MobileElement continuebtn = (MobileElement) driver.findElement(By.id(""));
		driver.tap(1, continuebtn, 500);
		MobileElement okbtn = (MobileElement) driver.findElement(By.id(""));
		driver.tap(1, okbtn, 500);
		MobileElement views = (MobileElement) driver.findElement(By.id(""));
		driver.tap(1, views, 500);
		MobileElement drag = (MobileElement) driver.findElementsByAccessibilityId("");
		driver.tap(1, drag, 500);
		MobileElement src = (MobileElement) driver.findElement(By.id(""));
		driver.tap(1, src, 500);
		MobileElement dest = (MobileElement) driver.findElement(By.id(""));
		driver.tap(1, dest, 500);
		TouchActions actions=new TouchActions(driver);
		actions.release(dest).perform();
		
		
		
		
		
		
	}

}
