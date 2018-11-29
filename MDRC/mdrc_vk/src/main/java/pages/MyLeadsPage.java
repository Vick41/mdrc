package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {


	public MyLeadsPage() {

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(how=How.LINK_TEXT, using="BinodiniEdit")
	private WebElement eleLeadFirstName;
	public ViewLeadPage clickLeadFirstName() {
		click(eleLeadFirstName);
		return new ViewLeadPage();
		
		
	}
	
	
	@FindBy(how=How.LINK_TEXT, using="Merge Leads")
	private WebElement eleMergeLeads;
	public MergeLeadsFormPage clickMergeLeads() {
		click(eleMergeLeads);
		return new MergeLeadsFormPage();
	}

	
	
	@FindBy(how=How.LINK_TEXT, using="10064")
	private WebElement eleLeadFirstName_Delete;
	public ViewLeadPage clickLeadFirstName_Delete() {
		click(eleLeadFirstName_Delete);
		return new ViewLeadPage();
		
		
	}
	




}


