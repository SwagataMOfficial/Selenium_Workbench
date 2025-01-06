package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class CheckAllLinksAreWorking {

	public static void main(String[] args) throws InterruptedException {
//		TODO: write a script to check whether all the links are working or not.

		String url = "https://www.facebook.com/";
		WebDriver driver = Browser.open("chrome");
		driver.get(url);
		String title = driver.getTitle();
		int notworkinglinkcount = 0;
		int count = driver.findElements(By.xpath("//a")).size();

		for (int i = 1; i <= count; i++) {
			WebElement elm = driver.findElement(By.xpath("//a[" + i + "]"));
			String link = elm.getAttribute("href");
			System.out.println(elm);
			if (!link.equals("https://www.facebook.com/#") && elm.isEnabled()) {
				System.out.println(i);
				driver.findElement(By.xpath("//a[" + i + "]")).click();
				driver.get(link);
				String title2 = driver.getTitle();

				if (title2.equals(title)) {
					System.out.println(title);
				} else {
					System.out.println("Link `" + link + "` is not working!");
				}

				Thread.sleep(2000);
				driver.get(url);
			}
			else {
				notworkinglinkcount++;
			}
		}
		
		System.out.println("No. of links not working: " + notworkinglinkcount);

		Thread.sleep(2000);
		driver.quit();

	}

}
