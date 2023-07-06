/*1. Login to https://gin.salesforce.co
 * 2. Click on toggle menu button from the left corner
 * 3. Click view All  TCntent othe Seac\h bo
 * 4. Click on Conten lin
 * 5. Click View All Key Deals i Key eals 
 * 6. Click the dropdown from Opportunities nd select All Opportunities
 * 7. Click on 
 * 8. Give Opportunity Name  (From Exce
 * 9. Select Type as Nw Customer and Lead Source as Partner Referral
 * 10. Give Amount as 75000 (from Excel)
 * 11. Select Close Date as Next month 20th da
 * 12. Select Stage as Needs Analys
 * 13. Click in Primary Campaign  Source and Select first option
 * 14. Click Save and Verify the opportunity is created"
 * 15.Close the browser*/
package marathon3;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Opportunity extends BaseClass {


	@Test(dataProvider = "input")
	public  void opportunity(String name, String amount) throws InterruptedException {
		chrome.findElement(By.xpath("//span[text()='View All Key Deals']")).click();
		chrome.findElement(By.xpath("//a[@title ='New']")).click();
		chrome.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		chrome.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		chrome.findElement(By.xpath("//span[text()='New Customer']")).click();
		WebElement findElement2 = chrome.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		chrome.executeScript("arguments[0].click();", findElement2);
		chrome.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		Thread.sleep(3000);
		chrome.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(amount);
		chrome.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("2/20/2023");
		chrome.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		chrome.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
		chrome.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[2]")).click();
		chrome.findElement(By.xpath("//span[text()='test']")).click();
		chrome.findElement(By.xpath("//button[text()='Save']")).click();

	}
	
	@DataProvider(name="input")
	public String[][] namAmount() throws IOException {
		
		String[][] oppor = Opporunity_Data.oppor();
		return oppor;

	}

}
