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


public class AddMRLToSuite extends Hooks {

	HomePageObjects homePage;
	SuitesManagerPageObjects suitesManager;
	Logger log = Logger.getLogger(AddMRLToSuite.class);
	
	
	@Before("@Scenario2")
	public void setUp() throws InterruptedException {
		initialization();
		login();
	}
	 
	
	@Given("^user was provided with suites manager window$")
	public void user_was_provided_with_suites_manager_window() throws Throwable {
		homePage = new HomePageObjects();
		homePage.SuitesManager();
	}

	
	@Then("^user expand tree node$")
	public void user_expand_tree_node() throws Throwable {
		log.info("************************User expand VINODDUDDUKURI right tree node********************************");
		suitesManager = new SuitesManagerPageObjects();
		suitesManager.expand_right_vinodduddukuri();
	}

	
	@Then("^user expand tree node(\\d+)$")
	public void user_expand_tree_node(int arg1) throws Throwable {
		log.info("************************User expand VINODDUDDUKURI left tree node********************************");
		suitesManager.expand_left_vinodduddukuri();
	}

	
	@Then("^user will drag and drop mrl$")
	public void user_will_drag_and_drop_mrl() throws Throwable {
		log.info("************************User add pdf_embed mrl from VINODDUDDUKURI left tree node to testMRL suite in VINODDUDDUKURI right tree********************************");
		suitesManager.drag_drop_pdf_embed_mrl();
		homePage.window_close();
		homePage.LogOff();
		driver.quit();
	}
	
	
	@After
	 public void endScenario(Scenario scenario) throws Exception {
		 
		 onFailure(scenario);
	 }
}
