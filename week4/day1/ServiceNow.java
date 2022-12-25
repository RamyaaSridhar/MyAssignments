package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ServiceNow {

	public static void main(String[] args) {
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://dev110326.service-now.com/");
		
		//First Switch to Frame to access the inner elements
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("India@123");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//exit from all the frame
		driver.switchTo().defaultContent();
		
		
		
		

	}

}
