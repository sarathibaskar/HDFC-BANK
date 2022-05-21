package step.org;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import libGlobal.BaseClass;

public class Hooks extends BaseClass {
	
	 static final Logger logger=LogManager.getLogger(Hooks.class);

@Before
	public static void fore() {
	PropertyConfigurator.configure("log4j2.properties");
	logger.info("Enter the HDFC bank URL successully ");
		getdriver();
		maximise();
		geturl("https://netbanking.hdfcbank.com/netbanking/");
		implici(10);


	}

	@After
	public static void ter() {
		
		
		logger.info("quit the Browser successfully");
		quit();

	
	
	}
	@AfterStep
	public void git() {
		
	}

}
