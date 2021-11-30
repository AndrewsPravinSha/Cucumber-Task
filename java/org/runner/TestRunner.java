package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import aps.utils.ExtentCreport;
import aps.utils.JvmReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature Files\\",
glue = {"org.stepdefinition","org.hooks"},
dryRun = false , strict = true,
tags = {"@Amazon"},
monochrome = true,
plugin = {"pretty","html:target\\Reports",
		"json:target\\Reports\\result.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	 })
public class TestRunner {
	
	  @AfterClass 
	  public static void reportGeneration() {
		ExtentCreport.generateExtentReport();  
	  //JvmReport.generateReport(System.getProperty("user.dir")+"\\target\\Reports\\result.json"); 
	  }	
	  

}
