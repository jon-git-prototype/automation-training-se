package pageTest;

import org.testng.annotations.Test;
import pageObject.MainPageBase;

public class MainPageTest extends MainPageBase{
 
	
  @Test
  public void LaunchBrowser() {  
	  OpenBrowser("http://automationpractice.com/");
  }
  
  @Test
  public void AddToCart() {
	  HoverOver();
	  
  }
}
