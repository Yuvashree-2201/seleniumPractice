package test.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountFb {

	
	public void create() throws InterruptedException 
	{
		WebDriver user = new ChromeDriver();
		user.get("https://www.facebook.com/");
		user.manage().window().maximize();
		/*user.findElement(By.name("email")).sendKeys("yuvashreechithram@gmil.com");
		user.findElement(By.id("pass")).sendKeys("Peraiyuv@2201");
		user.findElement(By.name("login")).click();*/
		
		//Thread
		user.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		user.findElement(By.name("firstname")).sendKeys("Yuvashree");
		user.findElement(By.name("lastname")).sendKeys("Yuva");
		user.findElement(By.name("reg_email__")).sendKeys("yuvashreechithram@gmail.com");
		user.findElement(By.name("reg_email_confirmation__")).sendKeys("yuvashreechithram@gmail.com");
		user.findElement(By.id("password_step_input")).sendKeys("1234567");
		
	
					//ImplicitlyWait
		
		/*user.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		user.findElement(By.linkText("Create new account")).click();
		user.findElement(By.name("firstname")).sendKeys("Yuvashree");
		user.findElement(By.name("lastname")).sendKeys("Yuva");
		user.findElement(By.name("reg_email__")).sendKeys("yuvashreechithram@gmail.com");
		user.findElement(By.name("reg_email_confirmation__")).sendKeys("yuvashreechithram@gmail.com");
		user.findElement(By.id("password_step_input")).sendKeys("1234567");*/
		
		
					//ExplicitlyWait
		
		/*WebDriverWait wait = new WebDriverWait(user,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
		user.findElement(By.name("firstname")).sendKeys("Yuvashree");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("lastname")));
		user.findElement(By.name("lastname")).sendKeys("Yuva");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("reg_email__")));
		user.findElement(By.name("reg_email__")).sendKeys("yuvashreechithram@gmail.com");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("reg_email_confirmation__")));
		user.findElement(By.name("reg_email_confirmation__")).sendKeys("yuvashreechithram@gmail.com");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("password_step_input")));
		user.findElement(By.id("password_step_input")).sendKeys("1234567");*/		
			
		}
	
	public static void main(String[] args) throws InterruptedException
	{
		CreateNewAccountFb cna = new CreateNewAccountFb();
		cna.create();
	}

}
