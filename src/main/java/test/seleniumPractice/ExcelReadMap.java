package test.seleniumPractice;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadMap {
	String filepath="D:\\Input\\Input.xlsx";
	
	public void ReadData() throws IOException
	{
		
		  Map<String, String> dataMap = new HashMap<>();


		
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
				
				Cell keyCell = inputRow.getCell(0);  
				Cell cellValue = inputRow.getCell(1);			
	            String key = keyCell.getStringCellValue();
	            String value = cellValue.getStringCellValue();
	               
	            dataMap.put(key, value);
				
			}
			
		}
		
	System.out.println("Data Map:");
    for (Map.Entry<String, String> entry : dataMap.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
	}
    

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadList E = new ExcelReadList();
		E.ReadData();
	}

}