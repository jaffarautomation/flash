package DataDrivenFramework_part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data extends XSSFSheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		// Below method will provide the file path to java, where it is store in memory
		File file = new File("F:\\Selenium\\Excel file\\Data.xlsx");
		
		
		//below code will read the data from the file.
		FileInputStream fr = new FileInputStream(file);
		
		
		//below code will load the excel file
		/**
		 * High level representation of a SpreadsheetML workbook.  This is the first object most users
		 * will construct whether they are reading or writing a workbook.  It is also the
		 * top level object for creating new sheets/etc.
		 */
		XSSFWorkbook book = new XSSFWorkbook(fr);
		
		
		//It load the sheet one in excel file which we have created 
	XSSFSheet sheet=	book.getSheetAt(0);
	
	//Here we will reading the cell value from excel sheet we have created,
	//It will print the value of first row and first column
	 String value0 =sheet.getRow(0).getCell(0).getStringCellValue();
	 System.out.println(value0);
	 
	 //Here we print the first row and second column value
	 String value1 =sheet.getRow(0).getCell(1).getStringCellValue();
	 System.out.println(value1);
	 
	 
	 //Now to print all the values in excel sheet we will use for loop
	 //Value will be of row and 0th coloumn
	 
	 int i = sheet.getLastRowNum();
	 System.out.println("The no of rows are " + i);
	 
	 int coulmn = sheet.getLeftCol();
	 System.out.println(coulmn);
	 
	 for (int y = 0 ; y<=i;y++)
	 {
		 
		 
		 String s = sheet.getRow(y).getCell(0).getStringCellValue();
		 System.out.println(s);
		 
		 
		 String s1 = sheet.getRow(y).getCell(1).getStringCellValue();
		 System.out.println(s1);
		
		 }
	 
	 
	 
	 
	 book.close();
	
	}

}
