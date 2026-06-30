package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class RegisterDataProvider 
{
	  @DataProvider
      public Object[][] sender() throws EncryptedDocumentException, IOException
      {
		  Object[][]obj=new Object[1][5];
		  
    	  File file=new File(".\\src\\test\\resources\\QAFOX.xlsx");
    	  FileInputStream fis=new FileInputStream(file);
    	  Workbook book=WorkbookFactory.create(fis);
    	  Sheet sheet=book.getSheet("Register");
    	  obj[0][0]=sheet.getRow(0).getCell(0).toString();
    	  obj[0][1]=sheet.getRow(0).getCell(1).toString();
    	  obj[0][2]=sheet.getRow(0).getCell(2).toString();
    	  obj[0][3]=sheet.getRow(0).getCell(3).toString();
    	  obj[0][4]=sheet.getRow(0).getCell(4).toString();
    	  
    	  return obj;
      }
	  
}
