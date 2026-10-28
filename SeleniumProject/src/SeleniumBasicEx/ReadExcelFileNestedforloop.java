package SeleniumBasicEx;

import java.awt.SystemTray;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFileNestedforloop {

	public static void main(String[] args) throws IOException {
		
		//fetch the file
				File file=new File("D:\\Testing\\ReadExcelFile.xlsx");

				//read the excel file
				FileInputStream io=new FileInputStream(file);

				//fetch the workbook
				XSSFWorkbook wb= new XSSFWorkbook(io);

				//for sheet filename
				XSSFSheet sheet=wb.getSheet("Demo");
				
				//nested for loop
			int rowcount=sheet.getLastRowNum();
			System.out.println(rowcount);
			
			//row
			for(int i=0;i<rowcount;i++)
			{
				XSSFRow row=sheet.getRow(i);
				int cellcount=row.getLastCellNum();
				System.out.println();
				
				for(int j=0;j<cellcount;j++)
				{
					XSSFCell cell=row.getCell(j);
					if (cell.getCellType()==CellType.STRING) {
						System.out.println(row.getCell(j).getStringCellValue()+"||");
					}
					else if(cell.getCellType()==CellType.NUMERIC)
					{
						System.out.println(row.getCell(j).getNumericCellValue()+"||");
					}
				}
			}
				


	}

}
