package marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	
	public ChromeDriver chrome;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void precondition(String url,String uName, String password) throws InterruptedException {
		
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");

		chrome = new ChromeDriver(ch);
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrome.get(url);
		chrome.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		chrome.findElement(By.xpath("//input[@id='Login']")).click();
	    Thread.sleep(3000);
		chrome.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		chrome.findElement(By.xpath("//button[text()='View All']/..")).click();
		chrome.findElement(By.xpath("//p[text()='Content']/../../..")).click();

	}
	
	/*
	 * @AfterMethod public void postcondition() { chrome.close();
	 * 
	 * }
	 */

}
