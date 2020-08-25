package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
	  protected static WebDriver driver;

	  // <h1>Hello userName</h1>
	  private By messageBy = By.xpath("//a[text()=\"Welcome Linda\"]");
	  
	  public MainPage(WebDriver driver){
	    this.driver = driver;
		//System.out.println(driver.getTitle());
	    if (!driver.getTitle().equals("OrangeHRM")) {
	      throw new IllegalStateException("This is not Home Page of logged in user," +
	            " current page is: " + driver.getCurrentUrl());
	    }
	  }

	  /**
	    * Get message (h1 tag)
	    *
	    * @return String message text
	    */
	  public String getMessageText() {
	    return driver.findElement(messageBy).getText();
	  }

	  public MainPage manageProfile() {
	    // Page encapsulation to manage profile functionality
	    return new MainPage(driver);
	  }}