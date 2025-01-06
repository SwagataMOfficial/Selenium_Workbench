package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.open("firefox");
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement button = driver.findElement(By.xpath("//span[.='right click me']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.contextClick(button).build().perform();
	
		Thread.sleep(2000);
		driver.quit();
	}

}
