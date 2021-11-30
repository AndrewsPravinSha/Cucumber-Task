package aps.utils;

import java.io.File;

import com.vimalselvam.cucumber.listener.Reporter;

public class ExtentCreport {
	public static void generateExtentReport() {
		
		//adding extent config to the reporter
		File srcPath = new File(
				System.getProperty("user.dir")+"\\Configs\\Extent-Config.xml");
		Reporter.loadXMLConfig(srcPath);
		
		//adding details to the report
		Reporter.setSystemInfo("Username", System.getProperty("user.name"));
		Reporter.setSystemInfo("Timezone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Platform", "Windows 10 "+"64 bit");
		Reporter.setSystemInfo("Browser", "Chrome");
		Reporter.setSystemInfo("Browser Version", "96.0.4664.45");

	}
}
