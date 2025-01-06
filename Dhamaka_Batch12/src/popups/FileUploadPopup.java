package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		Thread.sleep(4000);
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\acer\\Pictures\\old_Screenshots_new\\Screenshot (1).png");		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
