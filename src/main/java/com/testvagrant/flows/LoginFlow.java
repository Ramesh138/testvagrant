package com.testvagrant.flows;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.testvagrant.basedriver.BaseClass;
import com.testvagrant.pages.LoginPage;
import com.testvagrant.utility.Utils;

public class LoginFlow extends BaseClass{


	public LoginFlow(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	LoginPage login = new LoginPage(driver);
	
	public void displayLocation() throws Throwable {
		login.findLocation();
	}
}
