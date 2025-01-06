package implicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import generic.Browser;
import generic.Urls;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.SHOPPERSSTACK);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.quit();

	}

}
