package vtiger.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.genericUtility.WebDriverUtility;

public class CreatingNewOpportunity {
	WebDriver driver;
	public CreatingNewOpportunity(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(name = "potentialname")
	private WebElement opportunityNameTextField;
	
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement organizationLookUpButton;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[2]")
	private WebElement campaignLookUpButton;
	
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")
	private WebElement opportunitySaveButton;
	
	@FindBy(id = "search_txt")
	private WebElement organizationLookUpPageSearchTextField;
	
	@FindBy(name = "search")
	private WebElement organizationLookUpPageSearchButton;
	
	@FindBy(id = "search_txt")
	private WebElement campagnLookUpPageSearchTextField;
	
	@FindBy(name = "search")
	private WebElement campaignLookUpPageSearchButton;
	

	public WebElement getOpportunityNameTextField() {
		return opportunityNameTextField;
	}

	public WebElement getOrganizationLookUpButton() {
		return organizationLookUpButton;
	}

	public WebElement getCampaignLookUpButton() {
		return campaignLookUpButton;
	}

	public WebElement getOpportunitySaveButton() {
		return opportunitySaveButton;
	}
	
	public void enterOpportunityName(String opportunityName) {
		opportunityNameTextField.sendKeys(opportunityName);
	}
	
	public void clickOnOrganizationLookUpPageSearchResult(String organizationName) {
		driver.findElement(By.xpath("//a[text()='"+organizationName+"']")).click();
	}
	
	public void clickOnCampaignLookUpPageSearchResult(String campaignName) {
		driver.findElement(By.xpath("//a[text()='"+campaignName+"']")).click();
	}
	
	public void selectOrganizationNameFromOrganizationLookUpPage(String titleToSwitch, String organizationName) {
		
		String parentWindowTitle = driver.getTitle();
		organizationLookUpButton.click();
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.switchToWindow(driver, titleToSwitch);
		
		organizationLookUpPageSearchTextField.sendKeys(organizationName);
		organizationLookUpPageSearchButton.click();
		
		clickOnOrganizationLookUpPageSearchResult(organizationName);
		
		wUtils.switchToWindow(driver, parentWindowTitle);
		
	}
	
	
public void selectCampagnNameFromCampaignLookUpPage(String titleToSwitch, String campaignName) {
		
		String parentWindowTitle = driver.getTitle();
		campaignLookUpButton.click();
		
		WebDriverUtility wUtils = new WebDriverUtility();
		wUtils.switchToWindow(driver, titleToSwitch);
		
		campagnLookUpPageSearchTextField.sendKeys(campaignName);
		campaignLookUpPageSearchButton.click();
		
		clickOnCampaignLookUpPageSearchResult(campaignName);
		
		wUtils.switchToWindow(driver, parentWindowTitle);
	}
	
	
	public void clickOnSaveButton() {
		opportunitySaveButton.click();
	}
	
}
