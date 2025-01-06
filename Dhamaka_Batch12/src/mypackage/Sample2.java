package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
//		firefox-youtube
//		chrome-facebook
		
		WebDriver fd = new FirefoxDriver();
		WebDriver cd = new ChromeDriver();
		
		fd.get("https://www.youtube.com");
		cd.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		fd.quit();
		cd.quit();
	}
}
