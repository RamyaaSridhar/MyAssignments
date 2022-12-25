package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWait {

	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://login.salesforce.com/");
		chrome.manage().window().maximize();
		
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrome.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		chrome.findElement(By.name("pw")).sendKeys("Testleaf$321");
		chrome.findElement(By.name("Login")).click();
		chrome.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		chrome.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		
		
		
		

	}

}
