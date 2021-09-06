package test_mob;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Test_mob {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("deviceName", "OnePlus Nord");
		caps.setCapability("udid", "5c3eaee3");
		caps.setCapability("platformName", "Android");
		
		caps.setCapability("platformVersion", "11");
		caps.setCapability("appPackage", "com.evolve_v1");
		caps.setCapability("appActivity", "com.evolve_v1.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebElement findElement = driver.findElement(MobileBy.xpath("//*[@text='Email Address']"));
        findElement.sendKeys("api@bmiq.com");
        System.out.println("Email entered Successfully");

	}

}
