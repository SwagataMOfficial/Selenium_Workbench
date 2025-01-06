package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		
		a.accept();
//		a.dismiss();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
