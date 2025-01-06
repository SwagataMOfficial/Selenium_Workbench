package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import generic.Browser;
import generic.Urls;

public class ScrollToAParticularElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("firefox");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get(Urls.AMAZON);
		
		Thread.sleep(2000);
 		js.executeScript("window.scrollBy(0, " + driver.findElement(By.id("icp-touch-link-language")).getLocation().getY() + ");");
		
		Thread.sleep(5000);
		driver.quit();

	}

}
