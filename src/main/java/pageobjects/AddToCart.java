package pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	private WebDriver driver;
	// 1. By Locators
	private By cleranceroomoption = By
			.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/13942ed4-e2d6-4779-bb32-0fbfe3c56866.png']");
	private By Manfashionoption = By
			.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0002/assets/f21ad65f-bc88-4c7c-842a-24dfde94a688.png']");
	private By Hoodiesoption = By
			.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/451db0ea-f22f-4ac3-a606-1450ce1543ab.png']");
	private By Tommyspoartoption = By.xpath("//span[text()='TOMMY SPORT Essentials']");
	private By AddtoCart=By.xpath("//div[@height='48']");

	// 2. Constructor of the page class
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions : Feature

	public void clickOnclearance() {
		driver.findElement(cleranceroomoption).click();

	}

	public void clickOnManFashion() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0002/assets/f21ad65f-bc88-4c7c-842a-24dfde94a688.png']")));
		driver.findElement(Manfashionoption).click();

	}

	public void clickOnHoodies() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/451db0ea-f22f-4ac3-a606-1450ce1543ab.png']")));
		driver.findElement(Hoodiesoption).click();

	}

	public void clickOnTommysport() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='TOMMY SPORT Logo Flex Sweatshirt White ']")));
		////div[@title='TOMMY SPORT Essentials Crew Neck Sweatshirt ']
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TOMMY SPORT Essentials']")));
		driver.findElement(Tommyspoartoption).click();

	}
	
	public void clickOnaddtocart() throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(10000);
		driver.findElement(AddtoCart).click();
	}
}
