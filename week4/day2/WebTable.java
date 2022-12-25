package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disbale-notifications");
		
		
		ChromeDriver chrome = new ChromeDriver(option);
		chrome.get("https://erail.in/");
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//FromStation
		WebElement stationFrom = chrome.findElement(By.id("txtStationFrom"));
		stationFrom.clear();
		stationFrom.sendKeys("ms",Keys.TAB);
		
		//ToStation
		WebElement stationTo = chrome.findElement(By.id("txtStationTo"));
		stationTo.clear();
		stationTo.sendKeys("mdu",Keys.TAB);
		
		//Uncheck the date
		chrome.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		//
		List<WebElement> findElements = chrome.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		int size = findElements.size();
		System.out.println(size);
		
		Set<String> trainName = new LinkedHashSet <String> ();
		
		for(int i=2;i<size;i++) {
			
			
			String text = chrome.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			trainName.add(text);
			
			
		}
		if(size!=trainName.size()) {
			System.out.println("Duplicate Train is Present");
			System.out.println(trainName);
		}
		else {
			System.out.println("Unique Train Number");
			System.out.println(trainName);
		}
		

	}

}
