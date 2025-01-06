package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameSelection1 {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "file:///C:/Users/acer/Desktop/app.html";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		driver.findElement(By.tagName("input")).sendKeys("selenium");
		driver.findElement(By.name("pwd")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		driver.findElement(By.id("google_link")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
