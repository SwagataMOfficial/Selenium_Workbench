package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.chatgpt.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
