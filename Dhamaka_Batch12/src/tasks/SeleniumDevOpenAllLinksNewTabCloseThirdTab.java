package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class SeleniumDevOpenAllLinksNewTabCloseThirdTab {

	public static void openInNewTab(WebElement arg0, Actions act, Robot r) throws AWTException
	{	
		act.contextClick(arg0).build().perform();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO: go to selenium official page, open all the links in new tab, close 3rd tab
		
		WebDriver driver = Browser.open("chrome");
		Actions act = new Actions(driver);
		Robot r = new Robot();
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']//a"));
		
		for (WebElement link : links) {
			openInNewTab(link, act, r);
		}
		
		List<String> l = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(2));
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.quit();

	}

}
