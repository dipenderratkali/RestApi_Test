import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Restdemo1 {
	
	@Test (priority=1)
	public void GetProductDetails()
	{
		RestAssured.baseURI = "http://localhost:3030/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"products");
		String responseBody = response.getBody().prettyPrint();
		System.out.println("Response Body is =" +responseBody);
		int statuscode = response.getStatusCode();
		Assert.assertEquals("OK",200,statuscode);
	}

	@Test (priority=2)
	public void GetCategoriesDetails()
	{
		RestAssured.baseURI = "http://localhost:3030";
		RequestSpecification httpRequest = RestAssured.given();
		Response response1 = httpRequest.get("/categories");
		//String responseBody1 = response1.getBody().asString();
		String responseBody1 = response1.getBody().prettyPrint();
		System.out.println("Response Body is = " +responseBody1);
		int StatusCode1 = response1.getStatusCode();
		//System.out.println("" +StatusCode1);
		Assert.assertEquals("OK", 200, StatusCode1);
	}
	@Test (priority=3)
	public void GetStoresDetails()
	{
	RestAssured.baseURI = "http://localhost:3030";
	RequestSpecification httpRequest = RestAssured.given();
	Response response2 = httpRequest.get("/stores");
	String responseBody2 = response2.getBody().prettyPrint();
	System.out.println("Response Body is = " +responseBody2);
	int StatusCode2 = response2.getStatusCode();
	Assert.assertEquals("OK", 200, StatusCode2);
	}
	@Test (priority=4)
	public void GetServicesDetails()
	{
		RestAssured.baseURI = "http://localhost:3030/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response3 = httpRequest.get("/services");
		String responseBody3 = response3.getBody().prettyPrint();
		System.out.println("Response Body is = " +responseBody3);
		int StatusCode3 = response3.getStatusCode();
		Assert.assertEquals("OK", 200, StatusCode3);
	}
	@Test (priority=5)
	public void GetVersionDetails()
	{
		RestAssured.baseURI = "http://localhost:3030/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response4 = httpRequest.get("/version");
		String responseBody4 = response4.getBody().prettyPrint();
		System.out.println("Response Body is = " +responseBody4);
		int StatusCode4 = response4.getStatusCode();
		Assert.assertEquals("OK", 200, StatusCode4);
	}
	@Test (priority=6)
	void GetHealthcheckDetails()
	{
		RestAssured.baseURI = "http://localhost:3030/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response5 = httpRequest.get("/healthcheck");
		//String responseBody5 = response5.getBody().asString();
		String responseBody5 = response5.getBody().prettyPrint();
		System.out.println("Response Body is = " +responseBody5);
		int StatusCode5 = response5.getStatusCode();
		Assert.assertEquals("OK", 200, StatusCode5);
	}
}
