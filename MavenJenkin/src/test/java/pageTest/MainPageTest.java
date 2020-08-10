package pageTest;

import org.testng.annotations.Test;
import pageObject.MainPageBase;
import pageObject.PageObjectBase;

public class MainPageTest extends PageObjectBase{
 
	
  @Test
  public void LaunchBrowser() {  
	  OpenBrowser("http://automationpractice.com/");
  }
  
  @Test
  public void AddToCart() {
	  //HoverOver();
	  
  }
}
