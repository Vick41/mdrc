package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage2 extends ProjectMethods {


	public ViewLeadPage2() {

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	public ViewLeadPage2 verifyFirstNameEdit(String fName) {
		verifyExactText(eleVerifyFirstName, fName);
		return this;
	}
		
		
		
	
	




}


