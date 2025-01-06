package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample7 {

	public static void main(String[] args) throws InterruptedException {
		String url = "file:///C:/Users/acer/Desktop/app.html";
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(url);
		String c_url = driver.getCurrentUrl();
		System.out.println(c_url);
		
		Thread.sleep(2000);
		driver.quit();

	}

}