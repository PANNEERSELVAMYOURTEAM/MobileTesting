package com.pageobjectmodel;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

import com.base.HelperClass;

public class LoginPage extends HelperClass {
	public LoginPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id="language_text_view_label")
	private List<MobileElement> languageSelect;
	@AndroidFindBy(id="social_bt_facebook")
	private List<MobileElement> loginUsingFb;
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	private List<MobileElement> allowPermission;
	
	
	public List<MobileElement> getAllowPermission(){
		return allowPermission;
	}
	public List<MobileElement> getLoginUsingFb(){
		return loginUsingFb;
	}

	public List<MobileElement> getLanguageSelect(){
		return languageSelect;
		
	}
 
}
