package test.seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
public final class Login {
	WebDriver browser;
	public void launchBrowser( String browservalue) {
		if(browservalue.equalsIgnoreCase("Chrome")) {
		WebDriver browser =new ChromeDriver();
		browser.get("https://www.facebook.com");
		browser.manage().window().maximize();
		browser.findElement(By.linkText("Forgotten password?")).click();
	}else if(browservalue.equalsIgnoreCase("edge")) {
		
	   WebDriver browser = new EdgeDriver();
		browser.get("https://www.facebook.com");
		browser.manage().window().maximize();
		browser.findElement(By.linkText("Forgotten password?")).click();
	}	
	}
		public static void main(String[] args) {
			Login FP =new Login();
	        FP.launchBrowser("Chrome");
		}

	}
