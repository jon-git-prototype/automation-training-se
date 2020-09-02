package testPage;

import org.testng.annotations.Test;
import pageObject.MainPageBase;

public class MainPage extends MainPageBase{
  @Test
  public void LaunchBrowser() {
  
	OpenBrowser("https://www.facebook.com");
}
}
