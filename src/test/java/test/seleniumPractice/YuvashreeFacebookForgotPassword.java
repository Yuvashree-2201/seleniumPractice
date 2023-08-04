package test.seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YuvashreeFacebookForgotPassword  {
	
	public void loginAccount()
	{
	

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("email")).sendKeys("yuvashreechithram@gmil.com");
	driver.findElement(By.id("pass")).sendKeys("Peraiyuv@2201");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.name("pass")).sendKeys("Peraiyuv@2201");
	driver.findElement(By.name("login")).click();
}
	
	public void forgotPassword()
	{
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
		browser.findElement(By.linkText("Forgotten password?")).click();
		browser.findElement(By.linkText("Forgotten account?")).click();
	}

public static void main(String[] args) {
	
	YuvashreeFacebookForgotPassword yfp = new YuvashreeFacebookForgotPassword();
	yfp.loginAccount();
	yfp.forgotPassword();
}
}