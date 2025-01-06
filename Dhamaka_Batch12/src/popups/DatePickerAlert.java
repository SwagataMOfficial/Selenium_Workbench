package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class DatePickerAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='11']")).click();

		Thread.sleep(2000);
		driver.quit();
	}
}
