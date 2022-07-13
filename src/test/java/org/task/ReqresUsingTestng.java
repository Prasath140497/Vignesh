package org.task;

import org.junit.Test;

import com.bass.BassClass;
import com.github.dockerjava.transport.DockerHttpClient.Response;

public class ReqresUsingTestng extends BassClass {

	@Test(priority = 1)
	public void post() {
		addHeader("accept", "application/json");
		addHeader("content-Type", "application/json");
		requestBody("{\r\n" + "  \"id\": 150,\r\n" + "  \"category\": {\r\n" + "    \"id\": 0,\r\n"
				+ "    \"name\": \"dog\"\r\n" + "  },\r\n" + "  \"name\": \"dog\",\r\n" + "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n" + "    {\r\n" + "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n" + "    }\r\n" + "  ],\r\n" + "  \"status\": \"available\"\r\n"
				+ "}");

		Response r = requesttype("POST", "https://petstore.swagger.io/v2/pet");
		System.out.println("REquest code" + getStringCode(r));
		System.out.println(getResBodyAsPrettyString(r));

	}

	@Test(pripority = 2)
	public void get() {
		addHeader("accept", "application/json");
		addHeader("content-Type", "application/json");
		pathparam("page", "150");
		Response r = requesttype("GET", "https://petstore.swagger.io/v2/pet/(page)");
		System.out.println("REquest code" + getStringCode(r));
		System.out.println(getResBodyAsPrettyString(r));

	}

}
