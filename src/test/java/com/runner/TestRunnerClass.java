package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE,strict=true,dryRun=false,plugin= {"pretty","json:target/cucumber.json"},features = "C:\\Users\\DELL\\eclipse-workspace\\MavenHari\\src\\test\\resources\\Features\\CucumberTask02.feature",glue="com.stepdefinition")

public class TestRunnerClass {
	@AfterClass
	public static void afterclass() {
		
		Reporting.generateJVMReport(System.getProperty("user.dir"+"\\target\\cucumber.json"));
		

	}

}
