package com.testvagrant.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testvagrant.basedriver.BaseClass;
import com.testvagrant.flows.FirstAPITest;
import com.testvagrant.flows.LoginFlow;
import com.testvagrant.utility.Constant;
import com.testvagrant.utility.Utils;

public class Testcase1 extends BaseClass {

	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		Utils.openBrowser(Constant.URL);
	}

	@Test
	public void TC1() throws Throwable {
		LoginFlow obj = new LoginFlow(driver);
		FirstAPITest obj1=new FirstAPITest();
		obj.displayLocation();
		obj1.GetWeatherDetaiCity();
	}

	
	
	@AfterTest
	public void teardown() {
		Utils.closeBrowser();
	}


}
