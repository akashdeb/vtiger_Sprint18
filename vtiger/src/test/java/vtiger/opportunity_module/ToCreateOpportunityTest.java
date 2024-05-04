package vtiger.opportunity_module;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import vtiger.genericUtility.BaseClass;
import vtiger.genericUtility.IPathConstant;
import vtiger.pomRepo.CampagnInformationPage;
import vtiger.pomRepo.CampaignPage;
import vtiger.pomRepo.CreatingNewCampagnPage;
import vtiger.pomRepo.CreatingNewOpportunity;
import vtiger.pomRepo.CreatingNewOrganizationPage;
import vtiger.pomRepo.HomePage;
import vtiger.pomRepo.OpportunityInformationPage;
import vtiger.pomRepo.OpportunityPage;
import vtiger.pomRepo.OrganizationInformationPage;
import vtiger.pomRepo.OrganizationPage;
@Listeners(vtiger.genericUtility.ItestListenersImplemantationClass.class)
public class ToCreateOpportunityTest extends BaseClass {

	@Test(retryAnalyzer = vtiger.genericUtility.IRetryAnalyzerImplementationClass.class)
	public void createOpportunityAndVerifyOpportunity() throws EncryptedDocumentException, IOException {

		String organizationName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.ORGANIZATION_SHEAT_NAME, 1, 0);
		String campaignName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.CAMPAIGN_SHEAT_NAME, 1, 0);
		String opportunityName = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPORTUNITY_SHEAT_NAME, 1, 0);
		String organizationLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPORTUNITY_SHEAT_NAME,
				1, 1);
		String campaignLookUpPageTitle = eUtils.fetchStringDataFromExcelSheet(IPathConstant.OPPORTUNITY_SHEAT_NAME, 1,
				2);

		HomePage home = new HomePage(driver);
		OrganizationPage organization = new OrganizationPage(driver);
		CreatingNewOrganizationPage createOrganization = new CreatingNewOrganizationPage(driver);
		OrganizationInformationPage organizationInfo = new OrganizationInformationPage(driver);
		
		
		CampaignPage campaign = new CampaignPage(driver);
		CreatingNewCampagnPage createCampaign = new CreatingNewCampagnPage(driver);
		CampagnInformationPage campagnInfo = new CampagnInformationPage(driver);

		OpportunityPage opportunity = new OpportunityPage(driver);
		CreatingNewOpportunity createOpportunity = new CreatingNewOpportunity(driver);
		OpportunityInformationPage opportunityInfo = new OpportunityInformationPage(driver);

		Assert.fail();
		home.clickOnOrganizationsModule();
		organization.clickOnAddOrganizationButton();
		createOrganization.enterOrganizationName(organizationName);
		createOrganization.clickOnSaveButton();
		String actualOrganization = organizationInfo.verifyOrganizationInformation(organizationName);

		Assert.assertTrue(actualOrganization.contains(organizationName));
		System.out.println("Pass: organization has been created");

		home.clickOnCampaignModule();
		campaign.clickOnAddCampagnButton();
		createCampaign.enterCampaignName(campaignName);
		createCampaign.clickOnSaveButton();
		String actualCampaignName = campagnInfo.verifyCampaignInformation(campaignName);

		Assert.assertTrue(actualCampaignName.contains(campaignName));
		System.out.println("Pass: campaign has been created");

		home.clickOnOpportunitiesModule();
		opportunity.clickOnAddOpportunityButton();
		createOpportunity.enterOpportunityName(opportunityName);
		createOpportunity.selectOrganizationNameFromOrganizationLookUpPage(organizationLookUpPageTitle,
				organizationName);
		createOpportunity.selectCampagnNameFromCampaignLookUpPage(campaignLookUpPageTitle, campaignName);
		createOpportunity.clickOnSaveButton();

		String actualOpportunityName = opportunityInfo.verifyOpportunityInformation(opportunityName);

		Assert.assertTrue(actualOpportunityName.contains(opportunityName));
		System.out.println("Pass: opportunity has been created");

	}

}
