package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.SearchProductPage;

public class SearchProductSteps {

	WebDriver driver;
	private SearchProductPage searchproductpage=new SearchProductPage(DriverFactory.getDriver());
	
	@Given("user is on search home page")
	public void user_is_on_search_home_page() {
		DriverFactory.getDriver().get("https://www.noon.com/");
	}

	@When("user type the {string} in search box")
	public void user_type_the_in_search_box(String Electronic1) {
		searchproductpage.entersearchproduct(Electronic1);
	}

	@When("user click to 3rd option")
	public void user_click_to_3rd_option() {
	   searchproductpage.clickOnsearch1stItem();
	}

	@Then("electric scooter is display")
	public void electric_scooter_is_display() {
	    
	}
	
}
