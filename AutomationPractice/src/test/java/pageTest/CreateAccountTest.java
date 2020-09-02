package pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import pageObject.CreateAccountPage;
import pageObject.LoginPage;
import utils.DataUtils;


public class CreateAccountTest {
	public WebDriver driver;
	
	DataUtils browser = new DataUtils();
	LoginPage logIn = new LoginPage();
	CreateAccountPage create = new CreateAccountPage();
	
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
	public void createAccountWindow() {
		
		create.assertElementPresence(By.xpath("//*[contains(text(),\"Create an account\")]"));
		create.assertElementPresence(By.id("email_create"));
		create.assertElementPresence(By.id("SubmitCreate"));
		
	}
	
	@Test (priority = 2)
	public void authenticateEmail() {
		
		//invalid email
		create.textField(By.id("email_create"), "email@email");
		create.clickButton(By.id("SubmitCreate"));
		create.assertElementPresence(By.xpath("//div[@class=\"form-group form-error\"]"));
		create.assertElementPresence(By.xpath("//*[contains(text(),\"Invalid email address.\")]"));
		
		//already registered email
		create.textField(By.id("email_create"), "email@email.com");
		create.clickButton(By.id("SubmitCreate"));
		create.assertElementPresence(By.xpath("//div[@class=\"form-group form-ok\"]"));
		create.assertElementPresence(By.xpath("//*[contains(text(),\"An account using this email address has already been registered.\")]"));

		//new email
		create.textField(By.id("email_create"), "newemail@email.com");
		create.clickButton(By.id("SubmitCreate"));
		create.assertElementPresence(By.xpath("//div[@class=\"form-group form-ok\"]"));
		create.assertElementPresence(By.id("account-creation_form"));

	}
	
	public void newTest() {
		System.out.println("Test");
	}
	
	@AfterClass
	public void tearDown() {
		DataUtils.driver.quit();
	}
	
	
}
