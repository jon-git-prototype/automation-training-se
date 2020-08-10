package pageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.MainPage;
import pageObject.SignInPage;

public class SignInPageTest extends SignInPage {


@Test
	public void LoginInValidUser() {
	  LaunchBrowser("https://opensource-demo.orangehrmlive.com/");
	  loginValidUser("Admin", "admin123");
	}

@Test
	public void ValidateUser() {
	  MainPage mainpage = new MainPage(driver);
	  Assert.assertEquals(mainpage.getMessageText(), "Welcome Admin");
  	}
  

}
