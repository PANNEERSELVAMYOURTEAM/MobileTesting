package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\SearchMovie.feature",glue="com.stepdefinition",plugin={"pretty","html:E:\\04 dec selenium training\\AppiumTasks\\cucumberReports","json:E:\\04 dec selenium training\\AppiumTasks\\cucumberReports\\report.json"},dryRun=false,monochrome=true,snippets=SnippetType.UNDERSCORE)
public class TestRunner {

}
