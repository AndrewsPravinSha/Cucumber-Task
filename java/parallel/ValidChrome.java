package parallel;

import aps.utils.CucumberBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ValidChrome extends CucumberBase{
	
	@Given("launch browser")
	public void launch_browser() {
		readPropertyFile();
		browserConfig("chrome");	
	}
	
	@When("open facebook")
	public void open_facebook() {
		launchUrl(prop.getProperty("fbUrl"));
	}
	
	@When("open amazon")
	public void open_amazon() {
		launchUrl(prop.getProperty("amazonUrl"));
	}

	@When("open shopclues")
	public void open_shopclues() {
		launchUrl(prop.getProperty("shopcluesUrl"));
	}
	@When("open OrangeHrm")
	public void open_OrangeHrm() {
		launchUrl(prop.getProperty("orangeUrl"));
	}
}
