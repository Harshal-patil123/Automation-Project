package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class LoginDataProvider 
{
	@DataProvider
    public Object[][] sender() throws EncryptedDocumentException, IOException
    {
    	Object[][]obj=new Object[1][2];
    	
    	File file=new File(".\\src\\test\\resources\\QAFOX.xlsx");
    	FileInputStream fis=new FileInputStream(file);
    	Workbook book=WorkbookFactory.create(fis);
    	Sheet sh=book.getSheet("Login");
    	obj[0][0]=sh.getRow(1).getCell(0).toString();
    	obj[0][1]=sh.getRow(1).getCell(1).toString();
    	
    	return obj;
    }
}
