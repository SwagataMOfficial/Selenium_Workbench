package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Map_Find_Direction {

	public static void main(String[] args) throws InterruptedException {
//		TODO: checking direction in google maps

		String url = "https://www.google.com/maps/";

//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
//		____________________searching destination____________________
			driver.findElement(By.id("hArJGc")).click();	// directions button
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[8]/div[3]/div[1]/div[2]/div/div[3]/div[1]/div[1]/div[2]/div[1]/div/input")).sendKeys("bally halt");	// starting point input
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='directions-searchbox-0']/button[1]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='sb_ifc51']/input")).sendKeys("qspiders");	// ending point input
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id='directions-searchbox-1']/button[1]")).click();
//			Thread.sleep(1500);
			
			Thread.sleep(5000);
			driver.quit();

	}

}