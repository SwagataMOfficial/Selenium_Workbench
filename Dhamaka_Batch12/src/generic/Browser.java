package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	static WebDriver driver;

	public static WebDriver open(String browser) {
		if (browser.toLowerCase().equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.toLowerCase().equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.err.println("Wrong browser specified");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		return driver;
	}
}
