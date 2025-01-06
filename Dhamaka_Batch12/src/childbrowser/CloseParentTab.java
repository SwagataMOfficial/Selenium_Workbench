package childbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class CloseParentTab {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.naukri.com/");
		String p_id = driver.getTitle();
		System.out.println(p_id);
		
		driver.findElement(By.xpath("//div[.='Services']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		
		for (String id : ids) {
			driver.switchTo().window(id);
			driver.getTitle();
			
			if(p_id.equals(id))
			{
				driver.close();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
				
	}

}
