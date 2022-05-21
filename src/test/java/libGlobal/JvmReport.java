package libGlobal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void reportgeneation(String json) {
File file=new File("C:\\Users\\uae\\eclipse-workspace\\HDFCbank\\src\\test\\resources\\HDFC.features\\Report");
		Configuration config=new Configuration(file, "HDFC");
		config.addClassifications("platform", "Windows 11");
		config.addClassifications("Browser", "GoogleChrome");
		config.addClassifications("Browser version", "10");
		
		List<String> list=new ArrayList<String>(); {
			list.add(json);
			ReportBuilder builder=new ReportBuilder(list, config);
			builder.generateReports();
			
		
		
		
	}
	

}
}