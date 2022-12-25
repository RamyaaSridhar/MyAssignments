package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		chrome.switchTo().frame("iframeResult");
		
		chrome.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Prompt Alert
		Alert alert = chrome.switchTo().alert();
		alert.sendKeys("Ramya Sridhar");
		alert.accept();
		String result = chrome.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("The message is:"+result);
		
		

	}

}
