package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProductPage {

	WebDriver driver;
	// 1. By Locators
	private By searchproduct = By.id("searchBar");
	private By select1stprodct = By.xpath("//div[text()='electric scooter']");
	private By selectthe1stitem = By.xpath("//div[text()='electric scooter']");

	// 2. Constructor of the page class
	public SearchProductPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions : Feature

	public void entersearchproduct(String Electronic) {

		driver.findElement(searchproduct).sendKeys(Electronic);

	}

	public void clickOnfirstProduct() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='electric scooter']")));
		driver.findElement(select1stprodct).click();

	}

	public void clickOnsearch1stItem() {

		Actions act=new Actions(driver);
		WebElement selectthe1stitem1 = driver.findElement(By.xpath("//div[text()='electric scooter']"));
		act.moveToElement(selectthe1stitem1).perform();
		driver.findElement(selectthe1stitem).click();

	}
}
