package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 {

	public static void main(String[] args) {
//		TODO: x-path validation
		String url = "file:///C:/Users/acer/Desktop/app.html";
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("check-1")).click();
		driver.findElement(By.id("check-2")).click();
		driver.findElement(By.id("male")).click();
		driver.findElement(By.id("female")).click();

	}

}
