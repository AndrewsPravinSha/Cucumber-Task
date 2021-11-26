package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.practical.pojo.AmazonPojo;
import cucumber.practical.util.CucumberBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonStepDefinition extends CucumberBase{
	AmazonPojo ap;
	
	@Given("enter into amazon site")
	public void enter_into_amazon_site() {
	   //reading property file from the configuration file
	   readPropertyFile();
	   
	   //initiating the browser from the value of config.file
	   browserConfig(prop.getProperty("browser"));
	   
	   //launching the Amazon url from the value of config.file
	   launchUrl(prop.getProperty("amazonUrl"));
	   ap = new AmazonPojo();
	}

	@When("search a {string} in searchBox")
	public void search_a_in_searchBox(String product) {
		
		//passing each product value by cucumber "example" keyword
	    passInput(ap.getAmzSearchBox(), product);	
	}

	@When("click a search button")
	public void click_a_search_button() {
		
		//after passing the product value clicking the search button
	    clickButton(ap.getAmzSearchButton());
	}

	@Then("click the product")
	public void click_the_product() {
		
		//filtering out the product by amazon choice and then clicking it
	    hoverCursorClick(ap.getAmzChoice());
	}

	@Then("add the product into cart")
	public void add_the_product_into_cart() {
		
		//after clicking and then adding the product to cart
	    hoverCursorClick(ap.getAddtoCartButton());
	}
	
	@Then("verify whether the product is added")
	public void verify_whether_the_product_is_added() throws InterruptedException {
		
		/*when the product is added to cart, 
		  It shows message that will be used for validating output results*/
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement until = wait.until(ExpectedConditions.visibilityOf(ap.getCartButton()));
	    boolean displayed = until.isDisplayed();
	    Assert.assertTrue("Product was not Added to the Cart", displayed);
	}




}
