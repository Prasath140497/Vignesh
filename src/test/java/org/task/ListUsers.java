package org.task;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ListUsers {
	
	public static void main(String[] args) {
		
		//1.Initialize RestAssured Class
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		//2.Header,Parameters,Auth,Body ....HeaderDetails
		RequestSpecification requestSpecification2 = requestSpecification.header("content-Type","application/Json");
		
		//3.Query parameter
		RequestSpecification requestSpecification3 = requestSpecification2.queryParam("page", "2");
		
		//4.pass the req type and Endpoint
		Response response = requestSpecification3.get("https://reqres.in/api/users");
		
		//5.Get the rescode/Status code
		
		ResponseBody body = response.getBody();
		
		//6.asstring
		
		String asString = body.asString();
		System.out.println(asString);
		
		//7.asPretty String
		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);
		
		
		
	}

}
