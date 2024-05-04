package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement addLeadButton;

	public WebElement getAddLeadButton() {
		return addLeadButton;
	}

	public void clickOnAddLeadButton() {
		addLeadButton.click();
	}
	
	
}
