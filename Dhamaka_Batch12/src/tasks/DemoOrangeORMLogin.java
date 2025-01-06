package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;

public class DemoOrangeORMLogin {

	public static void main(String[] args) throws InterruptedException {
//		TODO: demoorangeorm login and check confirmation msg
		
		WebDriver driver = Browser.open("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		
//		---------------login---------------
		driver.findElement(By.name("username")).sendKeys(driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[1]")).getText().replaceAll("Username : ", ""));
		driver.findElement(By.name("password")).sendKeys(driver.findElement(By.xpath("(//p[@class='oxd-text oxd-text--p'])[2]")).getText().replaceAll("Password : ", ""));
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		
//		---------------adding employee---------------
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='PIM']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.name("firstName")).sendKeys("Voda");
		driver.findElement(By.name("lastName")).sendKeys("Fone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		if (driver.findElement(By.xpath("//node()[.='Successfully Saved']")).isDisplayed()) {
			System.out.println("Confirmation Message is displayed");
		} else {
			System.out.println("Confirmation Message is not displayed");
		}
		
//		---------------termination---------------
		Thread.sleep(5000);
		driver.quit();

	}

}
