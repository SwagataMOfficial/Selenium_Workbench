package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebShop_Register_Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO: write a script to click on register button, fill the form and register, click on login and login
		
		String url = "https://demowebshop.tricentis.com/";
		String em = "swagataemail78202@gmail.com";
		String pwd = "abcd@12340987";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys("Swagata");
		driver.findElement(By.id("LastName")).sendKeys("Mukherjee");
		driver.findElement(By.id("Email")).sendKeys(em);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pwd);
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.className("ico-logout")).click();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(em);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.className("login-button")).click();		
		
		driver.findElement(By.className("ico-logout")).click();
		
		driver.quit();

	}

}
