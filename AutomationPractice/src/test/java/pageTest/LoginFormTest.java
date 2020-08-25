package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import utils.DataUtils;

public class LoginFormTest {
	public WebDriver driver;
	
	DataUtils browser = new DataUtils();
	LoginPage logIn = new LoginPage();
	
	@BeforeClass
	public void setupPage() {

		browser.LaunchBrowser("http://automationpractice.com/");
		
		try {
			
			logIn.clickButton(By.xpath("//*[contains(text(), \"Sign in\")]"));
			
		} catch (Exception  err){
			System.out.println(err);
		}
	}
	
	
	@Test (priority = 1)
	public void signInSection() {
		try {
			//String str = "\"Forgot your password?\"";
			//Assert.assertTrue(DataUtils.waitForElementPresence(By.xpath("//*[contains(text(),\"Already registered?\")]"), 20).isDisplayed());
			//Assert.assertTrue(DataUtils.waitForElementPresence(By.name("email"), 20).isDisplayed());
			//Assert.assertTrue(DataUtils.waitForElementPresence(By.name("passwd"), 20).isDisplayed());	
			//Assert.assertTrue(DataUtils.waitForElementPresence(By.xpath("//*[contains(text(),\"Forgot your password?\")]"), 20).isDisplayed());
			//Assert.assertTrue(DataUtils.waitForElementPresence(By.name("SubmitLogin"), 20).isDisplayed());	
			
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Already registered?\")]"));
			logIn.assertElementPresence(By.name("email"));
			logIn.assertElementPresence(By.name("passwd"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Forgot your password?\")]"));
			logIn.assertElementPresence(By.name("SubmitLogin"));
			
		} catch (Exception err) {
			System.out.println(err);
		}
	}
	
	@Test (priority = 2)
	public void loginWithoutCredentials() {
		try {
			//no password
			logIn.setEmailField(By.name("email"), "email@gmail.com");
			logIn.setPassword(By.name("passwd"), "");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Password is required.\")]"));

			//no email
			logIn.setEmailField(By.name("email"), "");
			logIn.setPassword(By.name("passwd"), "@#password#");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"An email address required.\")]"));
			
			//no email and password
			logIn.setEmailField(By.name("email" ), "");
			logIn.setPassword(By.name("passwd"), "");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"An email address required.\")]"));
	
		} catch (Exception  err){
			System.out.println(err);
		}
	}
	
	@Test (priority = 3)
	public void loginWithInvalidCredentials() {
		try {
			//invalid email
			logIn.setEmailField(By.name("email"), "emco@email.com");
			logIn.setPassword(By.name("passwd"), "aeret");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Authentication failed.\")]"));
			
			//invalid password
			logIn.setEmailField(By.name("email"), "email@email.com");
			logIn.setPassword(By.name("passwd"), "aeret");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Authentication failed.\")]"));
			
			//invalid email and password
			logIn.setEmailField(By.name("email"), "emco@email.com");
			logIn.setPassword(By.name("passwd"), "asddsa");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Authentication failed.\")]"));

		} catch (Exception err) {
			System.out.println(err);
		}
	}
	
	@Test (priority = 4)
	public void invalidEmailFormat() {
		try {
			//invalid email format
			logIn.setEmailField(By.name("email"), "emco@email");
			logIn.clickButton(By.name("SubmitLogin"));
			logIn.assertElementPresence(By.xpath("//*[contains(text(),\"Invalid email address.\")]"));
		} catch (Exception err) {
			System.out.println(err);
		}
	}
	
	@Test (priority = 5)
	public void successfulLogIn() {
		try {
			logIn.setEmailField(By.name("email"), "email@email.com");
			logIn.setPassword(By.name("passwd"), "asddsa");
			logIn.clickButton(By.name("SubmitLogin"));
		} catch (Exception err) {
			System.out.println(err);
		}
	}
	
	
	@AfterClass
	public void tearDown() {
		DataUtils.driver.quit();
	}
}
