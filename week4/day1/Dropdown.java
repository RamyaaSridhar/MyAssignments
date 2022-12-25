package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement selectTag = chrome.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']//following::div//div[@class='col-12']//following::select"));
		Select dropdown = new Select(selectTag);
		dropdown.selectByVisibleText("Selenium");
		String course = chrome.findElement(By.xpath("//option[text()='Selenium']")).getText();
		System.out.println("MY Fav UI Automation tool :"+course);
		
		chrome.findElement(By.xpath("//label[text()='Select Country']")).click();
		chrome.findElement(By.xpath("//li[text()='India']")).click();
		
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//label[text()='Select City']")).click();
		
		chrome.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
		
		chrome.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		chrome.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		chrome.findElement(By.xpath("//label[text()='Select Language']")).click();
		chrome.findElement(By.xpath("//li[text()='English']")).click();
		
		 Thread.sleep(2000);
		 chrome.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
	     chrome.findElement(By.id("j_idt87:value_3")).click();
		

	}

}
