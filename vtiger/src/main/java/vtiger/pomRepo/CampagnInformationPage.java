package vtiger.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampagnInformationPage {

	WebDriver driver;
	public CampagnInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	public String verifyCampaignInformation(String campaignName) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+campaignName+"')]")).getText();
	}
	
}
