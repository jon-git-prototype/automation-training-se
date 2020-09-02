package pageTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
	  //action.moveToElement(add2Cart);
	  add2Cart.click();
	  
	  //Thread.sleep(5000);
	  WebElement element = (new WebDriverWait(driver, 3000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")));
	  System.out.println(element);
	  //action.moveToElement(WebDriverWait(driver, 3000)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")));
	  //action.moveToElement(element).perform();
	//span[contains(text(), \"Proceed to checkout\")]
	  //Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), \"Proceed to checkout\")]"))).isDisplayed();
	  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2/i")).isDisplayed());
	  
	  WebElement checkOut = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	  checkOut.click();
	  
  }
}