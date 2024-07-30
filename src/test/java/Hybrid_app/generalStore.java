package Hybrid_app;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Hybrid_App.genstore_capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class generalStore extends genstore_capabilities  {
	
AndroidDriver<AndroidElement> driver ;
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(enabled = true)
	public void login() throws InterruptedException {
		
		driver.findElement(MobileBy.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Naruto Uzumaki");
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioMale")).click();
		driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			
	}
}
