package childbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class FetchParentAndChildTitles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//div[.='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
