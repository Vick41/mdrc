package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {


	public ViewLeadPage() {

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(how=How.LINK_TEXT, using="Edit")
	private WebElement eleEdit;
	public UpdateLeadFormPage clickEdit() {
		click(eleEdit);
		return new UpdateLeadFormPage();
	}
	
	

	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleDelete;
	public void clickDelete() {
		click(eleDelete);
	
	}
		
		
		
	
	




}


