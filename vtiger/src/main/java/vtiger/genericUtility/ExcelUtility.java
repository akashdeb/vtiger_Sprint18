package vtiger.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchStringDataFromExcelSheet(String sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathConstant.EXCEL_FILE_PATH);
		
		return WorkbookFactory.create(fis).getSheet(sheetname).getRow(rowNo).getCell(cellNo).getStringCellValue();
		
	}

}
