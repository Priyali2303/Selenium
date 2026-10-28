package SeleniumBasicEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelFileEx {

	public static void main(String[] args) throws IOException {

		//fetch the file
		File file=new File("D:\\Testing\\Software Testing Excelsheet\\ReadExcelFile.xlsx");

		//read the excel file
		FileInputStream io=new FileInputStream(file);

		//fetch the workbook
		XSSFWorkbook wb= new XSSFWorkbook(io);

		//for sheet filename
		XSSFSheet sheet=wb.getSheet("Demo");

		//for index
		//XSSFSheet sheet=wb.getSheet(0);

		//Row 0 cell 0
		XSSFRow row0=sheet.getRow(0);
		XSSFCell cell00=row0.getCell(0);
		String id=cell00.getStringCellValue();
		System.out.println(id);
		
		//Row 0 cell 1
		XSSFCell cell01=row0.getCell(1);
		String name=cell01.getStringCellValue();
		System.out.println(id+"||"+name);
		
		// Row 1 cell 0
		XSSFRow row1= sheet.getRow(1);
		XSSFCell cell10=row1.getCell(0);
		double id1=cell10.getNumericCellValue();
	//	System.out.println(id1);
		
		// Row 1 cell 1
		XSSFCell cell11=row1.getCell(0);
		String name1=cell11.getStringCellValue();
		System.out.println(id1+"||"+name1);
	}

}
