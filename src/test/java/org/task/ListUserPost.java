package org.task;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ListUserPost {
	static RequestSpecification reqspec;
	
	public static void main(String[] args) {
		
		//1.Initialize RestAssures class
		 reqspec = RestAssured.given();
		
		 //2.Header.params,Auth,Body....Header Details
		 
		    reqspec = reqspec.header("content-Type","application/Json");
		    
		    //3.payload/paybody
		   
	       
		
	}
}
	


