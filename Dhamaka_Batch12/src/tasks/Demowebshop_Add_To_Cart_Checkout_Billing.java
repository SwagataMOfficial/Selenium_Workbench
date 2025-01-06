package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demowebshop_Add_To_Cart_Checkout_Billing {

	public static void main(String[] args) throws InterruptedException {
//		TODO: write a script for the given end-to-end scenarios

//		___________________important variables______________________
		String url = "https://demowebshop.tricentis.com/";
		String em = "swagataemail78202@gmail.com";
		String pwd = "abcd@12340987";
		
//		___________________initial setup______________________
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
				
//		___________________adding to cart______________________
		driver.findElement(By.id("add-to-cart-button-28")).click();
		driver.findElement(By.linkText("ico-cart")).click();

//		___________________editing quantity______________________
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("addtocart_28.EnteredQuantity")).sendKeys("5");

//		___________________checkout______________________
		driver.findElement(By.id("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();		
		
//		___________________billing______________________
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Swagata");
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Mukherjee");
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("swagatamukherjee@gmail.com");
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Accenture");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kolkata");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Kolkata 700000");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Sector V, Kolkata");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("700121");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("AJCVJ8q7eq");

//		___________________script termination______________________
		driver.findElement(By.className("ico-logout")).click();		
		Thread.sleep(2500);
		driver.quit();
	}

}
