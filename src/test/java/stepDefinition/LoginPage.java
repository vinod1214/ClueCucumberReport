package stepDefinition;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import pageObjects.HomePageObjects;
import util.Hooks;


public class LoginPage extends Hooks {

	HomePageObjects homePageObjects;
	Logger log = Logger.getLogger(LoginPage.class);
	
	
	@Before("@Scenario1")
	public void setUp() throws InterruptedException {
		initialization();
		login();
	}
	 
	
	@Given("^user is given with RegMan Home Page$")
	public void user_is_given_with_RegMan_Home_Page() throws Throwable {
		log.info("************************Execute method********************************");
		homePageObjects = new HomePageObjects();
	}

	
	@Then("^user need to validate the HomePage title$")
	public void user_need_to_validate_the_HomePage_title() throws Throwable {
	    String title = homePageObjects.validateHomePageTitle();
	    System.out.println(title);
	    log.info(title);
	    Assert.assertEquals("Documaker Regressions System",title);
	}

	
	@Then("^user need to check for oracle logo$")
	public void user_need_to_check_for_oracle_logo() throws Throwable {
	   boolean flag = homePageObjects.validateHomePageLogo();
	   Assert.assertTrue(flag);
	   homePageObjects.LogOff();
	   driver.quit();
	}
	
	
	@After
	public void endScenario(Scenario scenario) throws Exception {
		onFailure(scenario);
	}
}
