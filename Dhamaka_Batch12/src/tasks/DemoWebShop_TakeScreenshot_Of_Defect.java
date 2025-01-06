package tasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import generic.Browser;
import generic.Screenshot;

public class DemoWebShop_TakeScreenshot_Of_Defect {
	public static WebDriver driver;
	public static int count = 0;

	public static void capture() {
		TakesScreenshot tcs = (TakesScreenshot) driver;

		File src = tcs.getScreenshotAs(OutputType.FILE);
		count++;

		File target = new File("D:\\Selenium\\screenshots\\defect" + count + ".jpg");

		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
//		TODO: open demowebshop, do shopping, add a product to cart, if confirmation msg is not displayed
//		take screenshot, else add to cart, remove from cart

		driver = Browser.open("chrome");

		driver.get("https://demowebshop.tricentis.com/");

//		_______________shopping_______________

		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']")).click();

//		_______________demo code to check whether add to cart button defect is present or not_______________
		/*
		 * int size =
		 * driver.findElements(By.xpath("//div[@class='product-grid']/div")).size();
		 * 
		 * for (int i = 1; i <= size; i++) { try {
		 * driver.findElement(By.xpath("//div[@class='product-grid']/div[" + i +
		 * "]//input[@value='Add to cart']")); } catch (NoSuchElementException e) {
		 * capture(); } }
		 */

//		_______________check defect_______________
		driver.findElement(By.xpath("//div[@class='product-grid']/div[4]//input[@value='Add to cart']")).click();

//		try {
			if (driver.findElement(By.xpath("//p[@class='content']")).isDisplayed() && driver.findElement(By.xpath("//p[contains(.,'The product has been added to your')]")).isDisplayed()) {

//				_______________go to cart and remove the product_______________
				Thread.sleep(1500);
				driver.findElement(By.xpath("//li[@id='topcartlink']//a[@href='/cart']")).click();

				Thread.sleep(2000);
				driver.findElement(By.name("removefromcart")).click();
				driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();

			} else {
				Thread.sleep(2000);				
				System.out.println("Else Block: Capturing screenshot!!!!");
				Screenshot.capture(driver);
			}
//		}
//		catch (Exception e) {
//			Thread.sleep(2000);
//			System.out.println("Catch Block: Capturing screenshot!!!!");
//			Screenshot.capture(driver);
//		}

		Thread.sleep(2000);
//		driver.quit();
	}

}
