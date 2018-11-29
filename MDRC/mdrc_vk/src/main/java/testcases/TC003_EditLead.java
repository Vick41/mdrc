package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditLead extends ProjectMethods {

	@BeforeTest
	public void setData() {
		browserName = "chrome";
		testCaseName = "TC003";
		testDescription = "Edit Leads";
		testNodes = "Leads";
		category = "smoke";
		authors = "sarath";
		dataSheetName  = "TC003";

	}

	@Test(dataProvider="fetchData")
	public void createLead(String uName, String pwd, String fName) {
		new LoginPage().typeUserName(uName).typePassword(pwd).clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickLeadFirstName()
		.clickEdit()
		.typeFirstName(fName).clickUpdateButton()
		.verifyFirstNameEdit(fName);
	}
}




