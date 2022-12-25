package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://buythevalue.in/");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='owl-item active']")).click();
		
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//div[@class='VizExIcon__IconWrapper-sc-13xmv9w-0 kLdQSk']")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("560068");
		
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		
		driver.findElement(By.id("product-add-to-cart")).click();
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@class='harman_btn5 btn']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*ChromeOptions option = new ChromeOptions();
		option.addArguments("--disbale-notifications");
		
		
		ChromeDriver chrome = new ChromeDriver(option);
		chrome.get("https://buythevalue.in/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		chrome.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-modal-close-modal']")).click();
		chrome.findElement(By.xpath("//input[@placeholder='Search product']")).sendKeys("Hamdard Hing - 50GM",Keys.ENTER);
		Thread.sleep(3000);
		chrome.findElement(By.xpath("//a[@class='product-title']")).click();
		Thread.sleep(3000);
		chrome.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-modal-close-modal']")).click();
		Thread.sleep(3000);
		WebElement zipcode = chrome.findElement(By.xpath("//input[@id='wk_zipcode']"));
		zipcode.sendKeys("641403");
		chrome.findElement(By.xpath("//input[@value='Check']")).click();
		chrome.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		chrome.findElement(By.xpath("//a[text()='View Cart']")).click();*/
		
	}

}
