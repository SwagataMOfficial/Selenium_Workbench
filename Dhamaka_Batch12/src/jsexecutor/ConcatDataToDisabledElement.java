package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class ConcatDataToDisabledElement {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		js.executeScript("document.getElementById('a1').value += 'efg'");

		Thread.sleep(2000);
		driver.quit();

	}
}
