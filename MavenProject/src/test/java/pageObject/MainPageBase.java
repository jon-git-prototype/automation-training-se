package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MainPageBase {
	
	public static WebDriver driver;

	public void OpenBrowser(String URL) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);			
	}
	
	public void CloseBrowser() {
		
		driver.quit();
	}
	
}
