package test.seleniumPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadList {
	String filepath="D:\\Input\\Input.xlsx";
	
	public void ReadData() throws IOException
	{
		
		List<String> ArrayList=new ArrayList<String>();
			
		File f=new File(filepath);
		FileInputStream FIS=new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(FIS);
		
		Sheet sheet = workbook.getSheet("login");
		int totalRows = sheet.getPhysicalNumberOfRows();
		for (int i=0;i<totalRows;i++)
		{
			Row inputRow = sheet.getRow(i);
			int totalColumn= inputRow.getLastCellNum();
			for(int j=0;j<totalColumn;j++)
			{
				Cell cellValue = inputRow.getCell(j);
				String actualValue = cellValue.getStringCellValue();
				 ArrayList.add(actualValue);
			}
			
		}
		
		
		for(String List:ArrayList)
		{
			System.out.print(List);
			System.out.println(" ");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadList E = new ExcelReadList();
		E.ReadData();
	}

}