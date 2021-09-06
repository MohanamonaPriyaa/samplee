package test_appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Evolve {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus Nord");
		cap.setCapability("udid", "5c3eaee3");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.evolve_v1");
		cap.setCapability("appActivity", "com.evolve_v1.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application started");
		
		driver.findElement(By.xpath("//*[@text() = 'Evolve']")).click();
		//typeText(Evolve.getLocator("//*[@text ='Email Address']"),"api@bmiq.com");
		System.out.println("Application started_1");
		driver.findElement(By.xpath("//*[@text ='Email Address']")).sendKeys("api@bmiq.com");
		System.out.println("Application started_2");
		driver.findElement(By.xpath("//*[@text ='Password']")).sendKeys("Password1*");
		driver.quit();
	}

}
