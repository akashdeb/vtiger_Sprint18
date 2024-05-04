package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewOrganizationPage {

	public CreatingNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "accountname")
	private WebElement organizationNameTextField;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement organizationSaveButton;

	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}

	public WebElement getOrganizationSaveButton() {
		return organizationSaveButton;
	}
	
	public void enterOrganizationName(String organizationName) {
		organizationNameTextField.sendKeys(organizationName);
	}
	
	public void clickOnSaveButton() {
		organizationSaveButton.click();
	}
}
