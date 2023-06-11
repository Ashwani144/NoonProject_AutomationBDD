package pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCart_Iphone {

	private WebDriver driver;
	
	private By Mobiles=By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/1988c23a-de3e-41d7-9381-2cb6784a3b74.png']");
	
	private By Iphone =By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/a4f0b6b2-e871-4fbb-8359-2ccea84d1971.png']");
	
	private By Iphone14ProMax=By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0001/assets/a11e1494-473b-4ddc-a216-0ff10aa71fd0.png']");
	
	private By Iphone14ProMaxITEM=By.xpath("//div[@title='Apple iPhone 14 Pro Max 256GB Deep Purple 5G With FaceTime - Middle East Version ']");
	
	private By AddTocart=By.xpath("//div[@class='sc-3dcc674c-0 jJHOCL']");
	
	
	// 2. Constructor of the page class
		public AddToCart_Iphone(WebDriver driver) {
			this.driver = driver;
		}
		
		
		// 3. page actions : Feature
	
		public void clickOnmobiles() {
			driver.findElement(Mobiles).click();

		}

	//	@SuppressWarnings("deprecation")
		public void clickOnIphone() throws Exception {
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://f.nooncdn.com/mpcms/EN0002/assets/f21ad65f-bc88-4c7c-842a-24dfde94a688.png']")));
			Thread.sleep(10000);
			driver.findElement(Iphone).click();

		}	
		
		public void clickonIphoneProMax() throws Exception{
			
			Thread.sleep(10000);
			driver.findElement(Iphone14ProMax).click();
		}
		
		public void clickonIphoneProMaxItem() throws Exception{
			
			Thread.sleep(10000);
			driver.findElement(Iphone14ProMaxITEM).click();
		}
		
		public void clickonAddToCart() throws Exception{
			
			Robot robot = new Robot();
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(10000);
			Thread.sleep(10000);
			driver.findElement(AddTocart).click();
		}
}
