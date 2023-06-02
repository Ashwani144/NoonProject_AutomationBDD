package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {

	WebDriver driver;
	// 1. By Locators
	private By myaccount = By.xpath("//span[text()='My Account']");
	private By orders = By.xpath("//button[text()='Orders']");
//	private By textMessage = By.xpath("//h3[text()='You have no previous orders']");

	// 2. Constructor of the page class
	public OrderPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions : Feature

	public String getOrderPagetitle(){
		return driver.getTitle();
	}
	
	public void clickonmyAccountoption() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hala Ashwani!']")));
		
		driver.findElement(myaccount).click();

	}

	public void clickonordersbutton() {

		driver.findElement(orders).click();
	}

}
