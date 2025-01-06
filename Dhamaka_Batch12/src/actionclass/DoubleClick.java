package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class DoubleClick {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.open("firefox");
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.doubleClick(button).build().perform();
	
		Thread.sleep(2000);
		driver.quit();
	}
}
