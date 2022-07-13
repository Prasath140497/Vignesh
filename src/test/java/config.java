import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	public static void main(String[] args) throws IOException {
		
		//1.Mention the path of the property file
		
		FileInputStream stream = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\MavenHari\\src\\test\\java\\config.java");
		
		//2.create object for properties file
	 Properties properties = new Properties();
	 
	 //3.pass the property file to fetch values
	 
	 properties.load(stream);
	 //4.pass the key&7values as object
	 Object object = properties.get("password");
	 
	 String name = (String) object;
	  System.out.println(name);
	 
	 
	}

}
