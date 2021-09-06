package test_appium;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Test_appium {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openCalculator();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();

		}

	}
	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus Nord");
		cap.setCapability("udid", "5c3eaee3");
		cap.setCapability("platformName", "Android");
		
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");

		//File file = new File("C:\\Intellihealth\\apk files\\Phase_V1.4_19_08 .apk");
		//cap.setCapability("app", file.getAbsolutePath());
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application started");
		//driver.findElement(By.xpath("//*[@text() = 'evolve_v1']")).click();
		//driver.findElement(By.xpath("//*[@text='Email Address']")).sendKeys("api@bmiq.com");
		//driver.findElement(By.xpath("//*[@text='Password']")).sendKeys("Password1*");
		driver.quit();
		
}}
