package test.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFb {
	
	public void launch()
	{
	

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("email")).sendKeys("yuvashreechithram@gmil.com");
	driver.findElement(By.id("pass")).sendKeys("Peraiyuv@2201");
	driver.findElement(By.name("login")).click();
	//driver.findElement(By.name("pass")).sendKeys("Peraiyuv@2201");
	//driver.findElement(By.name("login")).click();
}
	
	public void openLoginAccount()
	{
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		
		//user.findElement(By.name("email")).sendKeys("yuvashreechithram@gmil.com");
		//user.findElement(By.id("pass")).sendKeys("Peraiyuv@2201");
		//user.findElement(By.name("login")).click();
		//user.findElement(By.name("pass")).sendKeys("Peraiyuv@2201");
		browser.findElement(By.linkText("Forgotten password?")).click();
		browser.findElement(By.linkText("Forgotten account?")).click();
	}

public static void main(String[] args) {
	
	LoginFb LF = new LoginFb();
	LF.launch();
	LF.openLoginAccount();
}
}