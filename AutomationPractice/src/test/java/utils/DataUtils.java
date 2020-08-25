package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataUtils {
	public static WebDriver driver;
	
	
	
	public void LaunchBrowser(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	
	public static WebElement waitForElementPresence(By selector, int waitInterval) {
		WebElement element = (new WebDriverWait(driver, waitInterval)).until(ExpectedConditions.presenceOfElementLocated(selector));
		return element;
	}

}
