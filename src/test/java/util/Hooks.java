package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;


public class Hooks {

	public static WebDriver driver;
	public static Properties prop;
	
	Logger log = Logger.getLogger(Hooks.class);

	
	public Hooks() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("src/test/resources/config/config.properties");
			FileInputStream logs = new FileInputStream("src/test/resources/config/log4j.properties");
			prop.load(ip);
			prop.load(logs);
			PropertyConfigurator.configure(prop);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void initialization() throws InterruptedException {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(10000);
	}
	 
	
	public static void login() {
		String un = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		driver.findElement(By.name("userid")).sendKeys(un);
		driver.findElement(By.name("passwd")).sendKeys(pwd);
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	
	public void onFailure(Scenario scenario) throws Exception {
		if (scenario.isFailed()) {
			try {
				log.info(scenario.getName() + "is Failes");
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(screenshot_with_scenario_name,
						new File("./target/test-report/" + scenario.getName() + ".png"));
				System.out.println(scenario.getName());
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		}
	}
}