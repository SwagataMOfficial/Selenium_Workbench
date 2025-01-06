package childbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class PrintParentAndChildTabID {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.xpath("//div[.='Services']")).click();
		
		Set<String> parent_and_child_id = driver.getWindowHandles();
		
		System.out.println(parent_and_child_id);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
