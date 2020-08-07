package InitialTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class HelloWorld {
	
  public static WebDriver driver;
  @Test
  public void InitialTest() {
	  System.out.println( "Hello World!" );

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
	  
  }
}
