package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import generic.Browser;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.open("firefox");
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[.=' 5000 ']"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		WebElement src1 = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.dragAndDrop(src, target).build().perform();
		Thread.sleep(1500);
		act.dragAndDrop(src1, target1).build().perform();
	
		Thread.sleep(2000);
		driver.quit();
	}

}
