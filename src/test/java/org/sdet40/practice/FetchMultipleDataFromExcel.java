package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./src/test/resources/Book1.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sh = wb.getSheet("commondata");	
		 DataFormatter df= new DataFormatter();
		 for(int i=0;i<=sh.getLastRowNum();i++)
		 {
			 for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
			 {
				 System.out.print(df.formatCellValue(sh.getRow(i).getCell(j))+"||");
			 }
			 System.out.println();
		 }

	}

}
