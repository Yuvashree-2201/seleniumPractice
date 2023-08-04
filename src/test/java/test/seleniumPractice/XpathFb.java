package test.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFb {
	
	public void launch()
	{
	

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//driver.findElement(By.name("login")).click();
	
	driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("yuvashreechithram@gmil.com");
	driver.findElement(By.xpath("(//input[contains(@class,'_55r1')])[2]")).sendKeys("Peraiyuv@2201");
	driver.findElement(By.xpath("//button[contains(@class,'_4jy0')and @name='login']")).click();
	driver.findElement(By.xpath("//input[contains(@class,'input')]")).sendKeys("Peraiyuv@2201");
	//driver.findElement(By.xpath("//button[contains(@class,'_4jy0')and @name='login']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'_42ft')]")).click();
	
	}
	
	
	public void openLoginAccount()
	{
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		
		browser.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//browser.findElement(By.linkText("Forgotten account?")).click();
		
		
	}

public static void main(String[] args) {
	
	XpathFb xp = new XpathFb();
	xp.launch();
	xp.openLoginAccount();
}
}