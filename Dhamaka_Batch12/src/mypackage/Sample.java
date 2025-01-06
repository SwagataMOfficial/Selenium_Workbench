package mypackage;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		String key = "webdriver.chrome.driver";
		String value = "./softwares/chromedriver.exe";
		System.setProperty(key, value);
		
//		String k1 = "webdriver.gecko.driver";
//		String v1 = "./softwares/geckodriver.exe";
//		System.setProperty(k1, v1);
		
		ChromeDriver driver = new ChromeDriver();
//		FirefoxDriver f = new FirefoxDriver();
		Thread.sleep(2000);
		driver.quit();
//		f.quit();
	}
}
