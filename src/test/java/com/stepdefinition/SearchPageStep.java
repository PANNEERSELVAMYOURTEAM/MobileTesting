package com.stepdefinition;

import com.base.HelperClass;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageStep extends HelperClass {

	@Given("the user is in the login page")
	public void the_user_is_in_the_login_page() {
		launchAppiumDriver();
	}

	@When("the user clicking the search page")
	public void the_user_clicking_the_search_page() {
		LoginPage loginPage = new LoginPage();
		leftClick(loginPage.getLanguageSelect().get(0));

		leftClick(loginPage.getLoginUsingFb().get(0));

	}

	@When("the user entering the {string} moviename")
	public void the_user_entering_the_moviename(String string) {
		LoginPage loginPage = new LoginPage();
		leftClick(loginPage.getAllowPermission().get(0));

	}

	@Then("the user should able to see the moviename")
	public void the_user_should_able_to_see_the_moviename()
			throws InterruptedException {
		SearchPage searchPage = new SearchPage();
		Thread.sleep(7000);
		leftClick(searchPage.getSearchClick().get(0));
		leftClick(searchPage.getSearchByMovie().get(0));
		leftClick(searchPage.getMovieClick().get(0));

	}

}