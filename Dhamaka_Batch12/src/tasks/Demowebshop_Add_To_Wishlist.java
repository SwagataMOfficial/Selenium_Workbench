package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop_Add_To_Wishlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO: write a script for the given end-to-end scenarios
		
		String url = "https://demowebshop.tricentis.com/";
		String em = "swagataemail78202@gmail.com";
		String pwd = "abcd@12340987";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(em);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.className("login-button")).click();
		
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		driver.findElement(By.className("ico-logout")).click();
		
		Thread.sleep(2500);
		driver.quit();

	}

}
