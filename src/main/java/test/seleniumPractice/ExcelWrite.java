package test.seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {
	
	String filepath="D:\\Input\\Output.xlsx";
	
	String[] name = {"Yuva","Shree","M","B.E"};
	public void ExcelWriteData() throws IOException
	{

		File F = new File(filepath);
		FileOutputStream FS = new FileOutputStream(F);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(FS);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("login");
		
		int totalRows = name.length;
		for (int i=0;i<totalRows;i++)
		{
			Row inputRow = sheet.createRow(i);
			//int totalColumn= name.length;
			//for(int j=0;j<totalColumn;j++)
			//{
				Cell cellValue = inputRow.createCell(i);
				// String actualValue = cellValue.getStringCellValue();
				cellValue.setCellValue(name[i]);
			//}
			
			
		}
	
		workbook.write(FS);
		workbook.close();
		FS.close();
		System.out.println("done");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.ExcelWriteData();
	}

}
