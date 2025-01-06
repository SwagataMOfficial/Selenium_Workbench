package tasks;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class MyntraSelectAProductAddToCartAndRemove {

	public static void main(String[] args) throws InterruptedException {
//		TODO: in myntra, select a product, handle child browser, add to cart, remove from cart.

		WebDriver driver = Browser.open("chrome");
		driver.get("https://www.myntra.com/");

		WebElement myntra = driver.findElement(By.xpath("//a[text()='Men']"));
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.moveToElement(myntra).build().perform();
		Thread.sleep(2000);
		
		WebElement sportsshoes = driver.findElement(By.xpath("(//a[text()='Sports Shoes'])[2]"));
		Thread.sleep(2000);
		
		act.click(sportsshoes).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[3]")).click();
		Thread.sleep(1000);
		
		ArrayList<String> l = new ArrayList<>(driver.getWindowHandles());
		Thread.sleep(2000);
		
		driver.switchTo().window(l.get(1));

		int size = driver.findElements(By.xpath("//div[@id='sizeButtonsContainer']//button")).size();
		
		for (int i = 2; i <= size; i++)
		{
			WebElement element = driver.findElement(By.xpath("(//div[@id='sizeButtonsContainer']//button)["+i+"]"));
			if (element.isEnabled()) {
				element.click();
				break;
			} 
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/checkout/cart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[text()='MOVE TO WISHLIST'])[2]")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
