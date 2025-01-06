package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextAndPartialDemo {

	public static void main(String[] args) throws InterruptedException {

		String url = "file:///C:/Users/acer/Desktop/app.html";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		driver.findElement(By.linkText("Github")).click();
		
		driver.get(url);
		driver.findElement(By.partialLinkText("Facebook")).click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
