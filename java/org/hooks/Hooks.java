package org.hooks;

import cucumber.practical.util.CucumberBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CucumberBase{

	@Before
	public void beforeScenario() {
		readPropertyFile();
		browserConfig(prop.getProperty("browser"));
	}
	
	@After
	public void afterScenario() {
		exitBrowser();
	}
}
