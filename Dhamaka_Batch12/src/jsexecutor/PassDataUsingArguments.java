package jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class PassDataUsingArguments {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.MYHTML);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Swagata Mukherjee';", driver.findElement(By.xpath("//input")));

		Thread.sleep(2000);
		driver.quit();

	}
}
