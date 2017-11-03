package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Ecxeldata implements Autoconst{

	public static String retrievedata(String PATH,String sheet,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String v="";
	try{
			File s=new File(PATH);
		
	
		 v=WorkbookFactory.create(s).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	catch(Exception e)
	{
		Reporter.log("unable to fetch data from excel",true);
	}
	
return v;
	}

}
