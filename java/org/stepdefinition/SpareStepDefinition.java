package org.stepdefinition;

import org.hooks.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SpareStepDefinition {
	
	@Given("launch Url")
	public void launchUrl() {
		System.out.println("open url");
	}

	@Given("click button")
	public void clickButton() {
		System.out.println("click button");
	}

	@When("reclick button")
	public void reclickButton() {
		System.out.println("reclick button");
	}

	@Then("close button")
	public void closeButton() {
		System.out.println("close button");
	}

	@Given("click image")
	public void clickImage() {
		System.out.println("click image");
	}

	@When("reclick image")
	public void reclickImage() {
	   System.out.println("reclick image");
	}

	@Then("close image")
	public void closeImage() {
	    System.out.println("close image");
	}



}
