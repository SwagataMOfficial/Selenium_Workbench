package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class HandlingSingleFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);
		
		driver.findElement(By.id("i0")).sendKeys("Selenium");
		driver.switchTo().frame(0);
		driver.findElement(By.id("i5")).sendKeys("API");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
