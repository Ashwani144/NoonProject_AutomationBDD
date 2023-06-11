package stepdefinitions;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import pageobjects.AddToCart;
import pageobjects.AddToCart_Iphone;

public class AddtoCart_IPhoneSteps {
	
	WebDriver driver;
	private AddToCart addtocart=new AddToCart(DriverFactory.getDriver());
	private AddToCart_Iphone addtocart_iphone=new AddToCart_Iphone(DriverFactory.getDriver());
	
	@When("user click to mobiles")
	public void user_click_to_mobiles() {
	    
		addtocart_iphone.clickOnmobiles();
	}

	@When("user click to iPhone")
	public void user_click_to_i_phone() throws Exception {
		addtocart_iphone.clickOnIphone();
	}

	@When("user click to iPhone14ProMax")
	public void user_click_to_i_phone14pro_max() throws Exception {
		addtocart_iphone.clickonIphoneProMax();
	}

	@When("user click to AppleiPhone14ProMax")
	public void user_click_to_applei_phone14pro_max() throws Exception {
		addtocart_iphone.clickonIphoneProMaxItem();
	}


	
}
