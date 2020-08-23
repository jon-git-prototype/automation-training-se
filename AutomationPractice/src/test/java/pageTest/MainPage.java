package pageTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import pageObject.MainPageBase;

public class MainPage extends MainPageBase {


  
  @BeforeClass
  public void LaunchPage() {
	  
	  OpenBrowser("http://automationpractice.com/");
	  
  }
  
  @Test(priority =1)
  public void selectBlouse() throws InterruptedException {
	  
	  Actions action = new Actions(driver);
	  
	  Thread.sleep(5000);
	  
	  WebElement moveMouse = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]"));  
	  action.moveToElement(moveMouse).perform();
	  
	  WebElement quickView = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[2]/span"));
	  action.moveToElement(quickView).perform();
	  quickView.click();
  }
  
  @Test(priority =2)
  public void addToCart() throws InterruptedException {
	  
	  Actions action = new Actions(driver);
	  Thread.sleep(7000);
	  driver.switchTo().frame(1);
	  WebElement add2Cart = driver.findElement(By.name("Submit"));
	  action.moveToElement(add2Cart);
	  add2Cart.click();
	  
	 //WebElement frameID = driver.findElement(By.xpath("//*[@id=\"fancybox-frame1597910408291\"]"));
	  //driver.switchTo().frame(frameID);
	  //driver.findElement(By.name("Submit")).click();
	  //driver.switchTo().defaultContent();
	  final List<WebElement> iframes = driver.findElements(By.id("layer_cart"));
	  System.out.println(iframes);
	  //driver.switchTo().defaultContent();
	  //driver.findElements(by)
	  driver.switchTo().activeElement();
	  WebElement checkOut = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	  checkOut.click();
	  //Alert alerts = driver.switchTo().alert();
	  //String alertM = driver.switchTo().alert().getText();
	  //System.out.println(alertM);
	  
  }
}