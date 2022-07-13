import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
		RequestSpecification requestSpecification;
		Response response;

		// 1. Add Header Method for Reusable Code //
		public void addHeader(String key, String value) {
			requestSpecification = RestAssured.given().header(key, value);
		}

		// 2. Add a Query Parameters Method for Reusable Code //
		public void queryParameter(String key, String value) {
			requestSpecification = requestSpecification.queryParam(key, value);
		}

		// 3. Add a Path Parameters Method for Reusable Code //
		public void pathParameter(String key, String value) {
			requestSpecification = requestSpecification.param(key, value);
		}

		// 4. Add a Body Method for Reusable Code //
		public void addBody(String requestBody) {
			requestSpecification = requestSpecification.body(requestBody);
		}

		// 5. Add a Response Method using Switch Case Statements //
		public Response requestType(String requestType, String endPoint) {
			switch (requestType) {
			case "GET":
				response = requestSpecification.get(endPoint);
				break;
			case "POST":
				response = requestSpecification.post(endPoint);
				break;
			case "PUT":
				response = requestSpecification.put(endPoint);
				break;
			case "DELETE":
				response = requestSpecification.delete(endPoint);
				break;
			default:
				break;
			}
			return response;
		}

		// 6. Add a GetstatusCode method for Reusable code //
		public int getStatusCode(Response response) {
			int statusCode = response.getStatusCode();
			return statusCode;
		}

		// 7. Add a GetResponseBody method for Reusable code //
		public ResponseBody getResponseBody(Response response) {
			ResponseBody responseBody = response.getBody();
			return responseBody;
		}

		// 8. Add a GetResponseBodyAsString method for Reusable code //
		public String getResBodyAsString(Response response) {
			String asString = getResponseBody(response).asString();
			return asString;
		}

		// 9. Add a GetResponseBodyAsString method for Reusable code //
		public String getResBodyAsPrettyString(Response response) {
			String asPrettyString = getResponseBody(response).asPrettyString();
			return asPrettyString;
		}

		// 10. Add a Basic Authentication method for Reusable Code //
		public void basicAuthentication(String userName, String password) {
			requestSpecification = requestSpecification.auth().preemptive().basic(userName, password);
		}

		// 11. Add a GetPropertyFileValue method for Reusable Code //
		public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
			Properties properties = new Properties();
			properties.load(new FileInputStream(
					"C:\\Users\\DELL\\eclipse-workspace\\OMRBranchAPIAutomation\\config.properties"));
			Object object = properties.get(key);
			String value = (String) object;
			return value;
		}

	}
