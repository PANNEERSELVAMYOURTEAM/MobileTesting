$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/SearchMovie.feature");
formatter.feature({
  "name": "to validate the search page of BookMyShowWebsite",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "to validate the SearchPage with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicking the search page",
  "keyword": "When "
});
formatter.step({
  "name": "the user entering the \"\u003cmovieName\u003e\" moviename",
  "keyword": "And "
});
formatter.step({
  "name": "the user should able to see the moviename",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "movieName"
      ]
    },
    {
      "cells": [
        "DoLittle"
      ]
    }
  ]
});
formatter.scenario({
  "name": "to validate the SearchPage with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchPageStep.the_user_is_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicking the search page",
  "keyword": "When "
});
formatter.match({
  "location": "SearchPageStep.the_user_clicking_the_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user entering the \"DoLittle\" moviename",
  "keyword": "And "
});
formatter.match({
  "location": "SearchPageStep.the_user_entering_the_moviename(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should able to see the moviename",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPageStep.the_user_should_able_to_see_the_moviename()"
});
formatter.result({
  "error_message": "java.lang.IllegalArgumentException: @$Proxy12: one of [uiAutomator, accessibility, className, id, tagName, name, xpath, linkText, partialLinkText, windowsAutomation, iOSClassChain, iOSNsPredicate] should be filled\r\n\tat io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder.getFilledValue(AppiumByBuilder.java:109)\r\n\tat io.appium.java_client.pagefactory.bys.builder.AppiumByBuilder.createBy(AppiumByBuilder.java:148)\r\n\tat io.appium.java_client.pagefactory.DefaultElementByBuilder.getBys(DefaultElementByBuilder.java:133)\r\n\tat io.appium.java_client.pagefactory.DefaultElementByBuilder.buildMobileNativeBy(DefaultElementByBuilder.java:177)\r\n\tat io.appium.java_client.pagefactory.DefaultElementByBuilder.buildBy(DefaultElementByBuilder.java:216)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocatorFactory.createLocator(AppiumElementLocatorFactory.java:66)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocatorFactory.createLocator(AppiumElementLocatorFactory.java:53)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocatorFactory.createLocator(AppiumElementLocatorFactory.java:1)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultFieldDecorator.decorate(DefaultFieldDecorator.java:56)\r\n\tat io.appium.java_client.pagefactory.AppiumFieldDecorator.decorate(AppiumFieldDecorator.java:155)\r\n\tat org.openqa.selenium.support.PageFactory.proxyFields(PageFactory.java:113)\r\n\tat org.openqa.selenium.support.PageFactory.initElements(PageFactory.java:105)\r\n\tat com.pageobjectmodel.SearchPage.\u003cinit\u003e(SearchPage.java:15)\r\n\tat com.stepdefinition.SearchPageStep.the_user_should_able_to_see_the_moviename(SearchPageStep.java:37)\r\n\tat ✽.the user should able to see the moviename(src/test/resources/Features/SearchMovie.feature:8)\r\n",
  "status": "failed"
});
});