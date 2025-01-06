package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class ClearDataToDisabledElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('a1').value = ''");

		Thread.sleep(2000);
		driver.quit();

	}
}
