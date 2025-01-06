package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class Fetch_Product_Name_Price_Rating {

	public static void main(String[] args) throws InterruptedException {
		// TODO: write a script to print all the product name and price using findElements
		
		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("hindi books", Keys.ENTER);
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='DOjaWF gdgoEp']//div[@class='cPHDOP col-12-12']/div/div"));
		
		int index = 1;
		System.out.println("Count : " + elements.size());
		for (WebElement element : elements) 
		{
			try {
				String rating = element.findElements(By.xpath("(//div[@class='_5OesEi afFzxY']//div[@class='XQDdHH'])[" + index + "]")).get(0).getText();
				String name = element.findElements(By.xpath("(//a[@class='wjcEIp'])[" + index + "]")).get(0).getText();
				String price = element.findElements(By.xpath("(//div[@class='Nx9bqj'])[" + index + "]")).get(0).getText();
				index++;
				
				System.out.println("Name: " + name);
				System.out.println("Price: " + price);
				System.out.println("Rating: " + rating);
				System.out.println("\n====================================================\n");
			} catch (Exception e) {
				System.out.print("");
			}
		}
		
		Thread.sleep(1500);
		driver.quit();
	}

}