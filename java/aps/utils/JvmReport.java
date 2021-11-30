package aps.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateReport(String jsonPath) {
		File srcPath = new File(System.getProperty("user.dir")+
				"\\target\\Reports\\JvmReport");
		//details of report
		Configuration con = new Configuration(srcPath, "Amazon Task");
		con.addClassifications("Platform","Windows 10");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Browser Version", "96.0.4664.45");
		
		//converting String into List<String>
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		//Call generateReport() method from ReportBuilder class
		ReportBuilder rep = new ReportBuilder(li, con);
		rep.generateReports();
	}

}
