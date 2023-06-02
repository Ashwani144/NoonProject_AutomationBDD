package stepdefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AddToCart;
import pageobjects.LoginPage;

public class AddToCartSteps {

	WebDriver driver;
	private AddToCart addtocart=new AddToCart(DriverFactory.getDriver());
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://www.noon.com/");
	}

	@When("user click to clerance room option")
	public void user_click_to_clerance_room_option() {
	    addtocart.clickOnclearance();
	}

	@When("user click to Man fashion")
	public void user_click_to_man_fashion() {
		addtocart.clickOnManFashion();
	   
	}

	@When("user click to Hoodies")
	public void user_click_to_hoodies() {
	    addtocart.clickOnHoodies();
	}

	@When("user click to Tommy sport")
	public void user_click_to_tommy_sport() {
	  addtocart.clickOnTommysport();
	}

	@When("user click to Add to Cart")
	public void user_click_to_add_to_cart() throws AWTException, InterruptedException {
	  addtocart.clickOnaddtocart();
	}

	@Then("user click to checkout")
	public void user_click_to_checkout() {
	  
	}
	
}
