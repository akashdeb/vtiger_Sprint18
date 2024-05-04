package vtiger.pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is an object repository for Home Page
 * 
 * @author Akash Deb
 *
 */
public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;

	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;

	@FindBy(linkText = "Products")
	private WebElement productsLink;

	@FindBy(linkText = "More")
	private WebElement moreDropdown;

	@FindBy(linkText = "Campaigns")
	private WebElement campaignsLink;

	@FindBy(linkText = "Vendors")
	private WebElement vendorsLink;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;

	@FindBy(linkText = "Sign Out")
	private WebElement signOutLink;

	// Getter Methods
	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getMoreDropdown() {
		return moreDropdown;
	}

	public WebElement getCampaignsLink() {
		return campaignsLink;
	}

	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}

	public void clickOnLeadModule() {
		leadsLink.click();
	}

	public void clickOnOrganizationsModule() {
		organizationsLink.click();
	}

	public void clickOnContactsModule() {
		contactsLink.click();
	}

	public void clickOnOpportunitiesModule() {
		opportunitiesLink.click();
	}

	public void clickOnProductsModule() {
		productsLink.click();
	}

	/**
	 * This method is used to mouse hover on More Dropdown and click on Campaign
	 * Module
	 */
	public void clickOnCampaignModule() {

		Actions action = new Actions(driver);
		action.moveToElement(moreDropdown).perform();
		action.click(campaignsLink).perform();
	}

	/**
	 * This method is used to mouse hover on More Dropdown and click on Vendor
	 * Module
	 */
	public void clickOnVendorModule() {

		Actions action = new Actions(driver);
		action.moveToElement(moreDropdown).perform();
		action.click(vendorsLink).perform();
	}

	/**
	 * This method is used to mouse hover on administrator icon and click on sign
	 * out link
	 */
	public void logoutAction() {

		Actions action = new Actions(driver);
		action.moveToElement(administratorIcon).perform();
		action.click(signOutLink).perform();
	}

}
