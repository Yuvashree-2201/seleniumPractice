package test.seleniumPractice;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelFileReader {
	String filepath="D:\\Input\\Input.xlsx";
	//String filepath="C:\\Users\\Administrator\\OneDrive\\Desktop\\Input\\Input.xls";
	//String filepath=System.getProperty("user.dir")+"\\Input\\Input.xls";
	
	public void ReadData() throws IOException
	{
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
				//System.out.print(actualValue);
				//System.out.print(" ");
			}
			//System.out.println("");
		}
	    FileOutputStream out = new FileOutputStream(new File("D:\\Input\\Output.xlsx"));
	    workbook.write(out);
        out.close();
        System.out.println("The file write sucessfully in the Output.xlsx");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileReader E = new ExcelFileReader();
		E.ReadData();
	}

}

