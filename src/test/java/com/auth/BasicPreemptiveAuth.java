package com.auth;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicPreemptiveAuth {
	@Test
	public void basicPreemtiveAuth() {
		int code = RestAssured.given().
		auth().preemptive().
		basic("postman", "password")
		.when()
		.get("https://postman-echo.com/basic-auth")
		.
		getStatusCode()
		;
		
		System.out.println("The status code is :"+code);
		Assert.assertEquals(code, 200);
		
		
		
	}

}
