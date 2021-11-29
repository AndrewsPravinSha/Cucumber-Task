package org.stepdefinition;

import java.util.List;

import org.hooks.Hooks;
import org.openqa.selenium.WebElement;

import cucumber.practical.pojo.TestLeafPojo;
import cucumber.practical.util.CucumberBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundAndHooks extends CucumberBase{
	TestLeafPojo tp;
	@Given("enter the url of leafGround")
	public void enterTheUrlOfLeafGround() {
		readPropertyFile();
	    launchUrl(prop.getProperty("leafGround"));
	    tp = new TestLeafPojo();
	}

	@When("click the EditBox image")
	public void clickTheEditBoxImage() {
	    clickButton(tp.getEditBox());
	}

	@When("enter the email address")
	public void enterTheEmailAddress() {
	    passInput(tp.getEditEmail(), "aps@gmail.com");
	}

	@Then("get the default text")
	public void getTheDefaultText() {
	    String attribute = tp.getEditDefaultValue().getAttribute("value");
	    System.out.println(attribute);
	}

	@Then("clear the default text")
	public void clearTheDefaultText() {
	    tp.getEditClear().clear();
	}

	@Then("check whether the field is disabled")
	public void checkWhetherTheFieldIsDisabled() {
	    WebElement disable = tp.getEditDisabled();
	    String attribute = disable.getAttribute("disabled");
	    if (attribute.contains("true")) {
			System.out.println("the text field is disabled");
		} else {
			System.out.println("the text field is not disabled");
		}
	}

	@When("click the Images image")
	public void clickTheImagesImage() {
		clickButton(tp.getImageBox());
	   
	}

	@When("click the homepage image")
	public void clickTheHomepageImage() {
	    hoverCursorClick(tp.getImgHomepageImg());
	}

	@Then("reclick the Images button")
	public void reclickTheImagesButton() {
		clickButton(tp.getImageBox());
	}
	@When("click the RadioButton image")
	public void clickTheRadioButtonImage() {
	    jsClick(tp.getRadioButtonBox());
	}

	@Then("check which button was clicked default")
	public void checkWhichButtonWasClickedDefault() {
	   List<WebElement> list = 
			   listGetElements("(//div[contains(@class,'small-12')])[2]//child::label|(//div[contains(@class,'small-12')])[2]//child::input");  
	  for (WebElement webElement : list) {
		  String attribute = webElement.getAttribute("value");
			  while(attribute.equals("1")) { 
				  System.out.println(webElement.getText()); }
			 	
	  }
	
	}

	}


	
