package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample6 {

	public static void main(String[] args) throws InterruptedException {
		String url = "file:///C:/Users/acer/Desktop/app.html";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.quit();

	}

}