/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 
		 * 
		 * 
		 * 
		 *
		 */

package week4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("http://leaftaps.com/opentaps/control/login");
		chrome.manage().window().maximize();
		
		//Log-in
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		chrome.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		chrome.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		chrome.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
		
		//Contacts Button
		chrome.findElement(By.partialLinkText("Contacts")).click();
		
		//Merge Button
		chrome.findElement(By.xpath("(//ul[@class='shortcuts']//a)[4]")).click();
		
		//Click on Widget of From Contact
		chrome.findElement(By.xpath("//input[@id='partyIdFrom']//following::a")).click();
		
		//Window Handle

		Set<String> parent = chrome.getWindowHandles();
		List<String> windowHandle = new ArrayList<String>(parent);
		
		
		//Switch the control to new window
		chrome.switchTo().window(windowHandle.get(1));
		
		//Click on First Resulting Contact
		chrome.findElement(By.xpath("((//table)[5]//tr[1]//td//a)[1]")).click();
		
		////Switch the control to parent Window
		chrome.switchTo().window(windowHandle.get(0));
		Thread.sleep(2000);
		chrome.findElement(By.xpath("(//input[@id='partyIdTo']//following::a)[1]")).click();
		
		
		//Switch the control to new window
		Set<String> h = chrome.getWindowHandles();
		List<String> window = new ArrayList<String>(h);
		chrome.switchTo().window(window.get(1));
		Thread.sleep(3000);
		chrome.findElement(By.xpath("(//table)[6]//tr[1]//td[1]")).click();
		
		//Parent Window
		chrome.switchTo().window(window.get(0));
		chrome.findElement(By.xpath("(//input[@id='partyIdTo']//following::a)[2]")).click();
		
		//Alert
		Alert alert = chrome.switchTo().alert();
		alert.accept();
		
		Thread.sleep(5000);
		String title = chrome.getTitle();
		System.out.println("Title of the page is:"+title);
		
		
		
		

	}

}
