package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import generic.Browser;
import generic.Urls;

public class Demoapps_HandleIMultipleframes {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open demoapps, go to frames, handle multiple frames

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.DEMOAPPS + "ui/frames/multiple?sublist=2");

		try {
//			_______________Getting signup values_______________
			String v1 = driver.findElement(By.xpath("//article[@class='leading-7 mt-2 text-base w-1/2']/p[1]"))
					.getText().replaceAll("Email:", "");
			String v2 = driver.findElement(By.xpath("//article[@class='leading-7 mt-2 text-base w-1/2']/p[2]"))
					.getText().replaceAll("Password : ", "");
			String v3 = driver.findElement(By.xpath("//article[@class='leading-7 mt-2 text-base w-1/2']/p[3]"))
					.getText().replaceAll("Confirm Password : ", "");

//			_______________Handling 1st frame_______________
			driver.switchTo().frame(0);

			driver.findElement(By.id("email")).sendKeys(v1);
			driver.findElement(By.id("password")).sendKeys(v2);
			driver.findElement(By.id("confirm-password")).sendKeys(v3);
			driver.findElement(By.id("submitButton")).click();

//			_______________checking if success message is displayed (main frame switching required)_______________
			driver.switchTo().defaultContent();
			Thread.sleep(500);

			try {
				if ((driver.findElement(By.xpath("//div[@role='status']")).isDisplayed())
						&& driver.findElement(By.xpath("//div[.='Sign up successful!']")).isDisplayed()) {
					System.out.println("Signup Displayed!");
				} else {
					System.out.println("Signup Not displayed!");
				}

			} catch (NoSuchElementException e) {
				System.out.println("Signup Not Displayed!");
			}

//			_______________Handling 2nd frame_______________
			String v4 = driver.findElement(By.xpath("//article[@class='ms-20 leading-7 mt-6 text-base w-1/2']/p[1]"))
					.getText().replaceAll("Email:", "");
			String v5 = driver.findElement(By.xpath("//article[@class='ms-20 leading-7 mt-6 text-base w-1/2']/p[1]"))
					.getText().replaceAll("Password : ", "");

			driver.switchTo().frame(1);
			driver.findElement(By.id("username")).sendKeys(v4);
			driver.findElement(By.id("password")).sendKeys(v5);
			driver.findElement(By.id("submitButton")).click();

			driver.switchTo().defaultContent();
			Thread.sleep(500);

			try {
				if ((driver.findElement(By.xpath("//div[@role='status']")).isDisplayed())
						&& driver.findElement(By.xpath("//div[.='Login successful!']")).isDisplayed()) {
					System.out.println("Login Displayed!");
				} else {
					System.out.println("Login Not displayed!");
				}

			} catch (NoSuchElementException e) {
				System.out.println("Login Not Displayed!");
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
