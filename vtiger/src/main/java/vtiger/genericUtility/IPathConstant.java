package vtiger.genericUtility;

public interface IPathConstant {
	
	String PROPERTY_FILE_PATH = ".\\src\\test\\resources\\testdata\\propertyData.properties";
	String EXCEL_FILE_PATH = ".\\src\\test\\resources\\testdata\\ExcelData.xlsx";
	
	int IMPLICIT_WAIT = 20;
	int EXPLICIT_WAIT = 20;
	
	String LEAD_SHEAT_NAME = "Leads";
	String ORGANIZATION_SHEAT_NAME = "Organizations";
	String CAMPAIGN_SHEAT_NAME = "Campaign";
	String OPPORTUNITY_SHEAT_NAME = "Opportunity";
	
	String DB_URL = "jdbc:mysql://localhost:3306/vtiger";
	String DB_USERNAME = "root";
	String DB_PASSWORD = "root";

	
}
