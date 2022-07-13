package org.task;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiTask02 {
 public static void main(String[] args) throws IOException, ParseException {
	//mention the path of json
	 FileReader filereader = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\MavenHari\\src\\test\\resources\\Api01.json");
	 //create object for jsonparser class
	 JSONParser jsonParser = new JSONParser();
	 //pass the Json file to feath values
	 Object object = jsonParser.parse(filereader);
	 //convert object to JSONobject (classcast)
	 JSONObject rk = (JSONObject) object;
	 Object object2 = rk.get("page");
	 System.out.println("page:"+object2);
	 Object object3 = rk.get("per_page");
	 System.out.println("per_page:"+object3);
	 Object object4 = rk.get("total");
	 System.out.println("total:"+object4);
	 Object object5 = rk.get("total_pages");
	 System.out.println("totel_pages:"+object5);
	 System.out.println("================");
	 
	 Object object6 = rk.get("data");
	 //create json array
	 JSONArray array = (JSONArray) object6;
	 for (int i=0;i<array.size();i++) {
		 Object object7 = array.get(i);
	 JSONObject sk = (JSONObject) object7;
	 System.out.println(sk.get("id"));
	 System.out.println(sk.get("email"));
	 System.out.println(sk.get("first_name"));
	 System.out.println(sk.get("last_name"));
	 System.out.println(sk.get("avatar"));
	 
		 
	 }
	 
	 
	 
}
}
