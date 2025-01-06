package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class HandlingNestedMultipleFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);
		driver.findElement(By.id("i0")).sendKeys("Selenium");
		driver.switchTo().frame(0);
		driver.findElement(By.id("i3")).sendKeys("API");
		driver.switchTo().frame(0);
		driver.findElement(By.id("i4")).sendKeys("Java");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("i5")).sendKeys("Manual");

		Thread.sleep(2000);
		driver.quit();
	}

}
