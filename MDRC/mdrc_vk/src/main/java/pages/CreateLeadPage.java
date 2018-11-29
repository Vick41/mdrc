package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {


	public CreateLeadPage() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(how=How.ID, using="createLeadForm_companyName")
	private WebElement eleTypeCompanyName;
	public CreateLeadPage typeCompanyName(String Data) {

		type(eleTypeCompanyName, Data);
		
		return this;
		

	}

	@FindBy(how=How.ID, using="createLeadForm_firstName")
	private WebElement eleTypeFirstName;
	public CreateLeadPage typeFirstName(String Data) {

		type(eleTypeFirstName, Data);
		
		return this;
		

	}
	
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleTypeLastName;
	public CreateLeadPage typeLastName(String Data) {

		type(eleTypeLastName, Data);
		
		return this;
		

	}
	
	
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	private WebElement eleTypeSubmit;
	
	public void clickSubmit() {

		click(eleTypeSubmit);
		
		

	}
	
	
	
	
	
}

