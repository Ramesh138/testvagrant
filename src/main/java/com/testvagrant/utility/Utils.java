package com.testvagrant.utility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import com.testvagrant.basedriver.BaseClass;

public class Utils extends BaseClass {
	

	@SuppressWarnings("deprecation")
	public static void openBrowser(String url) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("disable-popup-blocking"); 
		driver = new ChromeDriver(options); 
		driver.navigate().to(url);
		Thread.sleep(500);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
	}

	public static void closeBrowser() {
		driver.close();
		driver.quit();
		
	}

	public static void verifyMessage(String actualValue, String expectedValue) {

		if (actualValue.equalsIgnoreCase(expectedValue)) {
			assertEquals(expectedValue, actualValue);
			Reporter.log(actualValue.trim() + " is succesfully verified  with " + expectedValue.trim());
		} else {
			Reporter.log(actualValue + " is not matched with " + expectedValue);
		}

	}

}
