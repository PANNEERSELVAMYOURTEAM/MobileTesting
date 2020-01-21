package com.stepdefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SearchPageSteps {

	public static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Bhumishwara");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.bt.bms");
		capabilities.setCapability("appActivity",
				"com.movie.bms.splashscreen.SplashScreenActivity");
		driver = new AppiumDriver<MobileElement>(new URL(
				"http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement selectLanguage = (MobileElement) driver
				.findElementById("language_text_view_label");
		selectLanguage.click();
		MobileElement facebookSign = (MobileElement) driver
				.findElementById("social_bt_facebook");
		facebookSign.click();
		MobileElement allowPermission = (MobileElement) driver
				.findElementById("com.android.packageinstaller:id/permission_allow_button");

		allowPermission.click();
	Thread.sleep(7000);
		MobileElement searchMovie = (MobileElement) 
				
				driver.findElementByXPath(("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]"));

		
		
		searchMovie.click();
		MobileElement typeText = (MobileElement) driver
				.findElementById("com.bt.bms:id/edtSearch");
		typeText.sendKeys("Dolittle",Keys.ENTER);
		MobileElement clickMovie = (MobileElement) driver
				.findElementById("com.bt.bms:id/search_result_title");
		clickMovie.click();
	
	
	}}


