package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demoapps.qspiders.com/ui/hidden");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form//input[1]")).sendKeys("Abcd");

		Thread.sleep(2000);
		driver.findElement(By.id("hiddendiv")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
