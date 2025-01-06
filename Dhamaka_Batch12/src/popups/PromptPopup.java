package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class PromptPopup {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();

		
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("yes");
		
		Thread.sleep(3500);
		a.accept();
//		a.dismiss();

		String text = driver.findElement(By.xpath("//section[@class='w-4/12']/p")).getText();
		System.out.println(text);

		Thread.sleep(2000);
		driver.quit();
	}
}