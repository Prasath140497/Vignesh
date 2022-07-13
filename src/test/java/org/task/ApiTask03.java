package org.task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiTask03 {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// mention the path of json
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\MavenHari\\src\\test\\resources\\Api02.json");
		//create object for object mapper class
		ObjectMapper mapper = new ObjectMapper();
		//pass the json file to fetch value
		Data readValue = mapper.readValue(file, Data.class);
		//int page = readValue.getPage();
		//System.out.println(page);
		//Details
		ArrayList<Data>Details = readValue.getDetails();
		for(Data x : Details) {
			int page = x.getPage();
			System.out.println(page);
		}
		
		
		
	}
	
	
	
}

