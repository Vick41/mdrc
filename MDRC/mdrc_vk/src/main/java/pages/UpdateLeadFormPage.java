package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UpdateLeadFormPage extends ProjectMethods {


	public UpdateLeadFormPage() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(how=How.XPATH, using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstNameField;
	public UpdateLeadFormPage typeFirstName(String data) {
		type(eleFirstNameField, data);
		return this;
	}


	@FindBy(how=How.XPATH, using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateButton;
	public ViewLeadPage2 clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewLeadPage2();
	}
}











