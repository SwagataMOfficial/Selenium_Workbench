package hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Screenshot;
import generic.Urls;

public class DemoWebShop_AddProductToCartAndFindDefects {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open demowebshop, add all product to cart, check whether all products are added and look for out of stock product, if not then take screenshot and keep filename as the product Name
		
		WebDriver driver = Browser.open("chrome");
		
		driver.get(Urls.DEMOWEBSHOP);

//		_______________shopping_______________

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']")).click();
		String title = driver.getTitle();

		int size = driver.findElements(By.xpath("//div[@class='product-grid']/div")).size();

		for (int i = 1; i <= size; i++)
		{
			try {
				driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]//input[@value='Add to cart']")).click();
				Thread.sleep(2000);
				String newTitle = driver.getTitle();
				
				if(newTitle.equals(title) == false)
				{
					driver.navigate().back();
					Thread.sleep(3000);
					Screenshot.capture(driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]")));
				}
				else 
				{
					Thread.sleep(1500);
					if(driver.findElement(By.id("bar-notification")).isDisplayed())
					{
						Screenshot.capture(driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]")));
					}
				}

			} 
			catch (Exception e)
			{
				Thread.sleep(2000);
				Screenshot.capture(driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i + "]")));
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
