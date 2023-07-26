package test.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowser {
	
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		//username.sendKeys("yuvashreechithram@gmil.com");
		//username.clear();
		//driver.findElement(By.id("email")).sendKeys("Shree");
		driver.findElement(By.name("email")).sendKeys("yuvashreechithram@gmil.com");
		driver.findElement(By.id("pass")).sendKeys("Peraiyuv@2201");
		driver.findElement(By.name("login")).click();
		
		
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hi");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("pass")).click();
		//driver.close();
		//driver.quit();
	}
	
	//public void openLoginAccount()
	//{
	//	WebDriver driver = new ChromeDriver();
	//	driver.findElement(By.linkText("Forgotten account?")).click();
	//}

	public static void main(String[] args) {
		
		TestBrowser TB = new TestBrowser();
		TB.launch();
		//TB.openLoginAccount();
	}

	

}