package runnerClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hook extends SeMethods {

	@Before
	public void before() {
		startResult();
		startTestModule("TC002_CreateLeads", "Create Leads");
		test = startTestCase("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("gopi");
		startApp("chrome");	
	}
	
	
	@After
	public void after() {
			closeAllBrowsers();
			endResult();
	}
	
}
