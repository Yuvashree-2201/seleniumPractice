package test.seleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
	
	
	String filepath = "C:\\Program Files\\Java\\jre-1.8\\seleniumPractice\\Input\\fb.properties";
	
	public void BrowserData() throws IOException
	{
		WebDriver browser = new ChromeDriver();
		
		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		Properties p = new Properties();
		p.load(FS);
		browser.manage().window().maximize();
		//String actualName = p.getProperty("url");
		//System.out.println(actualName);
		browser.get(p.getProperty("url"));
		
	
		
	
	/*browser.manage().window().maximize();
		browser.manage().window().minimize();
		browser.get("url");
		browser.navigate();
		browser.close();
		browser.quit();
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh(); */
		
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BrowserOpen bo = new BrowserOpen();
		bo.BrowserData();
	}

}
