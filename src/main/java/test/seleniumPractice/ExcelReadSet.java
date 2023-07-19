package test.seleniumPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadSet {
	String filepath="D:\\Input\\Input.xlsx";
	
	public void ReadData() throws IOException
	{
		
		Set<String> dataSet = new HashSet<>();
		 		
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
				dataSet.add(actualValue);
				
				}
			
		}
		
		System.out.println("Data Set:");
        for (String data : dataSet) {
            System.out.println(data);
        }
       	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadSet E = new ExcelReadSet();
		E.ReadData();
	}

}