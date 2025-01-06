package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class FileDownloadPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		
		Thread.sleep(4000);
		driver.findElement(By.id("writeArea")).sendKeys("Hi, my name is Swagata Mukherjee. I want to kill pinky!!!!");
		Thread.sleep(1500);
		driver.findElement(By.id("downloadButton")).click();

		Thread.sleep(2000);
		driver.quit();
	}
}
