package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;
import pageobjects.OrderPage;

public class OrderPageSteps {

	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	private OrderPage orderpage;
	WebDriver driver;
			
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
	    
		
		 List<Map<String, String>> creddetail = dataTable.asMaps();
		 String eMail = creddetail.get(0).get("email");
		 String passWord=creddetail.get(0).get("password");
		 
		 DriverFactory.getDriver().get("https://www.noon.com/");
		 orderpage=loginpage.doLogin(eMail, passWord);
		
	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {
		String titleofOrder=orderpage.getOrderPagetitle();
		
		System.out.println("Accounts Page title is: " + titleofOrder);
	}

	@When("user click to MyAccount option")
	public void user_click_to_my_account_option() {
		orderpage.clickonmyAccountoption();
	}

	@When("user click to order option")
	public void user_click_to_order_option() {
	   orderpage.clickonordersbutton();
	   
	//   String actualmessgae = driver.findElement(By.xpath("//h3[text()='You have no previous orders']")).getText();
	 //  System.out.println(actualmessgae);
	}

	@Then("order page should  be {string}")
	public void order_page_should_be(String expectedMessage) {
//		 String expectedAlertMessage = "You have no previous orders";
//	     String actualmessgae = driver.findElement(By.xpath("//h3[text()='You have no previous orders']")).getText();
//		if(actualmessgae.contains(expectedAlertMessage))
//	{
//			Assert.assertTrue(true);//pass
//		System.out.println("User get Pop up Message -Passed :" +expectedMessage);
//			
//
//		}
//		else
//		{
//			Assert.assertTrue(false);//fail
//			System.out.println("User get Pop up Message -Failed :" +expectedMessage);
//
//		}
//		
//		
	}
}
	
