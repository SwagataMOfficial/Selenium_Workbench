package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Like_Reel_In_Instagram {

	public static void main(String[] args) throws InterruptedException {
		// TODO: go to instagram, go to reels, like the first video, if it is mute then unmute otherwise mute
		
		String url = "https://www.instagram.com/";
		String id = "";
		String pass = "";
		
//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
//		_____________________login_______________________
		driver.findElement(By.name("username")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(2000);
//		_____________________reels_______________________
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Reels']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Audio is muted']")).click();
		
		/*
//		_____________________logout_______________________
		Thread.sleep(20000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/span/div/a")).click(); // hamburger button
		Thread.sleep(1500);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[8]")).click(); // logout button	
		*/
//		_____________________termination_______________________
		Thread.sleep(5000);
		driver.quit();

	}

}