package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.testvagrant.basedriver.BaseClass;
import com.testvagrant.utility.Utils;

public class LoginPage extends BaseClass {

	@FindBy(xpath = ".//*[@class='recent-location-name']")
	WebElement location;	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void findLocation() throws Throwable {
		Thread.sleep(1000);
		String value=location.getText();
		System.out.println("Location displaying as " + value);
		Reporter.log("Location displaying as " + value);
		Thread.sleep(1000);
	}
	
}
