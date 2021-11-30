package org.hooks;

import aps.utils.CucumberBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CucumberBase{

	@Before
	public void beforeScenario() {
		readPropertyFile();
		System.out.println(prop.getProperty("browser"));
		browserConfig(prop.getProperty("browser"));
	}
	
	@After
	public void afterScenario() {
		exitBrowser();
	}
}
