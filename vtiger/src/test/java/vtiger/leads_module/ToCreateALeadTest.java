package vtiger.leads_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;
import vtiger.pomRepo.CreatingNewLeadPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.LeadInformationPage;
import vtiger.pomRepo.LeadsPage;
@Listeners(vtiger.genericUtility.ItestListenersImplemantationClass.class)
public class ToCreateALeadTest extends BaseClass {
	
	@Test(groups="smoke")
	public void toCreateALeadAndToVerifyTheLeadinformationTest() throws EncryptedDocumentException, IOException {
		String leadSalutation = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEAT_NAME, 1, 0);
		String leadFirstName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEAT_NAME, 1, 1);
		String leadLastName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEAT_NAME, 1, 2);
		String leadCompanyName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.LEAD_SHEAT_NAME, 1, 3);

		HomePage home = new HomePage(driver);
		LeadsPage leads = new LeadsPage(driver);
		CreatingNewLeadPage createLeads = new CreatingNewLeadPage(driver);
		LeadInformationPage leadInfo = new LeadInformationPage(driver);
		
		home.clickOnLeadModule();
		leads.clickOnAddLeadButton();
		createLeads.selectFromLeadSalutationDropdown(leadSalutation);
		createLeads.enterLeadFirstName(leadFirstName);
		createLeads.enterLeadLastName(leadLastName);
		createLeads.enterLeadCompanyName(leadCompanyName);
		createLeads.clickOnSaveButton();
		
		String actualLeadInfo = leadInfo.verifyLeadInformation(leadFirstName, leadLastName);
		
		Assert.assertTrue(actualLeadInfo.contains(leadLastName));
		System.out.println("Pass: the lead has been created");
		System.out.println("Pass: the lead has been created");

		
	}

}
