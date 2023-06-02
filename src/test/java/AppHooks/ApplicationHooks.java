package AppHooks;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class ApplicationHooks 
{
   private DriverFactory driverFactory;
   private WebDriver driver;
   private ConfigReader configReader;
   Properties prop;
	
	@Before(order = 0)
	public void getProperty(){
		
		configReader = new ConfigReader();
		prop=configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser(){
		String browserName=prop.getProperty("browser");
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
	}
	
	
	/*@After(order = 0)
	public void quitBrowser(){
		driver.quit();
	}*/
	
	@After(order = 1)
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			String screenshotName = scenario.getName().replaceAll(" ", " ");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
			scenario.attach(sourcePath, "image/png", screenshotName);
		}
	}
	
	
}
