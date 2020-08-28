package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.DataUtils;

public class CreateAccountPage {
	public WebDriver driver;

	public void textField(By selector, String email) {
		WebElement textField = DataUtils.driver.findElement(selector);
		textField.clear();
		textField.sendKeys(email);
	}
	
	
	public void assertElementPresence(By selector) {	
		Assert.assertTrue(DataUtils.waitForElementPresence(selector, 20).isDisplayed());
	}
	
	public void clickButton(By selector) {
		
		WebElement buttonElement = DataUtils.driver.findElement(selector);
		buttonElement.click();
	
	}
	
}