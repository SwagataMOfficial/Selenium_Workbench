package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class ScrollToAPositionAndReturnBack {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.DEMOQA);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollBy(0,-500);");

		Thread.sleep(2000);
		driver.quit();

	}
}
