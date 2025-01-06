package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import generic.Browser;
import generic.Urls;

public class Myntra_FilterProductsSelectFirstProductAddToCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.open("chrome");
		Actions a = new Actions(driver);

		driver.get(Urls.MYNTRA);

		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("puma shoes", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Price: High to Low']")).click();
		driver.findElement(By.xpath("//label[.='Price: High to Low']")).click();
		
		Thread.sleep(2000);
		
		a.moveToElement(driver.findElement(By.xpath("//ul[@class='results-base']/li[1]"))).build().perform();
		a.click(driver.findElement(By.xpath("//ul[@class='results-base']/li[1]//span[.='wishlist']"))).build().perform();		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}
