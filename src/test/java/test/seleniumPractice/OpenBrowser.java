package test.seleniumPractice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {	
		public void ChromeBrowser1()
		{
			WebDriver browser = new EdgeDriver();
			browser.get("https://www.google.com/");
			browser.manage().window().maximize();
	}
		public void ChromeBrowser2()
		{
			WebDriver browser = new InternetExplorerDriver();
			browser.get("https://www.fb.com/");
			browser.manage().window().maximize();

	}
		public static void main(String[] args) throws IOException 
		{

			String filepath = "C:\\Program Files\\Java\\jre-1.8\\seleniumPractice\\Input\\gg.properties";
			OpenBrowser ob = new OpenBrowser();
			FileInputStream FS = new FileInputStream(filepath);
			Properties p = new Properties();
			p.load(FS);
			
			if(p.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				ob.ChromeBrowser2();
			}
			
			else 
			{
				ob.ChromeBrowser1();
			}	
			
		/*	p.get(p.getProperty("url"));
			ob.ChromeBrowser1();
			ob.ChromeBrowser2();*/
			
			
		
			
}
		
}