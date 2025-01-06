
package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class Instagram_Login_Using_Keyboard {

	public static void main(String[] args) throws InterruptedException {
//		TODO: In instagram, open un, pwd and login without selecting multiple webelement addresses and without click action
		
		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("", Keys.TAB, "", Keys.ENTER);
		
		
//		_____________________logout_______________________
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[@class=\"xl5mz7h xhuyl8g\"]//a[@href='#']")).click(); // hamburger button
		Thread.sleep(2500);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[8]")).click(); // logout button	
		
//		_____________________termination_______________________
		Thread.sleep(2000);
		driver.quit();

	}

}
