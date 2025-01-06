package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.instagram.com");
		String source = driver.getPageSource();
		System.out.println(source);
		driver.quit();

	}

}
