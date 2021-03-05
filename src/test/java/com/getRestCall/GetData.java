package com.getRestCall;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {
	@Test(priority =2,dependsOnMethods = "testResponseData")
	public void testResponseCode() {
		Response resp = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=6034965e0b17627f1edb22076d94b8970" 
				);
		int stautsCode = resp.getStatusCode();
		System.out.println("The stautsCode is: "+stautsCode);
		assertEquals(stautsCode, 200);
	}

	@Test(priority = 1)
	public void testResponseData() {
		Response resp = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=6034965e0b17627f1edb22076d94b8970" 
				);
		long respTime = resp.getTime();
		
		System.out.println("The respTime is: "+respTime);
		long respTimeExpec = 350;
		Assert.assertTrue(respTime<=respTimeExpec,"Slower response");
		
	}
}
