package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import libGlobal.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\HDFC.features\\HDFC.feature",publish=true, glue = "step.org", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:src\\test\\resources\\HDFC.features\\Report\\output,json","rerun:src\\test\\resources\\Failed.txt"},monochrome=true)
public class TestRunner {
	@AfterClass
	public static void after() {
		JvmReport.reportgeneation(
				"C:\\Users\\uae\\eclipse-workspace\\HDFCbank\\src\\test\\resources\\HDFC.features\\Report\\output,json");

	}

}
