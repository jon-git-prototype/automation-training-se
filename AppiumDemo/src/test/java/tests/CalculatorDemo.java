package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
/**
 * Created by ONUR on 03.04.2016.
 */
public class CalculatorDemo {
 
    static AppiumDriver<MobileElement> driver;
 
    @BeforeClass
    public void setUp() throws MalformedURLException{
        //Set up desired capabilities and pass the Android app-activity
        //and app-package to Appium
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability("BROWSER_NAME", "Emulator2");
        capabilities.setCapability("deviceName","Emulator3");
        capabilities.setCapability("UDID", "emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion", "9");
 
        // This package name of your app (you can get it from apk info app)
        capabilities.setCapability("appPackage", "com.android.calculator2");
 
        // This is Launcher activity of your app (you can get it from apk info app)
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
 
        //Create RemoteWebDriver instance and connect to the Appium server
        //It will launch the Calculator App in Android Device using the configurations
        //specified in Desired Capabilities
        
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,capabilities);
       // driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   }
 
  @Test
   public void testCal() throws Exception {
        //locate the Text on the calculator by using By.name()
        MobileElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click(); 
        MobileElement plus = driver.findElement(By.id("com.android.calculator2:id/op_add"));
        plus.click();   
        MobileElement four = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        four.click();
        MobileElement equalTo = driver.findElement(By.id("com.android.calculator2:id/eq"));
        equalTo.click();   
        //locate the edit box of the calculator by using By.tagName()
        //MobileElement results=driver.findElement(By.id("com.android.calculator2:id/formula"));
        MobileElement results1=driver.findElement(By.id("com.android.calculator2:id/result"));
        
        //Check the calculated value on the edit box
        assert results1.getText().toString().equals("6"):"Actual value is : "
                +results1.getText()+" did not match with expected value: 6";
    }
 
 /*   @AfterClass
    public void teardown(){
        //close the app
        driver.quit();
    } */
}