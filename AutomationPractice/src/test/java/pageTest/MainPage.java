package pageTest;

import org.testng.annotations.Test;

import pageObject.MainPageBase;

public class MainPage extends MainPageBase {
  @Test
  public void LaunchPage() {
	  
	  OpenBrowser("http://automationpractice.com/");
	  
  }
  
  
}
 