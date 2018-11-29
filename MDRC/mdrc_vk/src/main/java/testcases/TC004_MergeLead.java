package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Merge Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC004";

	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd) {
		new LoginPage().typeUserName(uName).typePassword(pwd).clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadInput()
		.actionSwitchToWindow(1)
		.clickFirstLeadFromLeadList()
		.actionSwitchBackToWindow(0)
		.clickToLeadInput()
		.actionSwitchToWindow2(1)
		.clickSecondLeadFromList()
		.actionSwitchToWindow3(0)
		.clickMergeButton();
	}
}




