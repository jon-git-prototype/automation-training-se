package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInPage {
	protected static WebDriver driver;
	
	//Open the URL
	public void LaunchBrowser(String strURL) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(strURL);
	}

	// <input name="user_name" type="text" value="">
	private By usernameBy = By.id("txtUsername");
	// <input name="password" type="password" value="">
	private By passwordBy = By.id("txtPassword");
	// <input name="sign_in" type="submit" value="SignIn">
	private By loginBy = By.id("btnLogin");
	

	public void loginValidUser(String userName, String password) {
	    driver.findElement(usernameBy).sendKeys(userName);
	    driver.findElement(passwordBy).sendKeys(password);
	    driver.findElement(loginBy).click();
	    //return new MainPage(driver);
	  }
	

}
