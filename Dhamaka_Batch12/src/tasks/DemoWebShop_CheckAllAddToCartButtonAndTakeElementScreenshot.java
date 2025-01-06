package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;
import generic.Screenshot;
import generic.Urls;

public class DemoWebShop_CheckAllAddToCartButtonAndTakeElementScreenshot {
	static WebDriver driver;
	
	public static void checkDefect() throws InterruptedException {
		int size = driver.findElements(By.xpath("//div[@class='product-grid']/div")).size();

		for (int i = 1; i <= size; i++)
		{
			try {
				driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]//input[@value='Add to cart']"));
			} catch (NoSuchElementException e)
			{
				Thread.sleep(2000);
//				System.out.println("Index: " + i);
				Screenshot.capture(driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]")));
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

//		TODO: open demowebshop, check all the add to cart button, if not there,
//		take screenshot, click on next button, take more screenshot.

		driver = Browser.open("chrome");
		driver.get(Urls.DEMOWEBSHOP);

//		_______________shopping_______________

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']")).click();

//		_______________check defect_______________
		checkDefect();
		
//		_______________check defect in next page_______________
		WebElement nextbtn = driver.findElement(By.xpath("//a[.='Next']"));
		
		while(nextbtn.isEnabled())
		{
			nextbtn.click();
			checkDefect();
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
