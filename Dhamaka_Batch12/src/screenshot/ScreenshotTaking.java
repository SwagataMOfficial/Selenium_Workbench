package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import generic.Browser;

public class ScreenshotTaking {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = Browser.open("chrome");
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tcs = (TakesScreenshot)driver;
		
		File src = tcs.getScreenshotAs(OutputType.FILE);
		
		File target = new File("D:\\Selenium\\screenshots\\defect1.jpg");
		
		FileHandler.copy(src, target);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
