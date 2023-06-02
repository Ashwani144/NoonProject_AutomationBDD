package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	public WebDriver init_driver(String browser){
		
		System.out.println("browser value is: " + browser);
		
		if(browser.equals("chrome")){
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox"))
		{
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else 
		{
         System.out.println("Please pass the correct browser value: "+ browser);
		}	
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
	//	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();
	}
	public static synchronized WebDriver getDriver(){
		return tlDriver.get();
	}
	
}
