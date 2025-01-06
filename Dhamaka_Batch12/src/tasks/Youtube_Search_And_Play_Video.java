package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Search_And_Play_Video {

	public static void main(String[] args) throws InterruptedException {
		
//		TODO: write a script open youtube and search a video and play the video through automation
		
		String url = "https://www.youtube.com/";
		
//		___________________initial setup______________________
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("selenium tutorial for beginners");
		Thread.sleep(1500);
		driver.findElement(By.id("search-icon-legacy")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Selenium Tutorial for Beginners using Python | Selenium for Web Scraping (With Project)")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
