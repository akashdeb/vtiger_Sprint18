package vtiger.pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadInformationPage {
	
	WebDriver driver;
	public LeadInformationPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	public String verifyLeadInformation(String leadFirstName, String leadLastName) {
		return driver.findElement(By.xpath("//span[contains(text(), '"+leadLastName+" "+leadFirstName+"')]")).getText();
	}

}
