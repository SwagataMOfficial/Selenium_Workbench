package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Add_To_Cart {
	
	public static void getConfirmation(WebDriver driver)
	{
		boolean conf = driver.findElement(By.xpath("//div[@id='bar-notification']")).isDisplayed();	// confirmation message
		
		
		if (conf) {
			driver.findElement(By.xpath("//li[@id='topcartlink']/a")).click();	// shopping cart
			driver.findElement(By.xpath("//input[@name='removefromcart']")).click();	// remove cart checkbox
			driver.findElement(By.xpath("//div[@class='common-buttons']/input[1]")).click();	// update cart button
			String remove_msg = driver.findElement(By.xpath("//div[@class='order-summary-content']")).getText();	// confirmation message logging
			
			System.out.println("\nConfirmation message: " + remove_msg + " (pass)");
		}
		else {
			System.out.println("\nConfirmation message is not displayed! (fail)");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO: end to end scenario on demowebshop
		
		String url = "https://demowebshop.tricentis.com/";
		
//		_____________________initial setup_______________________
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
				
//		____________________testing (confirmation message not displayed)____________________		
		
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click(); // apparel and shoes link
		
		driver.findElement(By.xpath("//div[@class='product-grid']/div[1]//div[@class='add-info']/div[2]/input")).click();	// add to cart button
		getConfirmation(driver);
		
//		____________________retesting (confirmation message displayed)____________________		
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//ul[@class='top-menu']/li[4]/a")).click(); // apparel and shoes link
		driver.findElement(By.xpath("//div[@class='product-grid']/div[3]//div[@class='add-info']/div[2]/input")).click();	// add to cart button
		Thread.sleep(2000);
		getConfirmation(driver);
		
//		____________________termination____________________	
		Thread.sleep(1000);
		driver.quit();

	}

}
