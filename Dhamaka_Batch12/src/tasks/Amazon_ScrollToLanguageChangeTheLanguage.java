package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import generic.Browser;
import generic.Urls;

public class Amazon_ScrollToLanguageChangeTheLanguage {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.open("firefox");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Actions a = new Actions(driver);
		
		driver.get(Urls.AMAZON);
		
		Thread.sleep(2000);
		
		WebElement lang_drop = driver.findElement(By.id("icp-touch-link-language"));
		
		int y = lang_drop.getLocation().getY();
		js.executeScript("window.scrollBy(0, " + y + ");");
		
		Thread.sleep(1500);
		a.moveToElement(lang_drop).build().perform();
		Thread.sleep(2000);
		a.click(driver.findElement(By.xpath("(//a[@lang='kn-IN'])[2]"))).build().perform();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
