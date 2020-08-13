package stepDefinition;

import org.apache.log4j.Logger;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePageObjects;
import pageObjects.SuitesManagerPageObjects;
import util.Hooks;

public class RemoveMRLFromSuite extends Hooks {

	HomePageObjects homePage;
	SuitesManagerPageObjects suitesManager;
	Logger log = Logger.getLogger(RemoveMRLFromSuite.class);
	
	
	@Before("@Scenario3")
	public void setUp() throws InterruptedException {
		initialization();
		login();
	}
	 

	@Given("^user provided with suites manager window$")
	public void user_provided_with_suites_manager_window() throws Throwable {
		homePage = new HomePageObjects();
		homePage.SuitesManager();

	}
	
	@Then("^user expand run testMrl suite tree node$")
	public void user_expand_run_testMrl_suite_tree_node() throws Throwable {
		log.info("************************Expand testMrl suite under VINODDUDDUKURI right tree node********************************");
		suitesManager = new SuitesManagerPageObjects();
		suitesManager.expand_right_vinodduddukuri();
		suitesManager.expand_testMRL_suite();
	}

	
	@Then("^user select and remove mrl from suite$")
	public void user_select_and_remove_mrl_from_suite() throws Throwable {
		log.info("************************Remove pdf_embed mrl from testMrl suite available in VINODDUDDUKURI right tree ********************************");
		suitesManager.remove_mrl();
		homePage.window_close();
		homePage.LogOff();
		driver.quit();
	}
	
	
	@After
	public void endScenario(Scenario scenario) throws Exception {
		onFailure(scenario);
	}
}
