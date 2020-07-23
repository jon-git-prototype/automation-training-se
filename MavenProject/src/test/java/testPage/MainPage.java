package testPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.MainPageBase;

public class MainPage extends MainPageBase{
  @Test
  public void LaunchBrowser() {
  
	OpenBrowser("https://www.facebook.com");
}
}
