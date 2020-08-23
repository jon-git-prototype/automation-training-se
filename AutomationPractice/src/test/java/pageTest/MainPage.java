package pageTest;

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
	  //driver.switchTo().
	  //WebElement add2Cart = driver.findElement(By.xpath("/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button"));
	  //action.moveToElement(add2Cart);
	 // add2Cart.click();
	  
	 //WebElement frameID = driver.findElement(By.xpath("//*[@id=\"fancybox-frame1597910408291\"]"));
	  //driver.switchTo().frame(frameID);
	  //driver.findElement(By.name("Submit")).click();
	  
	  String frame = driver.getTitle();
	  System.out.println(frame);
	  
	  Alert alerts = driver.switchTo().alert();
	  String alertM = driver.switchTo().alert().getText();
	  System.out.println(alertM);
	  
  }
}