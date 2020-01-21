package com.pageobjectmodel;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

import com.base.HelperClass;

public class SearchPage extends HelperClass{
public SearchPage() {
	PageFactory.initElements(new AppiumFieldDecorator(driver),this );
}

@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.view.ViewGroup[1]")

private List<MobileElement> searchClick;

public List<MobileElement> getSearchClick(){
	return searchClick;
	
}

@AndroidFindBy(id="com.bt.bms:id/edtSearch")
private List<MobileElement> searchByMovie;
public List<MobileElement> getSearchByMovie(){
	return searchByMovie;
	
}
@AndroidFindBy(id="com.bt.bms:id/edtSearch")
private List<MobileElement> movieName;
public List<MobileElement> getMovieName(){ 
	return movieName;
	
}
@AndroidFindBy(id="com.bt.bms:id/search_result_title")
private List<MobileElement> movieClick;
public List<MobileElement> getMovieClick(){
	return movieClick;
}}
