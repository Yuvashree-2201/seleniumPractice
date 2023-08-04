package test.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethods {
	
	public void launch()
	{
	

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	//driver.findElement(By.name("login")).click();
	
		//(doubt) driver.findElement(By.xpath("//select[@id='day']//following::option[@value='3'][1]")).click();
		driver.findElement(By.xpath("//select[@id='day']//following-sibling::option[@value='3']")).click();
		driver.findElement(By.xpath("//select[@id='day']//child::option[@value='3']")).click();
		driver.findElement(By.xpath("//option[@value='7']//parent::select[@id='day']")).click();
		driver.findElement(By.xpath("//option[@value='7']//ancestor::span[@id='u_f_l_xS']")).click();
		driver.findElement(By.xpath("//span[@class='_5k_4']//descendant::select[@id='month']")).click();
		driver.findElement(By.xpath("(//span[@class='_5k_4']//descendant::select)[last()]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_day']//following::option[@value='3']")).click();
		
		
	//preceding for email
	driver.findElement(By.xpath("//div[@class='_6lux']//preceding::input[@name='email']")).sendKeys("yuvashreechithram@gmail.com");
	
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
	
	XpathAxesMethods xp = new XpathAxesMethods();
	xp.launch();
	xp.openLoginAccount();
}
}