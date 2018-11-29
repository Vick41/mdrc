package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Delete Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC005";

	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd) {
		new LoginPage().typeUserName(uName).typePassword(pwd).clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickLeadFirstName_Delete()
		.clickDelete();
	}
}




