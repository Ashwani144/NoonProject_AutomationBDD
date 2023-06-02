package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	// 1. By Locators
	    private By signInoption = By.xpath("//span[text()='Sign In']");
		private By email = By.id("emailInput");
		private By password = By.id("passwordInput");
		private By signInbutton = By.xpath("//button[text()='Sign In']");
		
		// 2. Constructor of the page class
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}

		// 3. page actions : Feature
		
		public void clickOnsignInoption() {
			driver.findElement(signInoption).click();

		}
		
		public void enteremail(String email1) {
			driver.findElement(email).sendKeys(email1);
		}

		public void enterPassword(String password1) {
			driver.findElement(password).sendKeys(password1);
		}

		public void clickOnsignInbutton() {
			driver.findElement(signInbutton).click();

		}

		public String homepagetitle(){
			return driver.getTitle();
		}
		
	
		public OrderPage doLogin(String em, String pwd)
		{
			System.out.println("login with: " +em + " and  " +pwd);;
			driver.findElement(signInoption).click();
			driver.findElement(email).sendKeys(em);
			driver.findElement(password).sendKeys(pwd);
			driver.findElement(signInbutton).click();
			
			return new OrderPage(driver);
		}
}
