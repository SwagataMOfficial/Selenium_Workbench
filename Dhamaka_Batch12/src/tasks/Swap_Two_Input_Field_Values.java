package tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class Swap_Two_Input_Field_Values {

	public static void main(String[] args) throws InterruptedException {
//			TODO: swap 2 input values by using 3rd input fields
		
			WebDriver driver = Browser.open("chrome");
			
			driver.get("file:///D:/app.html");
			
			WebElement f1 = driver.findElement(By.name("f1"));
			WebElement f2 = driver.findElement(By.name("f2"));
			WebElement f3 = driver.findElement(By.name("temp"));
			Thread.sleep(1500);
			
//			_______________1st element_______________
			f1.sendKeys(Keys.CONTROL+"ax");
			f3.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(1500);
			
//			_______________2nd element_______________
			f2.sendKeys(Keys.CONTROL+"ax");			
			f1.sendKeys(Keys.CONTROL+"v");
			Thread.sleep(1500);
			f3.sendKeys(Keys.CONTROL+"ax");
			f2.sendKeys(Keys.CONTROL+"v");
			
			Thread.sleep(2500);
			driver.quit();

	}

}
