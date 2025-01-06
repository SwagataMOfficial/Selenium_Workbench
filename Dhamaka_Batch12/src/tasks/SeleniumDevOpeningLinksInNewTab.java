package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class SeleniumDevOpeningLinksInNewTab {
	
	public static void openInNewTab(WebElement arg0, Actions act, Robot r) throws AWTException
	{	
		act.contextClick(arg0).build().perform();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
//		TODO: open selenium.dev, right click on each of the links in the nav, open them in new tab
		
		WebDriver driver = Browser.open("chrome");
		Actions act = new Actions(driver);
		Robot r = new Robot();
		driver.get("https://www.selenium.dev/");

		openInNewTab(driver.findElement(By.xpath("//a[@href='/downloads']")), act, r);
		openInNewTab(driver.findElement(By.xpath("//a[@href='/documentation']")), act, r);
		openInNewTab(driver.findElement(By.xpath("//a[@href='/projects']")), act, r);
		openInNewTab(driver.findElement(By.xpath("//a[@href='/support']")), act, r);
		openInNewTab(driver.findElement(By.xpath("//a[@href='/blog']")), act, r);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
