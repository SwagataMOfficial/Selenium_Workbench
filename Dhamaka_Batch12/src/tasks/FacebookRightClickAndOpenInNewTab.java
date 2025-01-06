package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class FacebookRightClickAndOpenInNewTab {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open facebook, click on any language, right click and click on 't' in keyboard

		WebDriver driver = Browser.open("chrome");
		Robot robot;
		try {
			robot = new Robot();

			driver.get("https://www.facebook.com/");

			WebElement hindi = driver.findElement(By.xpath("//a[@title='Hindi']"));

			Actions act = new Actions(driver);

			act.moveToElement(hindi).build().perform();
			Thread.sleep(1000);
			act.contextClick(hindi).build().perform();
			Thread.sleep(2000);

			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);

			Thread.sleep(10000);
			driver.quit();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}