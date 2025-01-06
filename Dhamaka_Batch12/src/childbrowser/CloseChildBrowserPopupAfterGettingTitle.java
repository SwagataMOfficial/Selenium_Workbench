package childbrowser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class CloseChildBrowserPopupAfterGettingTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");

		driver.get("https://www.naukri.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[.='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> a = new ArrayList<String>(ids);
		
		driver.switchTo().window(a.get(1));
		
		System.out.println(driver.getTitle());

		
		Thread.sleep(2000);
		driver.close();
		
		driver.quit();

	}

}
