package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class WishTest {
	static AppiumDriver<MobileElement> driver;
	
  @Test
  public void GetStarted() throws MalformedURLException, Exception {

	DesiredCapabilities caps = new DesiredCapabilities();
	
	caps.setCapability("deviceName", "Emulator3");
	caps.setCapability("UDID", "emulator-5554");
	caps.setCapability("platformName","Android");
	caps.setCapability("platformVersion", "9");
	
	caps.setCapability("appPackage", "com.contextlogic.wish");
	caps.setCapability("appActivity", "com.contextlogic.wish.activity.browse.BrowseActivity");
	//caps.setCapability("appWaitActivity", "com.contextlogic.wish");
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
    driver = new AppiumDriver<MobileElement>(url,caps);
    
    
    
    Thread.sleep(3000);
    MobileElement header = driver.findElement(By.id("com.contextlogic.wish:id/page_title"));
    System.out.println(header.getText());
    
    MobileElement getStarted = driver.findElement(By.id("com.contextlogic.wish:id/page_button"));
    		getStarted.click();
    		
    
	  
  }
}
