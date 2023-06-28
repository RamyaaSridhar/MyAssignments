/*
 * 1.Load the URL https://www.amazon.in/
 * 2.search as oneplus 9 pro 
 * 3.Get the price of the first product
 * 5. Click the first text link of the first image
 *hello123
*/

package week4.day2.Assignment;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.crome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//Load the browser
		ChromeDriver chrome = new ChromeDriver(option);
		
		//Load the url
		chrome.get("https://www.amazon.in/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Actions class
		
		Actions builder = ew Actions(chrome);
		
		//Search the phone
		chrome.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		//Price of first Product
		String price = chrome.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		System.out.println("Price of the first Product is :"+price);
		
		//rating
		chrome.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]")).click();
		Thread.sleep(2000);
		String rating = chrome.findElement(By.xpath("(//span[text()='4.2 out of 5'])[2]")).getText();
		System.out.println("Rating is :"+rating);
		
		//Click the product 
		chrome.findElement(By.xpath("(//span[contains(text(),'OnePlus 10 Pro 5G')])[1]")).click();
		
		//Switch the control
		Set<String> winhin = chrome.getWindowHandles();
		List<String>window = new ArrayList <String>(winhin);
		chrome.switchTo().window(window.get(1));
		
		//Screenshot
		File screenshotAs = chrome.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snap/amazon.jpg");
        FileUtils.copyFile(screenshotAs, dest);
        
        //scroll down
        
        WebElement scroll = chrome.findElement(By.xpath("//span[text()='Add gift options']"));
        builder.moveToElement(scroll).perform();
        
        //Add to cart
        
        chrome.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        
        //sub-total
        Thread.sleep(2000);
        String tot = chrome.findElement(By.xpath("(//span[text()='₹66,999.00'])[6]")).getText();
        String subTotal = tot.replaceAll("[^0-9]","");
        
        //Verification
        String p1 = price;
		String p2 = p1.replaceAll("[^0-9]","");
		long result1 = Long.parseLong(p2);
		String p3 = subTotal;
		String p4 = p3.replaceFirst("₹","");
		String p5 = p4.replaceFirst(",","");
		long result = Math.round(66999.00);
		
		if(result==result1) {
			System.out.println("Prices are matched");
		}
        
		
	

	}


