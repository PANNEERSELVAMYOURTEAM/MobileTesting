package com.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HelperClass {
	
public static AppiumDriver<MobileElement> driver;

public static AppiumDriver<MobileElement> launchAppiumDriver()  {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "Bhumishwara");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "9");
	capabilities.setCapability("appPackage", "com.bt.bms");
	capabilities.setCapability("appActivity",
			"com.movie.bms.splashscreen.SplashScreenActivity");
	
		try {
			driver = new  AndroidDriver<MobileElement>(new URL(
					"http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
}

public  void leftClick(MobileElement element){
	element.click();
	
}

public void typeText(MobileElement element,String text){
	element.sendKeys(text);
}

public void closeEntireBrowser(){
	driver.quit();
}

public void closeSingleWindow(){
	driver.close();
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
