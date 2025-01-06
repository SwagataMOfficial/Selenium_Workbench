package childbrowser;

import org.openqa.selenium.WebDriver;

import generic.Browser;

public class PrintParentTabID {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.naukri.com/");
		String parentId = driver.getWindowHandle();
		
		System.out.println(parentId);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
