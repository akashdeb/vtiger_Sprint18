package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {

	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "salutationtype")
	private WebElement leadSalutationDropdown;

	@FindBy(name = "firstname")
	private WebElement leadFirstnameTextfield;

	@FindBy(name = "lastname")
	private WebElement leadLastnameTextfield;

	@FindBy(name = "company")
	private WebElement leadCompanynameTextfield;

	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement leadSaveButton;

	public WebElement getLeadSalutationDropdown() {
		return leadSalutationDropdown;
	}

	public WebElement getLeadFirstnameTextfield() {
		return leadFirstnameTextfield;
	}

	public WebElement getLeadLastnameTextfield() {
		return leadLastnameTextfield;
	}

	public WebElement getLeadCompanynameTextfield() {
		return leadCompanynameTextfield;
	}

	public WebElement getLeadSaveButton() {
		return leadSaveButton;
	}

	public void selectFromLeadSalutationDropdown(String salutation) {
		Select select = new Select(leadSalutationDropdown);
		select.selectByVisibleText(salutation);
	}

	public void enterLeadFirstName(String leadFirstName) {

		leadFirstnameTextfield.sendKeys(leadFirstName);
	}

	public void enterLeadLastName(String leadLastName) {

		leadLastnameTextfield.sendKeys(leadLastName);
	}

	public void enterLeadCompanyName(String leadCompanyName) {

		leadCompanynameTextfield.sendKeys(leadCompanyName);
	}

	public void clickOnSaveButton() {
		leadSaveButton.click();
	}

}
