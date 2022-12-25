package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrome.get("https://leafground.com/alert.xhtml");
		
		//Click the Show button to Get the Alert
		chrome.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]//following::button")).click();
		
		Alert alert = chrome.switchTo().alert();
		System.out.println("Alert Text in confirm Dialog is :"+alert.getText());
		alert.accept();
		
	}

}
