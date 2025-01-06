package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Browser;
import generic.Dropdown;

public class DemoWebShop_Dropdown_Handle_ProductSelect_Add_Remove_FromCart {

	public static void main(String[] args) throws InterruptedException {
//		TODO: handle all the dropdowns and add a product to cart then remove the product from cart

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demowebshop.tricentis.com/");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[@href='/apparel-shoes']")).click();
		
		Select s = Dropdown.create(driver.findElement(By.id("products-orderby")));		
		s.selectByVisibleText("Price: Low to High");
		Thread.sleep(1000);
		Select s1 = Dropdown.create(driver.findElement(By.id("products-pagesize")));
		s1.selectByIndex(2);
		Thread.sleep(1000);
		Select s2 = Dropdown.create(driver.findElement(By.id("products-viewmode")));
		s2.selectByIndex(1);
		
		driver.findElement(By.xpath("//div[@class='product-list']/div[1]//input[@value='Add to cart']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//li[@id='topcartlink']//a[@href='/cart']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
