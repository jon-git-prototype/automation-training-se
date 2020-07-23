package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
				
	}
	
}
