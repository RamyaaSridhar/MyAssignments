/*01) Launch https://login.salesforce.com/ 
 * 02) Login to Salesforce with your username and password
 * 03) Click on the App Launcher (dots)
 * 04) Click View All
 * 05) Type Content on the Search box
 * 06) Click Content Link
 * 07) Click on Chatter Tab
 * 08) Verify Chatter title on the page
 * 09) Click Question tab
 * 10) Type Question with data (coming from excel)
 * 11) Type Details with data (coming from excel)
 * 12) Click Ask
 * 13) Confirm the question appears
 * 14) Close the browser
*/

package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForce_Question extends BaseClass {

	
	
	@Test(dataProvider="questions")
	public void questionTC(String quest, String detail) {
		WebElement findElement = chrome.findElement(By.xpath("//a[@title='Chatter']"));
		chrome.executeScript("arguments[0].click()",findElement);
		String title = chrome.getTitle();
		if(title.contains("Chatter Home |")) {
			System.out.println("Title is verified Successfully");
		}
		
		chrome.findElement(By.xpath("//a[@title='Question']")).click();
		chrome.findElement(By.xpath("//textarea[@placeholder='What would you like to know?']")).sendKeys(quest);
		chrome.findElement(By.xpath("//div[@data-placeholder='If you have more to say, add details here...']")).sendKeys(detail);
		chrome.findElement(By.xpath("//button[@title='Click, or press Ctrl+Enter']")).click();
		
	}
	
	@DataProvider(name="questions")
	public String[][] testdata() throws IOException {
		
		String[][] questionaskTC = QuestionAsk.questionaskTC();
		return questionaskTC;
		

	}

}
