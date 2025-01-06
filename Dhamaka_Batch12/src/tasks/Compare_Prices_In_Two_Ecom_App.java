package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class Compare_Prices_In_Two_Ecom_App {
		
	public static void compare(String s1, String s2)
	{
		s1 = s1.replaceAll(",", "");
		s1 = s1.replace("₹", "");
		s2 = s2.replaceAll(",", "");
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		
		if(p1 == p2) {
			System.out.println("Both Amazon and Flipkart Prices are same");
		}
		else {
			if(p1 > p2) {
				System.out.println("Flipkart price is more!");
			}
			else {
				System.out.println("Amazon price is more!");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
//		TODO: search a product in 2 different ecommerce domain and compare the prices and display which one is more

//		_______________opening amazon_______________

		WebDriver amazon = Browser.open("firefox");
		amazon.get("https://www.amazon.in/");

//		_______________important variables_______________
		String search = "iphone 15 pro black";

//		_______________searching a product_______________

		// amazon
		amazon.findElement(By.id("twotabsearchtextbox")).sendKeys(search);
		amazon.findElement(By.id("nav-search-submit-button")).click();

		Thread.sleep(5000);
		String iphonePrice_a = amazon.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (1 TB) - Black Titanium']/../../../../div[3]//span[@class='a-price']//span[@class='a-price-whole']")).getText();

//		_______________opening flipkart_______________
		
		WebDriver flipkart = Browser.open("chrome");
		flipkart.get("https://www.flipkart.com/");
		
		// flipkart
		flipkart.findElement(By.name("q")).sendKeys(search, Keys.ENTER);

//		// NOTE: if login popup is displayed then dismiss the package
//		Thread.sleep(2000);
//		if (flipkart.findElement(By.xpath("//div[@class='fbDBuK _3CYmv5']")).isDisplayed()) {
//			flipkart.findElement(By.xpath("//span[@role='button']")).click();
//		}
		
		Thread.sleep(5000);
		String iphonePrice_f = flipkart.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro (Black Titanium, 1 TB)']/../../div[2]//div[@class='Nx9bqj _4b5DiR']")).getText();
		
		compare(iphonePrice_f, iphonePrice_a);

//		_______________termination_______________
		Thread.sleep(3000);
		flipkart.quit();
		amazon.quit();
				
	}

}
