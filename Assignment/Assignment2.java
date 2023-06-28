/*
 * 1) Go to https://www.nykaa.com/
 * 2) Mouseover on Brands and Search L'Oreal Paris
 * 3) Click L'Oreal Paris
 * 4) Check the title contains L'Oreal Paris(Hint-GetTitle)
 * 5) Click sort By and select customer top rated
 * 6) Click Category and click Hair->Click haircare->Shampoo
 * 7) Click->Concern->Color Protection
 * 8)check whether the Filter is applied with Shampoo
 * 9) Click on L'Oreal Paris Colour Protect Shampoo
 *10) GO to the new window and select size as 175ml
 *11) Print the MRP of the product
 *12) Click on ADD to BAG
 *13) Go to Shopping Bag 
 *14) Print the Grand Total amount
 *15) Click Proceed
 *16) Click on Continue as Guest
 *
 */

package week4.day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver chrome = new ChromeDriver();
		chrome.get("https://www.nykaa.com/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Actions Class
		Actions builder = new Actions(chrome);
		
		//Mouse-over the Element
		WebElement brands = chrome.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli']//a[text()='brands']"));
		chrome.findElement(By.xpath("//p[text()='Today’s Top Offers']")).click();
		Thread.sleep(2000);
		builder.moveToElement(brands).perform();
		
		//Search the product
		chrome.findElement(By.xpath("//input[@placeholder='search brands']")).sendKeys("L'Oreal Paris");
		chrome.findElement(By.xpath("//a[contains(@href,'loreal')]")).click();
		String title = chrome.getTitle();
		if(title.contains("L'Oreal Paris")) {
			System.out.println("Title of the page contains product name.");
		}
		
		//sort the product
		WebElement sortProduct = chrome.findElement(By.xpath("//span[@class='sort-name']"));
		builder.scrollToElement(sortProduct).pause(Duration.ofSeconds(2)).click(sortProduct).perform();
		chrome.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		
		chrome.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//span[text()='Hair']")).click();
		chrome.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		chrome.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		
		//Concern
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//span[text()='Concern']")).click();
		chrome.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String text = chrome.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		if(text.equalsIgnoreCase("shampoo")) {
			System.out.println("Shampoo product is selected.");
		}
		
		//Click on shampoo
		chrome.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
		
		
		Set<String> windowHandles = chrome.getWindowHandles();
		List<String> listOfHandles = new ArrayList<String>(windowHandles);
		chrome.switchTo().window(listOfHandles.get(1));
		
		
		WebElement pric = chrome.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select price = new Select(pric);
		price.selectByVisibleText("340ml");
		WebElement amount = chrome.findElement(By.xpath("//span[text()='₹379']"));
		System.out.println("Price of the product is : "+amount.getText());
		
		chrome.findElement(By.xpath("(//span[text()='Add to Bag'])[1]/..")).click();
		chrome.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		//Iframe
		WebElement iframe = chrome.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		chrome.switchTo().frame(iframe);
		String grandTotal = chrome.findElement(By.xpath("//span[text()='₹449']")).getText();
		System.out.println("The grand Total is : "+grandTotal);
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//span[text()='Proceed']/../../..")).click();
		chrome.switchTo().defaultContent();
		
		//Continue as Guest
		chrome.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
		chrome.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']")).click();
		String grandTotal1 = chrome.findElement(By.xpath("//p[@class='css-cla92e eka6zu20']")).getText();
		
		if(grandTotal1.equals(grandTotal)) {
			System.out.println("The grand total is matches");
		}
		chrome.quit();
		
	}

}
