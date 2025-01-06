package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop_Add_To_Cart_Checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO: write a script for the given end-to-end scenarios
		
		String url = "https://demowebshop.tricentis.com/";
		String em = "swagataemail78202@gmail.com";
		String pwd = "abcd@12340987";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
//		___________________login______________________
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(em);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.className("login-button")).click();
		
//		___________________selecting product______________________
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		driver.findElement(By.linkText("Blue and green Sneaker")).click();
		driver.findElement(By.id("add-to-wishlist-button-28")).click();
		driver.findElement(By.name("addtocart")).click();
		driver.findElement(By.name("addtocartbutton")).click();

//		___________________checkout______________________
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		
//		___________________script termination______________________
		driver.findElement(By.className("ico-logout")).click();		
		Thread.sleep(2500);
		driver.quit();

	}

}
