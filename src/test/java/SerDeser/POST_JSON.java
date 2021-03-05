package SerDeser;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import SerDeser.Fields;
import SerDeser.IssueType;
import SerDeser.Payload;
import SerDeser.Project;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST_JSON {
	@Test
	public void postRequest() {
		//specify uri
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//create json payload
		IssueType issueType = new IssueType("3");
		Project id = new Project("1000");
		Payload p = new Payload("Demo1_Summary", "Demo1_Description", issueType, id);
		Fields f = new Fields(p);
	ObjectMapper obj = new ObjectMapper();
		
		//attach header
		httpRequest.header("Content-Type", "application/json");
		
		//attach data to request
		httpRequest.body(f);
		
		//create post request
		Response response = httpRequest.request(Method.POST,"/api/users");
		
		//response body.should convert response to string to get this
		String responseBody = response.getBody().asString();
				
				
		System.out.println("The response body received is: "+responseBody);
				
		//status code
				
		int statusCode = response.getStatusCode();
		System.out.println("The status code is: "+statusCode);
		Assert.assertEquals(statusCode, 201);

}
}