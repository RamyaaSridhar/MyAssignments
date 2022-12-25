package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disbale-notifications");
		
		ChromeDriver chrome = new ChromeDriver(option);
		chrome.get("https://www.irctc.co.in/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		chrome.findElement(By.linkText(" FLIGHTS ")).click();
		
		

	}

}
