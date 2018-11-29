package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsFormPage extends ProjectMethods {


	public MergeLeadsFormPage() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(how=How.XPATH, using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadInput;
	public MergeLeadsFormPage clickFromLeadInput() {
		click(eleFromLeadInput);
		return this;
	}


	public MergeLeadsFormPage actionSwitchToWindow(int index) {
		switchToWindow(index);
		return this;
	}


	/*@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	private WebElement eleMergeFirstName;
	public MergeLeadsFormPage typeFirstName(String MergeFirstName) {
		type(eleMergeFirstName, MergeFirstName);
		return this;
	}*/


	@FindBy(how=How.LINK_TEXT, using="10037")
	private WebElement eleFirstName;
	public MergeLeadsFormPage clickFirstLeadFromLeadList() {
		click(eleFirstName);
		return this;

	}

	public MergeLeadsFormPage actionSwitchBackToWindow(int index) {
		switchToWindow(index);
		return this;
	}


	@FindBy(how=How.XPATH, using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadInput;
	public MergeLeadsFormPage clickToLeadInput() {
		click(eleToLeadInput);
		return this;
	}


	public MergeLeadsFormPage actionSwitchToWindow2(int index) {
		switchToWindow(index);
		return this;
	}


	@FindBy(how=How.LINK_TEXT, using="10038")
	private WebElement eleSecondLeadId;
	public MergeLeadsFormPage clickSecondLeadFromList() {
		click(eleSecondLeadId);
		return this;
	}


	public MergeLeadsFormPage actionSwitchToWindow3(int index) {
		switchToWindow(index);
		return this;
	}


	@FindBy(how=How.LINK_TEXT, using="Merge")
	private WebElement eleMergeButton;
	public void clickMergeButton() {
		click(eleMergeButton);
	}

}


//input[@name='firstName']