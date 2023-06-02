package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginPageSteps {

	private static String title;
	WebDriver driver;
	private LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.noon.com/");
		loginPage.clickOnsignInoption();
	}

	@When("user enters email {string}")
	public void user_enters_email(String email111) {
	    loginPage.enteremail(email111);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password1) {
	   loginPage.enterPassword(password1);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	  loginPage.clickOnsignInbutton();
	}

	@Then("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    title=loginPage.homepagetitle();
		System.out.println(title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expertitle) {
	   
	}
}
