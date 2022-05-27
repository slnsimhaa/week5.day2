package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
@Test
public void readData() throws IOException
{
	//Open the excel sheet
	XSSFWorkbook book= new XSSFWorkbook("./testData/tc001.xlsx");
	//Get to the sheet where data is available
	XSSFSheet sheet = book.getSheetAt(0);
	//Get the row count
	int rowCount = sheet.getLastRowNum();
	System.out.println("Row Count:"+rowCount);
	//Get the columns count
	XSSFRow headerRow = sheet.getRow(0);
	short colCount = headerRow.getLastCellNum();
	System.out.println("Column Count: "+ colCount);
	
	for (int i=1; i <= rowCount; i++)
	{
		XSSFRow eachRow = sheet.getRow(i);
		for (int j=0; j < colCount; j++)
		{
			XSSFCell eachCell = eachRow.getCell(j);
			String data = eachCell.getStringCellValue();
			System.out.print(data+"\t");
		}
		System.out.println();
		}
				
	}
	
}