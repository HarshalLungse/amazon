package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable {
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("F:\\automation support\\project workspace\\Flipcart\\target\\Reports\\AmazonReportsone.html" , "AmazonProjectByHarshalLungseone" );

		//HTMLReportGenerator.TestSuiteStart("F:\\automation support\\project workspace\\Flipcart\\target\\Reports\\AmazonReports.html" , "AmazonProjectByHarshalLungse" );
		HTMLReportGenerator.TestCaseStart(scenario.toString(), scenario.getStatus().toString());
		System.out.println(".......................................................Scenario Starts.................................................................");
		
	}
	
	
	@After
	public void after(Scenario scenario)
	{
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
		System.out.println("........................................................Scenario Ends...................................................................");
		
	}
	
	
	
	
	
	
	
	

}
