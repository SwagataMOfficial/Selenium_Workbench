package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.open("firefox");
		
		driver.get("https://www.amazon.in/");
		
		WebElement prime = driver.findElement(By.xpath("//span[.='Prime']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.moveToElement(prime).build().perform();
	
		Thread.sleep(2000);
		driver.quit();
		
	}

}
