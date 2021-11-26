package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeStepDefinition {
	WebDriver driver;
	@Given("open the official page of OrangeHRM")
	public void open_the_official_page_of_OrangeHRM() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user enters {string} & {string}")
	public void user_enters(String userName, String passWord) {
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(passWord);
	}

	@Then("user click submit button")
	public void user_click_submit_button() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("validates the Credentials")
	public void validates_the_Credentials() {
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("dashboard");
		Assert.assertTrue("Invalid credentials",contains);
	}

}
