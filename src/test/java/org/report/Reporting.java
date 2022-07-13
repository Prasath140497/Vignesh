package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	
	public static void generateJVMReport(String jsonFile) {
	
	//1.Mention the path of JVM report where to create(store?)
		
		File file = new File (System.getProperty("user.dir")+"//target");
		
		//2.create the object for configuration class
		
		Configuration configuration = new Configuration(file, "facebook automation");
		
		//3.Mention the OS,browser,version,sprint
		
		configuration.addClassifications("os", "win10");
		configuration.addClassifications("browser", "chrome");
		configuration.addClassifications("version", "108");
		configuration.addClassifications("sprint", "35");
		
		//4.create the object for report builder class to fetch results from json
		
		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder =new ReportBuilder(jsonFiles, configuration);
		
		builder.generateReports();
		
		
		
		
		

}
}
