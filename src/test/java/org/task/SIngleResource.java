package org.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SIngleResource {
	


public static void main(String[] args) {
	
	//1,Initialize RestAssured Class
	RequestSpecification requestSpecification = RestAssured.given();
	//2.Headers,Parameters,Auth,Body....Header details
	 RequestSpecification requestSpecification2 = requestSpecification.header("Content-Type","application/Json");
	//3.Query Parameter
	RequestSpecification requestSpecification3 = requestSpecification.queryParam("2");
	//4.pass the reqtype and Endpoint
	Response response = requestSpecification3.get("https://reqres.in/api/unknown/2");
	//5.Get the rescode/status code
    ResponseBody body = response.getBody();
	//6.asString
	//String asString = body.asString();
	//System.out.println(asString);
	//asPretty String
	String asPrettyString = body.asPrettyString();
	System.out.println(asPrettyString);
	
	
}

}