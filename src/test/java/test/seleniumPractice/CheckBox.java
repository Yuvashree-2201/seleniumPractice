package test.seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	WebDriver browser;
	
	public void checkbox()
	{
		/*EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-Notifications");*/

		browser = new ChromeDriver();
		browser.get("https://leafground.com/checkbox.xhtml");
		browser.manage().window().maximize();
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")).click();
		String className = browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")).getAttribute("class");
		System.out.println(className);
		if(className.contains("active"))
		{
			System.out.println("Pass");
		}
		
		browser.findElement(By.id("j_idt87:j_idt100")).click();
		String checkBox =	browser.findElement(By.id("j_idt87:j_idt100")).getAttribute("class");
		WebDriverWait wait = new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		
		String toastMessage = browser.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(toastMessage);
		if(checkBox.contains("checked"))
		{
			System.out.println("Pass-2");
		}
	}
	
	public void launguage(String[] expectedText)
	{
		
		for(String eachvalue: expectedText)
		{
		List<WebElement> eachElement = browser.findElements(By.xpath("//*[@id='j_idt87:basic']//tr//td"));
		for(int i=1;i<=eachElement.size();i++)
		{
			String actualText = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//tr//td["+i+"]//label")).getText();
			if(eachvalue.equalsIgnoreCase(actualText))
			{
				browser.findElement(By.xpath("//*[@id='j_idt87:basic']//tr//td["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
				break;
			}
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox c = new CheckBox();
		c.checkbox();
		String[] lan = {"python","others"};
		c.launguage(lan);
	}

}