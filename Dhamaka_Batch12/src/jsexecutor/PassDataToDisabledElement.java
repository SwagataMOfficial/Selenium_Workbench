package jsexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class PassDataToDisabledElement {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(5000);
		js.executeScript("document.getElementById('a1').value = 'swagata'");

		Thread.sleep(2000);
		driver.quit();

	}
}
