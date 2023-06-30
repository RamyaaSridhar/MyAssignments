/*
 * 1. Launch https://www.snapdeal.com//
 * 2. Go to Mens Fashion
 * 3. Go to Sports Shoe/
 * 4. Get the count of the sports shoes/
 * 5. Click Training shoes//
 * 6. Sort by Low to High
 * 
 * 8.Select the price range (900-1200)
 *
*/

package week4.day2.Assignment;

import java.time.Duration;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver chrome = new ChromeDriver(option);
		chrome.get("https://www.snapdeal.com/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Actions Class
		Actions builder = new Actions(chrome);
		
		//Mouse-Over
		WebElement mensFashion = chrome.findElement(By.xpath("//li[@navindex='1']"));
		builder.moveToElement(mensFashion).perform();
		
		//Click on Sports shoes
		chrome.findElement(By.xpath("(//div[@class='colDataInnerBlk']//a)[2]")).click();
		String text = chrome.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		String countProduct = text.replaceAll("[^0-9]","");
		System.out.println("Total Sports shoes available is:"+countProduct);
		
		//Training Shoes
		chrome.findElement(By.xpath("//div[text()='Training Shoes']/..")).click();
		
		//Sort the shoes
		Thread.sleep(2000);
		chrome.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		chrome.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		
		//scrolldown
		WebElement scroll = chrome.findElement(By.xpath("//span[text()='Did you find what you are looking for? ']"));
		builder.scrollToElement(scroll).perform();
		
		
		
		//Cost of the Shoes
		List<WebElement> costOfShoes = chrome.findElements(By.xpath("//span[@class='lfloat product-price']"));
		int size1 = (costOfShoes.size());
		int[] intArray = new int[size1];
		
		int i=0;
		for (WebElement values : costOfShoes) {
			Thread.sleep(5000);
			String pr = values.getText();
			String replaceAll = pr.replaceAll("[^0-9]","");
			int price = Integer.parseInt(replaceAll);
			intArray[i]=price;
		}
		if(intArray[0]>intArray[7]) {
			System.out.println("Product are arranged orderly");
		}
		
		//Fliter by color
		chrome.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		
		WebElement findElement1 = chrome.findElement(By.xpath("//span[text()='Did you find what you are looking for? ']"));
		builder.scrollToElement(findElement1).perform();
		
		
		WebElement color = chrome.findElement(By.xpath("(//img[contains(@title,'Navy Training Shoes')])[1]"));
		Thread.sleep(2000);
		builder.moveToElement(color).perform();
		
		//Quick-View
		chrome.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]")).click();
		
		//cost and percentage
		String c = chrome.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		String cost = c.replaceAll("[^0-9]", "");
		System.out.println("Cost of the product is :"+cost);
		Thread.sleep(2000);
		String percen = chrome.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount Percentage "+percen);
		
		//close the current window
		chrome.close();
		
		//quit all
		chrome.quit();
		
		
		}
		
		
			
			
			
	}
	
