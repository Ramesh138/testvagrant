package com.testvagrant.flows;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstAPITest {
	@Test
	public void GetWeatherDetaiCity()
	{
		RestAssured.baseURI = "https://openweathermap.org/current/";
		RequestSpecification httpRequest = RestAssured.given();
		Response res = httpRequest.header("key","7fe67bf08c80ded756e598d6f8fedaea").get();
		int statusCode = res.getStatusCode();
		System.out.println(res.asString());
	}
}