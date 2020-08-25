package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import utils.DataUtils;

public class LoginPage {
	public WebDriver driver;
	
	public void setEmailField(By selector, String email) {  
		
		WebElement emailField = DataUtils.driver.findElement(selector);
		emailField.clear();
		emailField.sendKeys(email);
	  
	}
	
	public void setPassword(By selector, String password) {
		
		WebElement passwordField = DataUtils.driver.findElement(selector);
		passwordField.clear();
		passwordField.sendKeys(password);
		
	}
	
	public void clickButton(By selector) {
		
		WebElement buttonElement = DataUtils.driver.findElement(selector);
		buttonElement.click();
	
	}
	
	public void assertElementPresence(By selector) {	
		Assert.assertTrue(DataUtils.waitForElementPresence(selector, 20).isDisplayed());
	}
}
