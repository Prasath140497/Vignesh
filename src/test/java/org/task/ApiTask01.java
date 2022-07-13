package org.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bouncycastle.asn1.dvcs.Data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiTask01 {
	public static void main(String[] args) throws IOException, ParseException {
		// mention the path of json
		FileReader filereader = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\MavenHari\\src\\test\\resources\\Api.json");
		// create object for json parser class
		JSONParser jsonParser = new JSONParser();
		//pass the json file to fetch values
		Object object = jsonParser.parse(filereader);
		//convert object to JSON object 
		JSONObject k = (JSONObject) object;
		//pass the key and return the values
	   Object object2 = k.get("data");
		//System.out.println(object2);
		Object object3 = k.get("support");
		//System.out.println(object3);
		JSONObject data = (JSONObject) object2;
		JSONObject support = (JSONObject) object3;
		System.out.println(data);
		System.out.println(support);
	    System.out.println(data.get("id"));
	    System.out.println(data.get("email"));
	    System.out.println(data.get("first_name"));
	    System.out.println(data.get("last_name"));
	    System.out.println(data.get("avatar"));
	    System.out.println(support.get("url"));
	    System.out.println(support.get("text"));
		
		}
		
	}


