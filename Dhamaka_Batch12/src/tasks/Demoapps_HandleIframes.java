package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class Demoapps_HandleIframes {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open demoapps, go to frames, handle multiple frames

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.DEMOAPPS + "ui/frames/nested?sublist=1");
		Thread.sleep(10000);

		try {
//			_______________Handling main frame_______________
			driver.switchTo().frame(0);
			String v1 = driver.findElement(By.xpath("//p[@class='para'][1]")).getText();
			String v2 = driver.findElement(By.xpath("//p[@class='para'][2]")).getText();
			String v3 = driver.findElement(By.xpath("//p[@class='para'][3]")).getText();

//			_______________Handling child frame_______________
			driver.switchTo().frame(0);

			driver.findElement(By.id("email")).sendKeys(v1);
			driver.findElement(By.id("password")).sendKeys(v2);
			driver.findElement(By.id("confirm-password")).sendKeys(v3);
			driver.findElement(By.id("submitButton")).click();

//			_______________checking if success message is displayed_______________
			driver.switchTo().defaultContent();
			Thread.sleep(500);

			try {
				if ((driver.findElement(By.xpath("//div[@role='status']")).isDisplayed())
						&& driver.findElement(By.xpath("//div[.='Sign up successful!']")).isDisplayed()) {
					System.out.println("Displayed!");
				} else {
					System.out.println("Not displayed!");
				}

			} catch (NoSuchElementException e) {
				System.out.println("Not Displayed!");
			}

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Error!");
		} finally {
			Thread.sleep(2000);
			driver.quit();
		}

	}

}
